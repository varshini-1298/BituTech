package com.bitutech.itemproperties;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bitutech.countrymaster.CountryMasterBean;
import com.bitutech.countrymaster.CountryMasterQueryUtil;


@Repository
public class ItemPropertiesDaoImpl implements ItemPropertiesDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public ItemPropertiesResultBean save(ItemPropertiesBean bean) throws Exception {
		ItemPropertiesResultBean resultBean = new ItemPropertiesResultBean();
		try {
			Map<String, Object> itemPropertiesMap = new HashMap<String, Object>();
		    
			itemPropertiesMap.put("propertyType", bean.getPropertyType());
			itemPropertiesMap.put("type", bean.getType());
			itemPropertiesMap.put("propertyName", bean.getPropertyName());
			itemPropertiesMap.put("length", bean.getLength());
			itemPropertiesMap.put("value",bean.getValue());
			itemPropertiesMap.put("defaultValue", bean.getDefaultValue());
			itemPropertiesMap.put("active", bean.getActive());
			
			namedParameterJdbcTemplate.update(ItemPropertiesQueryUtil.INSERT_DYNAMIC_ATTRIBUTE,itemPropertiesMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<ItemPropertiesBean> getItemprotyList() throws Exception {
		List<ItemPropertiesBean> uomCategoryBean = new ArrayList<ItemPropertiesBean>();
		try {
			uomCategoryBean = jdbcTemplate.query(ItemPropertiesQueryUtil.getItemPropList, new BeanPropertyRowMapper<ItemPropertiesBean>(ItemPropertiesBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return uomCategoryBean;
	}

	@Override
	public ItemPropertiesResultBean edit(Integer bean) throws Exception {
		ItemPropertiesResultBean resultBean = new ItemPropertiesResultBean();
		resultBean.setSuccess(false);
		try {
			resultBean.setItemPropertiesBean(jdbcTemplate.queryForObject(ItemPropertiesQueryUtil.SELECT_DYNAMIC_ATTRIBUTE,new Object[] { bean }, new BeanPropertyRowMapper<ItemPropertiesBean>(ItemPropertiesBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}

	@Override
	public ItemPropertiesResultBean update(ItemPropertiesBean bean) throws Exception {
		ItemPropertiesResultBean resultBean = new ItemPropertiesResultBean();
		try {
			Map<String, Object> itemPropertiesMap = new HashMap<String, Object>();
		    
			itemPropertiesMap.put("propertyType", bean.getPropertyType());
			itemPropertiesMap.put("type", bean.getType());
			itemPropertiesMap.put("propertyName", bean.getPropertyName());
			itemPropertiesMap.put("length", bean.getLength());
			itemPropertiesMap.put("value",bean.getValue());
			itemPropertiesMap.put("active",bean.getActive());
			itemPropertiesMap.put("defaultValue", bean.getDefaultValue());
			itemPropertiesMap.put("itemPropertyId", bean.getItemPropertyId());
			namedParameterJdbcTemplate.update(ItemPropertiesQueryUtil.UPDATE_DYNAMIC_ATTRIBUTE,itemPropertiesMap);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return resultBean;
	}

	@Override
	public ItemPropertiesResultBean delete(Integer itemPropertyId) throws Exception {
		ItemPropertiesResultBean resultBean = new ItemPropertiesResultBean();
		try {
			if(itemPropertyId!=null) {
				jdbcTemplate.update(ItemPropertiesQueryUtil.DELETE_DYNAMIC_ATTRIBUTE,itemPropertyId);
			}
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}	
		return resultBean;
	}

	@Override
	public List<ItemPropertiesBean> getpropertyList() throws Exception {
		List<ItemPropertiesBean> objBean = new ArrayList<ItemPropertiesBean>();
		try {
			objBean = jdbcTemplate.query(ItemPropertiesQueryUtil.getPropertyList, new BeanPropertyRowMapper<ItemPropertiesBean>(ItemPropertiesBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objBean;
	}

	@Override
	public List<ItemPropertiesBean> getTypeList() throws Exception {
		List<ItemPropertiesBean> objBean = new ArrayList<ItemPropertiesBean>();
		try {
			objBean = jdbcTemplate.query(ItemPropertiesQueryUtil.getTypeList, new BeanPropertyRowMapper<ItemPropertiesBean>(ItemPropertiesBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objBean;
	}


}
