package com.bitutech.designationmaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DesignationMasterDaoImpl implements DesignationMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public DesignationMasterResultBean save(DesignationMasterBean bean) throws Exception {
		DesignationMasterResultBean resultBean = new DesignationMasterResultBean();
		try {
			Map<String, Object> designationMasterMap = new HashMap<String, Object>();
		    
			designationMasterMap.put("designationName", bean.getDesignationName());
			designationMasterMap.put("remarks", bean.getDesignationName());
			designationMasterMap.put("active", bean.isActive());
			String desgnCode =  jdbcTemplate.queryForObject(DesignationMasterQueryUtil.GETDESGCODE, String.class);
			designationMasterMap.put("desgnCode", desgnCode);
			
		    
			namedParameterJdbcTemplate.update(DesignationMasterQueryUtil.INSERT_DESIGNATION_MASTER,designationMasterMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
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
