package com.bitutech.workorder;

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
public class WorkOrderDaoImpl implements WorkOrderDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public WorkOrderResultBean save(WorkOrderHdrObjBean bean) throws Exception {
		WorkOrderResultBean resultBean = new WorkOrderResultBean();
		try {
			Map<String, Object> workOrderMap = new HashMap<String, Object>();
			
			workOrderMap.put("workorderNo",bean.getWorkorderNo());
			workOrderMap.put("workorderDate",bean.getWorkorderDate());
			workOrderMap.put("salesOrderNo",bean.getSalesOrderNo());
		    
			namedParameterJdbcTemplate.update(WorkOrderQueryUtil.INSERT_WORKORDER_MASTER,workOrderMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<WorkOrderHdrObjBean> getWorkOrderList() throws Exception {
		List<WorkOrderHdrObjBean> objLocationMasterBean = new ArrayList<WorkOrderHdrObjBean>();
		try {
			objLocationMasterBean = jdbcTemplate.query(WorkOrderQueryUtil.getWorkOrderList, new BeanPropertyRowMapper<WorkOrderHdrObjBean>(WorkOrderHdrObjBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objLocationMasterBean;
	}

	@Override
	public WorkOrderResultBean getWorkOrderNumber() throws Exception {
		// TODO Auto-generated method stub
		WorkOrderResultBean workOrderResultBean = new WorkOrderResultBean();
		String workOrderNumber =  jdbcTemplate.queryForObject(WorkOrderQueryUtil.GetWorderNumber, String.class);
		workOrderResultBean.setWorkOrderNumber(workOrderNumber);
		return workOrderResultBean;
	}

	@Override
	public WorkOrderResultBean getSalesOrderNoList() throws Exception {
		// TODO Auto-generated method stub
		List<DropDownList> salesOrderNoList = new ArrayList<>();
		WorkOrderResultBean workOrderResultBean = new WorkOrderResultBean();
		try {
			salesOrderNoList = jdbcTemplate.query(WorkOrderQueryUtil.getSalesOrderNoList, new BeanPropertyRowMapper<DropDownList>(DropDownList.class));
			workOrderResultBean.setWorkOrderNoList(salesOrderNoList);
			workOrderResultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			workOrderResultBean.setSuccess(false);
		}
		return workOrderResultBean;
	}

	@Override
	public WorkOrderResultBean getUomList() throws Exception {
		// TODO Auto-generated method stub
		WorkOrderResultBean workOrderResultBean = new WorkOrderResultBean();
		workOrderResultBean.setSuccess(false);
		try {
			workOrderResultBean.setUomList(jdbcTemplate.query(WorkOrderQueryUtil.getUomList, new BeanPropertyRowMapper<DropDownList>(DropDownList.class)));
			workOrderResultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			workOrderResultBean.setSuccess(false);
		}
		return workOrderResultBean;
	}


}
