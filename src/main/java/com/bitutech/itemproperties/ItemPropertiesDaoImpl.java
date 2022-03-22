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
			Map<String, Object> uomCategoryMap = new HashMap<String, Object>();
		    
			uomCategoryMap.put("unitMeasure", bean.getUnitMeasure());
			uomCategoryMap.put("categoryDesp", bean.getUomCategory());
			uomCategoryMap.put("description", bean.getDescription());;
			
			namedParameterJdbcTemplate.update(ItemPropertiesQueryUtil.INSERT_ITEM_PROP,uomCategoryMap);
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


}
