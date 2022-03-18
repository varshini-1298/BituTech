package com.bitutech.location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LocationMasterDaoImpl implements LocationMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public LocationMasterBean save(LocationMasterBean bean) throws Exception {
		LocationMasterBean LocationMasterBean = new LocationMasterBean();
		try {
			Map<String, Object> LocationMasterMap = new HashMap<String, Object>();
		    
		    
		   jdbcTemplate.update(LocationMasterQueryUtil.INSERT_LOCATION_MASTER,LocationMasterMap);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return LocationMasterBean;
	}

	@Override
	public List<LocationMasterBean> getLocationList() throws Exception {
		List<LocationMasterBean> objLocationMasterBean = new ArrayList<LocationMasterBean>();
		try {
			objLocationMasterBean = jdbcTemplate.query(LocationMasterQueryUtil.getCustomerList, new BeanPropertyRowMapper<LocationMasterBean>(LocationMasterBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objLocationMasterBean;
	}


}
