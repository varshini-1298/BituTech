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
	public LocationMasterResultBean save(LocationMasterBean bean) throws Exception {
		LocationMasterResultBean resultBean = new LocationMasterResultBean();
		try {
			Map<String, Object> locationMasterMap = new HashMap<String, Object>();
		    
			locationMasterMap.put("locationId", bean.getLocationId());
			locationMasterMap.put("locationName", bean.getLocationName());
			locationMasterMap.put("parentLocationId", bean.getParentLocationId());
			locationMasterMap.put("locationCategory", bean.getLocationCategory());
			
			
		    
		   jdbcTemplate.update(LocationMasterQueryUtil.INSERT_LOCATION_MASTER,locationMasterMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
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
