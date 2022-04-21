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
import com.bitutech.workorder.WorkOrderQueryUtil;

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
			bomMap.put("bomNo",bean.getBomNo());
			String bomNo = namedParameterJdbcTemplate.queryForObject(BillOfMaterialQueryUtil.Insert_Bom_Hdr,bomMap,String.class);
			
			if(!bomNo.isEmpty()) {
				if(bean.getBillOfMaterialDtlObjBean().size()>0) {
					for(BillOfMaterialDtlObjBean billOfMaterialDtlObjBean:bean.getBillOfMaterialDtlObjBean()) {
						Map<String, Object> dtlMap = new HashMap<>();
						dtlMap.put("bomNo",bomNo);
						dtlMap.put("itemId",billOfMaterialDtlObjBean.getItemId());
						dtlMap.put("uom",billOfMaterialDtlObjBean.getUomId());
						dtlMap.put("quantity",billOfMaterialDtlObjBean.getQuantity());
						dtlMap.put("createdBy","E0001");
						namedParameterJdbcTemplate.update(BillOfMaterialQueryUtil.Insert_Bom_Dtl,dtlMap);
						
					}
				}
			}
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
		List<DropDownList> workOrderList = new ArrayList<>();
		BillOfMaterialResultBean bomResultBean = new BillOfMaterialResultBean();
		bomResultBean.setSuccess(false);
		try {
			workOrderList = jdbcTemplate.query(BillOfMaterialQueryUtil.getWorkOrderList, new BeanPropertyRowMapper<DropDownList>(DropDownList.class));
			bomResultBean.setWorkOrderNoList(workOrderList);
			bomResultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			bomResultBean.setSuccess(false);
		}
		return bomResultBean;
	}

	@Override
	public BillOfMaterialResultBean getBomNumber() throws Exception {
		// TODO Auto-generated method stub
		BillOfMaterialResultBean bomResultBean = new BillOfMaterialResultBean();
		bomResultBean.setSuccess(false);
		try {
			String bomNumber =  jdbcTemplate.queryForObject(BillOfMaterialQueryUtil.GetWorderNumber, String.class);
			bomResultBean.setBomNumber(bomNumber);
			bomResultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			bomResultBean.setSuccess(false);
		}
		return bomResultBean;
	}


}
