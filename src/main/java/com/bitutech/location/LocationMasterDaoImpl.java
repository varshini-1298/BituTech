package com.bitutech.location;

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
public class LocationMasterDaoImpl implements LocationMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public LocationMasterResultBean save(LocationMasterBean bean) throws Exception {
		LocationMasterResultBean resultBean = new LocationMasterResultBean();
		try {
			Map<String, Object> locationMasterMap = new HashMap<String, Object>();
			

			
			 locationMasterMap.put("locationId", bean.getLocationId());
			  locationMasterMap.put("region", bean.getRegion());
			  locationMasterMap.put("cslLocationCode", bean.getCslLocationCode());
			  
			  locationMasterMap.put("portCode", bean.getPortCode()); 
			  locationMasterMap.put("demDet", bean.getDemDet());
				
			  
			  locationMasterMap.put("locationType", bean.getLocationType());
			  locationMasterMap.put("country", bean.getCountry());
			  locationMasterMap.put("locationName", bean.getLocationName());
			  locationMasterMap.put("rrrBlock", bean.getRrrBlock());
			 
			  locationMasterMap.put("controllingBatch", bean.getControllingBatch());
			  locationMasterMap.put("transhipmentHub", bean.getTranshipmentHub());
			  locationMasterMap.put("carrierName", bean.getCarrierName());
			  locationMasterMap.put("active", bean.getActive());
			  locationMasterMap.put("carrierCode", bean.getCarrierCode());
			  locationMasterMap.put("customTransportMode", bean.getCustomTransportMode());
				/*
				 * locationMasterMap.put("dischargeDwellTimeDry",
				 * bean.getDischargeDwellTimeDry()); locationMasterMap.put("loadDwellTimeDry",
				 * bean.getLoadDwellTimeDry()); locationMasterMap.put("dischargeDwellTimeRfr",
				 * bean.getDischargeDwellTimeRfr()); locationMasterMap.put("loadDwellTime",
				 * bean.getLoadDwellTime());
				 */
			
		    
			  namedParameterJdbcTemplate.update(LocationMasterQueryUtil.INSERT_LOCATION_MASTER,locationMasterMap);
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
			objLocationMasterBean = jdbcTemplate.query(LocationMasterQueryUtil.getLocationList, new BeanPropertyRowMapper<LocationMasterBean>(LocationMasterBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objLocationMasterBean;
	}

	@Override
	public LocationMasterResultBean edit(Integer cslLocationCode) throws Exception {
		LocationMasterResultBean resultBean = new LocationMasterResultBean();
		
		resultBean.setSuccess(false);
		try {
			resultBean.setLocationMasterBean(jdbcTemplate.queryForObject(LocationMasterQueryUtil.SELECT_LOCATION_MASTER,new Object[] { cslLocationCode }, new BeanPropertyRowMapper<LocationMasterBean>(LocationMasterBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return resultBean; 
	}

	@Override
	public LocationMasterResultBean update(LocationMasterBean bean) throws Exception {
		LocationMasterResultBean resultBean = new LocationMasterResultBean();
		try {
            Map<String, Object> locationMasterMap = new HashMap<String, Object>();
			
            locationMasterMap.put("locationId", bean.getLocationId());
			  locationMasterMap.put("region", bean.getRegion());
			  locationMasterMap.put("cslLocationCode", bean.getCslLocationCode());
			  
			  locationMasterMap.put("portCode", bean.getPortCode()); 
			  locationMasterMap.put("demDet", bean.getDemDet());
				
			  
			  locationMasterMap.put("locationType", bean.getLocationType());
			  locationMasterMap.put("country", bean.getCountry());
			  locationMasterMap.put("locationName", bean.getLocationName());
			  locationMasterMap.put("rrrBlock", bean.getRrrBlock());
			 
			  locationMasterMap.put("controllingBatch", bean.getControllingBatch());
			  locationMasterMap.put("transhipmentHub", bean.getTranshipmentHub());
			  locationMasterMap.put("carrierName", bean.getCarrierName());
			  locationMasterMap.put("active", bean.getActive());
			  locationMasterMap.put("carrierCode", bean.getCarrierCode());
			  locationMasterMap.put("customTransportMode", bean.getCustomTransportMode());
				/*
				 * locationMasterMap.put("dischargeDwellTimeDry",
				 * bean.getDischargeDwellTimeDry()); locationMasterMap.put("loadDwellTimeDry",
				 * bean.getLoadDwellTimeDry()); locationMasterMap.put("dischargeDwellTimeRfr",
				 * bean.getDischargeDwellTimeRfr()); locationMasterMap.put("loadDwellTime",
				 * bean.getLoadDwellTime());
				 */
			 // namedParameterJdbcTemplate.update(LocationMasterQueryUtil.UPDATE_PURCHASE_REQUISITION,locationMasterMap);
			 
			namedParameterJdbcTemplate.update(LocationMasterQueryUtil.UPDATE_LOCATION_MASTER,locationMasterMap);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return resultBean;
	}

	@Override
	public LocationMasterResultBean delete(Integer cslLocationCode) throws Exception {
		LocationMasterResultBean resultBean = new LocationMasterResultBean();
		try {
			if (cslLocationCode!= null){
				jdbcTemplate.update(LocationMasterQueryUtil.DELETE_PURCHASE_REQUISITION, cslLocationCode);
				
				jdbcTemplate.update(LocationMasterQueryUtil.DELETE_LOCATION_MASTER, cslLocationCode);
				resultBean.setSuccess(true);
			}
			
		} catch (Exception e) {
			resultBean.setSuccess(false);
			e.printStackTrace();
		}
		return resultBean;
	}

}
