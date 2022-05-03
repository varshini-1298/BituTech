package com.bitutech.itemMaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import com.bitutech.core.util.DropDownList;

@Repository
public class ItemMasterDaoImpl implements ItemMasterDao { 
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
// save
	
	@Override public ItemMasterResultBean save(ItemMasterBean bean) throws Exception
	  { 
		  ItemMasterResultBean resultBean = new ItemMasterResultBean();
	  resultBean.setSuccess(false); 
	  try 
	  { 
		  Map<String, Object> itemMasterMap = new HashMap<String, Object>();
			  
			  itemMasterMap.put("itemCode",bean.getItemCode());
			  itemMasterMap.put("itemName", bean.getItemName());
			  itemMasterMap.put("itemDescription", bean.getItemDescription());
			  itemMasterMap.put("itemType", bean.getItemType());
			  itemMasterMap.put("itemCategory", bean.getItemCategory());
			  itemMasterMap.put("saleable", bean.getSaleable());
			  itemMasterMap.put("purchaseable", bean.getPurchaseable());
			  itemMasterMap.put("leadTime", bean.getLeadTime());
			  itemMasterMap.put("purchaseMethod", bean.getPurchaseMethod());
			  itemMasterMap.put("pruchaseUom", bean.getPruchaseUom());
			  itemMasterMap.put("purchaseReq", bean.getPurchaseReq());
			  itemMasterMap.put("minimumQty", bean.getMinimumQty());
			  itemMasterMap.put("maximumQty", bean.getMaximumQty());
			  itemMasterMap.put("reorderLevel", bean.getReorderLevel());
			  itemMasterMap.put("costingMethod", bean.getCostingMethod());
			  itemMasterMap.put("costPrice", bean.getCostPrice());
			  itemMasterMap.put("warranty", bean.getWarranty());
			  itemMasterMap.put("leadTime", bean.getLeadTime());
			  //INVENTORY
			  itemMasterMap.put("inventoryValuation", bean.getInventoryValuation());
			  itemMasterMap.put("issueMethod", bean.getIssueMethod());
			
			  Integer itemId = namedParameterJdbcTemplate.queryForObject(ItemMasterQueryUtil.INSERT_ITEM_MASTER,itemMasterMap,Integer.class);
			//grn attribute      
		      
		  if(itemId != null) {
		    Map<String, Object> itemMasterMap1 = new HashMap<String, Object>(); 
		    itemMasterMap1.put("itemId",itemId);
		    itemMasterMap1.put("batchNo",bean.getBatchNo());
		    itemMasterMap1.put("mrp",bean.getMrp());
		    itemMasterMap1.put("expiryDate",bean.getExpiryDate());
		    itemMasterMap1.put("manufactureDetails",bean.getManufactureDetails());
			  
			  namedParameterJdbcTemplate.update(ItemMasterQueryUtil.INSERT_ITEM_MASTER_GRN_ATTRIBUTE,itemMasterMap1);
			
			      }
			      
			  resultBean.setSuccess(true);
//vendor dtl save			 
	      
			  if(itemId != null) {
	 
		     if(bean.getItemMasterDetailBean().size()>0) {
		             
		    	 for(ItemMasterDetailBean ItemMasterDetailBean: bean.getItemMasterDetailBean() )
    { Map<String, Object> dtlMap = new HashMap<>();
      dtlMap.put("itemId",itemId);
	  dtlMap.put("vendor",ItemMasterDetailBean.getVendor());
	  dtlMap.put("vendorItemName",ItemMasterDetailBean.getVendorItemName());
	  dtlMap.put("itemName",ItemMasterDetailBean.getItemName());
	  dtlMap.put("itemCode",ItemMasterDetailBean.getItemCode());
	  dtlMap.put("vendorItemCode",ItemMasterDetailBean.getVendorItemCode());
	  dtlMap.put("vendorminimumQty",ItemMasterDetailBean.getVendorminimumQty());
	  dtlMap.put("vendorUom",ItemMasterDetailBean.getVendorUom());
	  dtlMap.put("deliveryLeadTime",ItemMasterDetailBean.getDeliveryLeadTime());
	  dtlMap.put("pricingType",ItemMasterDetailBean.getPricingType());
	  

	  namedParameterJdbcTemplate.update(ItemMasterQueryUtil.INSERT_ITEM_MASTER_VENDOR_DTL,dtlMap);
	  
	         }
	      }
	     }
	      resultBean.setSuccess(true);
	  }   
	    catch(Exception e) { 
		  e.printStackTrace();
	      resultBean.setSuccess(false); 
	      }
	  
	      return resultBean;
	     }
	  
//	 itemList
	@Override
	public List<ItemMasterBean> getItemList() throws Exception {
		List<ItemMasterBean> objCustomerMasterBean = new ArrayList<ItemMasterBean>();
		try {
			objCustomerMasterBean = jdbcTemplate.query(ItemMasterQueryUtil.getItemList, new BeanPropertyRowMapper<ItemMasterBean>(ItemMasterBean.class));
			

		}catch(Exception e){
			e.printStackTrace();
		}
		return objCustomerMasterBean;
	}
	//edit
	
