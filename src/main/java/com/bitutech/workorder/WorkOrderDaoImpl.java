package com.bitutech.workorder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WorkOrderDaoImpl implements WorkOrderDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public WorkOrderBean save(WorkOrderBean bean) throws Exception {
		WorkOrderBean workOrderBean = new WorkOrderBean();
		try {
			Map<String, Object> workOrderMap = new HashMap<String, Object>();
		    
		    
		   jdbcTemplate.update(WorkOrderQueryUtil.INSERT_WORKORDER_MASTER,workOrderMap);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return workOrderBean;
	}

	@Override
	public List<WorkOrderBean> getWorkOrderList() throws Exception {
		List<WorkOrderBean> objLocationMasterBean = new ArrayList<WorkOrderBean>();
		try {
			objLocationMasterBean = jdbcTemplate.query(WorkOrderQueryUtil.getWorkOrderList, new BeanPropertyRowMapper<WorkOrderBean>(WorkOrderBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objLocationMasterBean;
	}


}
