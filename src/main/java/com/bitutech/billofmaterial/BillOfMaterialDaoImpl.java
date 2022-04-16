package com.bitutech.billofmaterial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bitutech.core.util.DropDownList;

@Repository
public class BillOfMaterialDaoImpl implements BillOfMaterialDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public BillOfMaterialResultBean save(BillOfMaterialHdrObjBean bean) throws Exception {
		BillOfMaterialResultBean resultBean = new BillOfMaterialResultBean();
		try {
			Map<String, Object> bomMap = new HashMap<>();
			bomMap.put("workorderNo",bean.getWorkorderNo());
			
			namedParameterJdbcTemplate.update(BillOfMaterialQueryUtil.Insert_Bom,bomMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public BillOfMaterialResultBean getList() throws Exception {
		List<BillOfMaterialHdrObjBean> objMasterBean = new ArrayList<>();
		BillOfMaterialResultBean bomResultBean = new BillOfMaterialResultBean();
		bomResultBean.setSuccess(false);
		try {
			objMasterBean = jdbcTemplate.query(BillOfMaterialQueryUtil.getList, new BeanPropertyRowMapper<BillOfMaterialHdrObjBean>(BillOfMaterialHdrObjBean.class));
			bomResultBean.setBomDetails(objMasterBean);
			bomResultBean.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			bomResultBean.setSuccess(false);
		}
		return bomResultBean;
	}

	@Override
	public BillOfMaterialResultBean getWorkOrderList() throws Exception {
		// TODO Auto-generated method stub
		List<DropDownList> salesOrderNoList = new ArrayList<>();
		BillOfMaterialResultBean bomResultBean = new BillOfMaterialResultBean();
		bomResultBean.setSuccess(false);
		try {
			salesOrderNoList = jdbcTemplate.query(BillOfMaterialQueryUtil.getSalesOrderNoList, new BeanPropertyRowMapper<DropDownList>(DropDownList.class));
			bomResultBean.setWorkOrderNoList(salesOrderNoList);
			bomResultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			bomResultBean.setSuccess(false);
		}
		return bomResultBean;
	}


}
