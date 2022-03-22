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
			String desgnCode =  jdbcTemplate.queryForObject(UomCategoryQueryUtil.GETUOMODE, String.class);
			uomCategoryMap.put("desgnCode", desgnCode);
			
		    
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


}
