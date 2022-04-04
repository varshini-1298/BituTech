package com.bitutech.uomcategory;

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
public class UomCategoryDaoImpl implements UomCategoryDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public UomCategoryResultBean save(UomCategoryBean bean) throws Exception {
		UomCategoryResultBean resultBean = new UomCategoryResultBean();
		try {
			Map<String, Object> uomCategoryMap = new HashMap<String, Object>();
		    
			uomCategoryMap.put("categoryName", bean.getCategoryName());
			uomCategoryMap.put("categoryDesp", bean.getCategoryDesp());
			uomCategoryMap.put("active", bean.isActive());
			String uomCode =  jdbcTemplate.queryForObject(UomCategoryQueryUtil.GETUOMODE, String.class);
			uomCategoryMap.put("uomCode", uomCode);
			
		    
			namedParameterJdbcTemplate.update(UomCategoryQueryUtil.INSERT_UOM_CATEGORY,uomCategoryMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<UomCategoryBean> getUomList() throws Exception {
		List<UomCategoryBean> uomCategoryBean = new ArrayList<UomCategoryBean>();
		try {
			uomCategoryBean = jdbcTemplate.query(UomCategoryQueryUtil.getUomCategoryList, new BeanPropertyRowMapper<UomCategoryBean>(UomCategoryBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return uomCategoryBean;
	}

	@Override
	public UomCategoryResultBean update(UomCategoryBean bean) throws Exception {
		UomCategoryResultBean resultBean = new UomCategoryResultBean();
		try {
			Map<String, Object> uomCategoryMap = new HashMap<String, Object>();
		    
			uomCategoryMap.put("categoryName", bean.getCategoryName());
			uomCategoryMap.put("categoryDesp", bean.getCategoryDesp());
			uomCategoryMap.put("uomCode", bean.getUomCode());
			namedParameterJdbcTemplate.update(UomCategoryQueryUtil.UPDATE_UOM_CATEGORY,uomCategoryMap);
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return resultBean;
	}
	
	// For Edit

	@Override
	public UomCategoryResultBean getCode(String bean) throws Exception {
		UomCategoryResultBean resultBean = new UomCategoryResultBean();
		resultBean.setSuccess(false);
		try {
			resultBean.setUomCategoryBean(jdbcTemplate.queryForObject(UomCategoryQueryUtil.SELECT_UOM_CATEGORY,new Object[] { bean }, new BeanPropertyRowMapper<UomCategoryBean>(UomCategoryBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}

	@Override
	public UomCategoryResultBean delete(String uomCode) throws Exception {
		UomCategoryResultBean resultBean = new UomCategoryResultBean();
		try {
			if(uomCode!=null) {
				jdbcTemplate.update(UomCategoryQueryUtil.DELETE_UOM_CATEGORY,uomCode);
			}
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}	
		return resultBean;
	}


}
