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
import com.bitutech.itemproperties.ItemPropertiesQueryUtil;
import com.bitutech.uomcategory.UomCategoryBean;
import com.bitutech.uomcategory.UomCategoryQueryUtil;
import com.bitutech.uomcategory.UomCategoryResultBean;
import com.bitutech.workorder.WorkOrderDtlBean;
import com.bitutech.workorder.WorkOrderQueryUtil;

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
		    
			itemCategoryMap.put("categoryName", bean.getCategoryName());
			itemCategoryMap.put("parentCategory", bean.getParentCategory());
			itemCategoryMap.put("categoryType", bean.getCategoryType());
			itemCategoryMap.put("incomingQty", bean.getIncomingQty());
			
			
			Integer catagoryId = namedParameterJdbcTemplate.queryForObject(ItemCategoryQueryUtil.INSERT_ITEM_CATEGORY_hdr,itemCategoryMap,Integer.class);
		   
			if(catagoryId != null) {
					Map<String, Object> AccountDtl = new HashMap<>();
					AccountDtl.put("catagoryId",catagoryId);
					AccountDtl.put("salesTaxes", bean.getSalesTaxes());
					AccountDtl.put("purchaseTaxes", bean.getPurchaseTaxes());
					AccountDtl.put("assetAccount", bean.getAssetAccount());
					AccountDtl.put("deptAccount", bean.getDeptAccount());
					AccountDtl.put("AccuDept", bean.getAccuDept());
						namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.INSERT_CATAGORY_ACC,AccountDtl);
						
					//hardcoded value
				Integer dynamicId = 11;
					Map<String, Object> propertyDtl = new HashMap<>();
					propertyDtl.put("catagoryId",catagoryId);
 					propertyDtl.put("propertyType", dynamicId);
						namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.INSERT_CATAGORY_PROP,propertyDtl);
					
				
			
					Map<String, Object> grnDtl = new HashMap<>();
					grnDtl.put("catagoryId",catagoryId);
					grnDtl.put("batchNO", bean.getBatchNO());
					grnDtl.put("expiryDate", bean.getExpiryDate());
					grnDtl.put("mrp", bean.getMrp());
					grnDtl.put("manufactureDetails", bean.getManufactureDetails());
						namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.INSERT_CATAGORY_GRN,grnDtl);
					
				
			
		}
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
	public List<ItemCategoryBean> getCategoryType() throws Exception {
		List<ItemCategoryBean> resultBean = new ArrayList<ItemCategoryBean>();
		try {
			resultBean = jdbcTemplate.query(ItemCategoryQueryUtil.CATEGORY_TYPE_LIST, new BeanPropertyRowMapper<ItemCategoryBean>(ItemCategoryBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return resultBean;
	}

	@Override
	public ItemCategoryResultBean getPropValue(Integer propertyId) throws Exception {
		ItemCategoryResultBean resultBean = new ItemCategoryResultBean();
		resultBean.setSuccess(false);
		try {
			resultBean.setItemCategoryBean(jdbcTemplate.queryForObject(ItemCategoryQueryUtil.SELECT_PROPERTY_TYPE,new Object[] { propertyId }, new BeanPropertyRowMapper<ItemCategoryBean>(ItemCategoryBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}

	@Override
	public ItemCategoryResultBean deleteItemCategory(Integer itemCategoryId) throws Exception {

		ItemCategoryResultBean resultBean = new ItemCategoryResultBean();
		int value = 0, accountValue = 0, propertyValue = 0;
		try {

			accountValue = jdbcTemplate.update(ItemCategoryQueryUtil.sDeleteItemCategoryAccount, itemCategoryId);
			propertyValue = jdbcTemplate.update(ItemCategoryQueryUtil.sDeleteItemCategoryProperty, itemCategoryId);
			jdbcTemplate.update(ItemCategoryQueryUtil.sDeletegrnAttribute, itemCategoryId);
			value = jdbcTemplate.update(ItemCategoryQueryUtil.sDeleteItemCategory, itemCategoryId);

			if (value != 0) {
				resultBean.setSuccess(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
 		}
		return resultBean;
	}

	@Override
	public ItemCategoryResultBean edit(Integer itemCategoryId) throws Exception {
		ItemCategoryResultBean resultBean = new ItemCategoryResultBean();
		resultBean.setSuccess(false);
		try {
			resultBean.setItemCategoryBean(jdbcTemplate.queryForObject(ItemCategoryQueryUtil.SELECT_CATEGORY_EDIT,new Object[] { itemCategoryId }, new BeanPropertyRowMapper<ItemCategoryBean>(ItemCategoryBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}

	@Override
	public ItemCategoryResultBean update(ItemCategoryBean bean) throws Exception {
		ItemCategoryResultBean resultBean = new ItemCategoryResultBean();
 		try {
			Map<String, Object> itemCategoryMap = new HashMap<String, Object>();
		    
			itemCategoryMap.put("categoryName", bean.getCategoryName());
			itemCategoryMap.put("parentCategory", bean.getParentCategory());
			itemCategoryMap.put("categoryType", bean.getCategoryType());
			itemCategoryMap.put("incomingQty", bean.getIncomingQty());
			itemCategoryMap.put("itemCategoryId", bean.getItemCategoryId());
			 
 			namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.UPDATE_ITEM_CATEGORY_hdr,itemCategoryMap);
 			
 					Map<String, Object> AccountDtl = new HashMap<>();
					AccountDtl.put("itemCategoryId", bean.getItemCategoryId());
					AccountDtl.put("salesTaxes", bean.getSalesTaxes());
					AccountDtl.put("purchaseTaxes", bean.getPurchaseTaxes());
					AccountDtl.put("assetAccount", bean.getAssetAccount());
					AccountDtl.put("deptAccount", bean.getDeptAccount());
					AccountDtl.put("AccuDept", bean.getAccuDept());
						namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.UPDATE_CATAGORY_ACC,AccountDtl);
						
					//hardcoded value
				Integer dynamicId = 11;
					Map<String, Object> propertyDtl = new HashMap<>();
					propertyDtl.put("itemCategoryId", bean.getItemCategoryId());
 					propertyDtl.put("propertyType", dynamicId);
						namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.UPDATE_CATAGORY_PROP,propertyDtl);
					
				
			
					Map<String, Object> grnDtl = new HashMap<>();
					grnDtl.put("itemCategoryId", bean.getItemCategoryId());
					grnDtl.put("batchNO", bean.getBatchNO());
					grnDtl.put("expiryDate", bean.getExpiryDate());
					grnDtl.put("mrp", bean.getMrp());
					grnDtl.put("manufactureDetails", bean.getManufactureDetails());
						namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.UPDATE_CATAGORY_GRN,grnDtl);
					
		 
			resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	 

	


}