	 @Override 
	 public ItemMasterResultBean edit(Integer bean) throws Exception {
	 ItemMasterResultBean resultBean = new ItemMasterResultBean();
	 resultBean.setSuccess(false);
	 try {
	 resultBean.setItemMasterBean(jdbcTemplate.queryForObject(ItemMasterQueryUtil. SELECT_ITEM_MASTER,new Object[] { bean }, new
	  BeanPropertyRowMapper<ItemMasterBean>(ItemMasterBean.class)));
	 
	 
		List<ItemMasterDetailBean> itemMasterDetailBean = jdbcTemplate.query(ItemMasterQueryUtil.SELECT_ITEM_MASTER_VENDOR,
				new Object[] { bean },
				new BeanPropertyRowMapper<ItemMasterDetailBean>(ItemMasterDetailBean.class));	
		  resultBean.setItemMasterDetailBean(itemMasterDetailBean);
	  resultBean.setSuccess(true);
	  } catch(Exception e)
	    {
		  e.printStackTrace();
		  }
	  return resultBean; 
	  }


//update
	@Override
	public ItemMasterResultBean update(ItemMasterBean bean) throws Exception {
		Integer id = bean.getItemId();
		ItemMasterResultBean resultBean = new ItemMasterResultBean();
		try {
			// HEADER UPDATE
			Map<String, Object> itemMasterMap = new HashMap<String, Object>();
			itemMasterMap.put("itemId", bean.getItemId());
			itemMasterMap.put("itemCode", bean.getItemCode());
			itemMasterMap.put("itemName", bean.getItemName());
			itemMasterMap.put("itemDescription", bean.getItemDescription());
			itemMasterMap.put("itemType", bean.getItemType());
			itemMasterMap.put("itemCategory", bean.getItemCategory());
			itemMasterMap.put("saleable", bean.getSaleable());
			itemMasterMap.put("purchaseable", bean.getPurchaseable());
		
			itemMasterMap.put("purchaseMethod", bean.getPurchaseMethod());
			itemMasterMap.put("pruchaseUom", bean.getPruchaseUom());
			itemMasterMap.put("purchaseReq", bean.getPurchaseReq());
			itemMasterMap.put("minimumQty", bean.getMinimumQty());
			itemMasterMap.put("maximumQty", bean.getMaximumQty());
			itemMasterMap.put("reorderLevel", bean.getReorderLevel());
			itemMasterMap.put("costingMethod", bean.getCostingMethod());
			itemMasterMap.put("costPrice", bean.getCostPrice());
			itemMasterMap.put("warranty", bean.getWarranty());
			itemMasterMap.put("leadTime", bean.getLeadTime());
			
			 //INVENTORY UPDATE
			  itemMasterMap.put("inventoryValuation", bean.getInventoryValuation());
			  itemMasterMap.put("issueMethod", bean.getIssueMethod());
			
			namedParameterJdbcTemplate.update(ItemMasterQueryUtil.UPDATE_ITEM_MASTER,itemMasterMap);
		
			Map<String, Object> itemMasterMap1 = new HashMap<String, Object>(); 
		    itemMasterMap1.put("itemId",bean.getItemId());
		    itemMasterMap1.put("batchNo",bean.getBatchNo());
		    itemMasterMap1.put("mrp",bean.getMrp());
		    itemMasterMap1.put("expiryDate",bean.getExpiryDate());
		    itemMasterMap1.put("manufactureDetails",bean.getManufactureDetails());
		    namedParameterJdbcTemplate.update(ItemMasterQueryUtil.UPDATE_ITEM_MASTER_GRN_ATTRIBUTE,itemMasterMap1);
		    
		   //VENDOR UPDATE
		    if(bean.getItemMasterDetailBean().size()>0) {
				 
		    	jdbcTemplate.update(ItemMasterQueryUtil.DELETE_ITEM_MASTER_VENDOR,bean.getItemId());
				
				
		             
			    	 for(ItemMasterDetailBean ItemMasterDetailBean: bean.getItemMasterDetailBean() ) {
		    	
		    Map<String, Object> dtlMap = new HashMap<>();
		      dtlMap.put("itemId",id);
			  dtlMap.put("vendor",ItemMasterDetailBean.getVendor());
			  dtlMap.put("vendorItemName",ItemMasterDetailBean.getVendorItemName());
			  dtlMap.put("itemName",ItemMasterDetailBean.getItemName());
			  dtlMap.put("itemCode",ItemMasterDetailBean.getItemCode());
			  dtlMap.put("vendorItemCode",ItemMasterDetailBean.getVendorItemCode());
			  dtlMap.put("vendorminimumQty",ItemMasterDetailBean.getVendorminimumQty());
			  dtlMap.put("vendorUom",ItemMasterDetailBean.getVendorUom());
			  dtlMap.put("deliveryLeadTime",ItemMasterDetailBean.getDeliveryLeadTime());
			  dtlMap.put("pricingType",ItemMasterDetailBean.getPricingType());
			  
			  namedParameterJdbcTemplate.update(ItemMasterQueryUtil.INSERT_ITEM_MASTER_VENDOR_DTL,dtlMap);
		    } 
		    
		    }
			resultBean.setSuccess(true);

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return resultBean;
	}
	
//delete
	
	@Override
	public ItemMasterResultBean delete(Integer bean) throws Exception {
		ItemMasterResultBean resultBean = new ItemMasterResultBean();
		try {
			if(bean!=null) {
				jdbcTemplate.update(ItemMasterQueryUtil.DELETE_SALES_ORDER_DTL,bean);
				jdbcTemplate.update(ItemMasterQueryUtil.DELETE_PURCHASE_REQUISITION_DETAIL,bean);
				jdbcTemplate.update(ItemMasterQueryUtil.DELETE_ITEM_MASTER_GRN_ATTRIBUTE,bean);
				jdbcTemplate.update(ItemMasterQueryUtil.DELETE_ITEM_PROPERTY ,bean);
				jdbcTemplate.update(ItemMasterQueryUtil.DELETE_ITEM_MASTER_VENDOR ,bean);
				jdbcTemplate.update(ItemMasterQueryUtil.DELETE_ITEM_MASTER,bean);
				
			}
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}	
		return resultBean;
	}
	
	//itemIdList
	
	@Override
	public ItemMasterResultBean getItemIdList() throws Exception {
		// TODO Auto-generated method stub
		List<DropDownList> ItemIdList = new ArrayList<>();
		ItemMasterResultBean resultBean = new ItemMasterResultBean();
		try {
			ItemIdList = jdbcTemplate.query(ItemMasterQueryUtil.getItemIdList,new BeanPropertyRowMapper<DropDownList>(DropDownList.class));
			resultBean.setItemIdList(ItemIdList);
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}

}
