package com.bitutech.designationmaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DesignationMasterDaoImpl implements DesignationMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public DesignationMasterBean save(DesignationMasterBean bean) throws Exception {
		DesignationMasterBean designationMasterBean = new DesignationMasterBean();
		try {
			Map<String, Object> designationMasterMap = new HashMap<String, Object>();
		    
		    
		   jdbcTemplate.update(DesignationMasterQueryUtil.INSERT_DESIGNATION_MASTER,designationMasterMap);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return designationMasterBean;
	}

	@Override
	public List<DesignationMasterBean> getDesignationList() throws Exception {
		List<DesignationMasterBean> objCustomerMasterBean = new ArrayList<DesignationMasterBean>();
		try {
			objCustomerMasterBean = jdbcTemplate.query(DesignationMasterQueryUtil.getDesignationList, new BeanPropertyRowMapper<DesignationMasterBean>(DesignationMasterBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objCustomerMasterBean;
	}


}
