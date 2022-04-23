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
			
//			itemCategoryMap.put("propertyType", bean.getPropertyType());
//			itemCategoryMap.put("length", bean.getLength());
//			itemCategoryMap.put("isMandantory", bean.getIsMandantory());
//			itemCategoryMap.put("batchNO", bean.getBatchNO());
//			itemCategoryMap.put("expiryDate", bean.getExpiryDate());
//			itemCategoryMap.put("mrp", bean.getMrp());
//			itemCategoryMap.put("manufactureDetails", bean.getManufactureDetails());
			
			String catagoryId = namedParameterJdbcTemplate.queryForObject(ItemCategoryQueryUtil.INSERT_ITEM_CATEGORY_hdr,itemCategoryMap,String.class);
		   
			if(!catagoryId.isEmpty()) {
			if(bean.getItemCategoryAcc().size()>0) {
					for(itemCategoryAcc itemAccount: bean.getItemCategoryAcc() ) {
					Map<String, Object> AccountDtl = new HashMap<>();
					AccountDtl.put("catagoryId",catagoryId);
					AccountDtl.put("salesTaxes", itemAccount.getSalesTaxes());
					AccountDtl.put("purchaseTaxes", itemAccount.getPurchaseTaxes());
					AccountDtl.put("assetAccount", itemAccount.getAssetAccount());
					AccountDtl.put("deptAccount", itemAccount.getDeptAccount());
					AccountDtl.put("AccuDept", itemAccount.getAccuDept());
						namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.INSERT_CATAGORY_ACC,AccountDtl);
					}
				}
			if(bean.getItemCategoryProperty().size()>0) {
				for(itemCategoryProperty catagoryProperty: bean.getItemCategoryProperty() ) {
					Map<String, Object> propertyDtl = new HashMap<>();
					propertyDtl.put("catagoryId",catagoryId);
					propertyDtl.put("propertyType", catagoryProperty.getPropertyType());
					propertyDtl.put("propertyType", catagoryProperty.getPropertyType());
					propertyDtl.put("length", catagoryProperty.getLength());
					propertyDtl.put("isMandantory", catagoryProperty.getIsMandantory());
						namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.INSERT_CATAGORY_PROP,propertyDtl);
					}
				
			}
			if(bean.getItemCategoryGRN().size()>0) {
				for(itemCategoryGRN itemCategoryGRN: bean.getItemCategoryGRN() ) {
					Map<String, Object> grnDtl = new HashMap<>();
					grnDtl.put("catagoryId",catagoryId);
					grnDtl.put("batchNO", itemCategoryGRN.getBatchNO());
					grnDtl.put("expiryDate", itemCategoryGRN.getExpiryDate());
					grnDtl.put("mrp", itemCategoryGRN.getMrp());
					grnDtl.put("manufactureDetails", itemCategoryGRN.getManufactureDetails());
						namedParameterJdbcTemplate.update(ItemCategoryQueryUtil.INSERT_CATAGORY_GRN,grnDtl);
					}
				
			}
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
	public List<ItemCategoryBean> getUomcateList() throws Exception {
		List<ItemCategoryBean> objUomMasterBean = new ArrayList<ItemCategoryBean>();
		try {
			objUomMasterBean = jdbcTemplate.query(ItemCategoryQueryUtil.getUomcategoryList, new BeanPropertyRowMapper<ItemCategoryBean>(ItemCategoryBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objUomMasterBean;
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

	


}
