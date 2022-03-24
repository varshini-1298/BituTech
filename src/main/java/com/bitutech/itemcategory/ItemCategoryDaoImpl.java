package com.bitutech.itemcategory;

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
public class ItemCategoryDaoImpl implements ItemCategoryDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public ItemCategoryResultBean save(ItemCategoryBean bean) throws Exception {
		ItemCategoryResultBean resultBean = new ItemCategoryResultBean();
		try {
			Map<String, Object> itemCategoryMap = new HashMap<String, Object>();
		    
			itemCategoryMap.put("unitMeasure", bean.getUnitMeasure());
			itemCategoryMap.put("uomCategory", bean.getUomCategory());
			itemCategoryMap.put("description", bean.getDescription());;
			
			namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.INSERT_ITEM_CATEGORY,itemCategoryMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<ItemCategoryBean> getItemCategoryList() throws Exception {
		List<ItemCategoryBean> itemCategoryBean = new ArrayList<ItemCategoryBean>();
		try {
			itemCategoryBean = jdbcTemplate.query(ItemCategoryQueryUtil.getItemCategoryList, new BeanPropertyRowMapper<ItemCategoryBean>(ItemCategoryBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return itemCategoryBean;
	}

	@Override
	public List<ItemCategoryBean> getUomcateList() throws Exception {
		List<ItemCategoryBean> objUomMasterBean = new ArrayList<ItemCategoryBean>();
		try {
			objUomMasterBean = jdbcTemplate.query(ItemCategoryQueryUtil.getUomcategoryList, new BeanPropertyRowMapper<ItemCategoryBean>(ItemCategoryBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objUomMasterBean;
	}


}
