package com.bitutech.purchase.LPO;

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
public class LpoDaoImpl implements LpoDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public LpoResultBean save(LpoBean bean) throws Exception {
		LpoResultBean resultBean = new LpoResultBean();
		try {
			Map<String, Object> lopMap = new HashMap<String, Object>();
			
		      lopMap.put("purchaseReqNo", bean.getPurchaseReqNo());
			lopMap.put("organizationName", bean.getOrganizationName());
			lopMap.put("poNumber", bean.getPoNumber());
			lopMap.put("requestType", bean.getRequestType());
			lopMap.put("poDate", bean.getPoDate());
			lopMap.put("woType", bean.getWoType());
			lopMap.put("purchaseType", bean.getPurchaseType());
			lopMap.put("purchaseFor", bean.getPurchaseFor());
			lopMap.put("vendor", bean.getVendor());
			lopMap.put("destinationLocation", bean.getDestinationLocation());
			lopMap.put("advance", bean.getAdvance());
			lopMap.put("currency", bean.getCurrency());
			lopMap.put("costCenter", bean.getCostCenter());
			lopMap.put("termsConditions", bean.getTermsConditions());
			lopMap.put("remarks", bean.getRemarks());
			lopMap.put("paymentTerms", bean.getPaymentTerms());
			lopMap.put("vendorAddress", bean.getVendorAddress());
			lopMap.put("vendorCity", bean.getVendorCity());
			lopMap.put("vendorState", bean.getVendorState()); 
			lopMap.put("vendorZip", bean.getVendorZip());
			lopMap.put("vendorCountry", bean.getVendorCountry());
			lopMap.put("destinationAddress", bean.getDestinationAddress());
			lopMap.put("destinationCity", bean.getDestinationCity());
			lopMap.put("destinationState", bean.getDestinationState());
			lopMap.put("destinationZip", bean.getDestinationZip());
			lopMap.put("destinationCountry", bean.getDestinationCountry()); 
			  
			Integer purchaseReqNo = namedParameterJdbcTemplate.queryForObject(LpoQueryUtil.INSERT_LPO_HDR,lopMap,Integer.class);

			  if(purchaseReqNo != null) {
					 
				     if(bean.getLpoDetailBeanOne().size()>0) {
				             
				    	 for(LpoDetailBeanOne lpoDetailBeanOne: bean.getLpoDetailBeanOne() )
		    {
				    		 Map<String, Object> lpoDtlOneMap = new HashMap<String, Object>();
			lpoDtlOneMap.put("purchaseReqNo", lpoDetailBeanOne.getPurchaseReqNo());	    		
			lpoDtlOneMap.put("itemCodeItemName", lpoDetailBeanOne.getItemCodeItemName());
			lpoDtlOneMap.put("itemDescription", lpoDetailBeanOne.getItemDescription());
			lpoDtlOneMap.put("edd", lpoDetailBeanOne.getEdd());
			lpoDtlOneMap.put("purchaseUOM", lpoDetailBeanOne.getPurchaseUOM());
			lpoDtlOneMap.put("purchaseQty", lpoDetailBeanOne.getPurchaseQty());
			lpoDtlOneMap.put("vendorUOM", lpoDetailBeanOne.getVendorUOM());
			lpoDtlOneMap.put("vendorQty", lpoDetailBeanOne.getVendorQty());
			lpoDtlOneMap.put("availableQty", lpoDetailBeanOne.getAvailableQty());
			lpoDtlOneMap.put("unitPrice", lpoDetailBeanOne.getNetPrice());
			lpoDtlOneMap.put("oldUnitPrice",lpoDetailBeanOne.getOldUnitPrice());
			lpoDtlOneMap.put("price", lpoDetailBeanOne.getPrice());
			lpoDtlOneMap.put("discountType", lpoDetailBeanOne.getDiscountType());
			lpoDtlOneMap.put("discountPercent", lpoDetailBeanOne.getDiscountPercent());
			lpoDtlOneMap.put("netPrice", lpoDetailBeanOne.getNetPrice());
			lpoDtlOneMap.put("cgst", lpoDetailBeanOne.getCgst());
			lpoDtlOneMap.put("sgst", lpoDetailBeanOne.getSgst());
			lpoDtlOneMap.put("igst", lpoDetailBeanOne.getIgst());
			lpoDtlOneMap.put("cgstPercent", lpoDetailBeanOne.getCgstPercent());
			lpoDtlOneMap.put("sgstPercent", lpoDetailBeanOne.getSgstPercent());
			lpoDtlOneMap.put("igstPercent", lpoDetailBeanOne.getIgstPercent());
			lpoDtlOneMap.put("total", lpoDetailBeanOne.getTotal());

			  namedParameterJdbcTemplate.update(LpoQueryUtil.INSERT_LPO_DTL_ONE,lpoDtlOneMap);
			  
			         }
			      }
			     }
			  if(purchaseReqNo != null) {
					 
				     if(bean.getLpoDetailBeanOne().size()>0) {
				             
				    	 for(LpoDetailBeanTwo lpoDetailBeanOne: bean.getLpoDetailBeanTwo() )
		    {Map<String, Object> lpoDtlTwoMap = new HashMap<String, Object>();
   		 lpoDtlTwoMap.put("subTotal", lpoDetailBeanOne.getSubTotal());	    		
   		 lpoDtlTwoMap.put("discount", lpoDetailBeanOne.getDiscount());
   		 lpoDtlTwoMap.put("cgst", lpoDetailBeanOne.getCgst());
   		 lpoDtlTwoMap.put("sgst", lpoDetailBeanOne.getSgst());
   		 lpoDtlTwoMap.put("iGST", lpoDetailBeanOne.getiGST());
   		 lpoDtlTwoMap.put("freight", lpoDetailBeanOne.getFreight());
   		 lpoDtlTwoMap.put("freightTaxPercent", lpoDetailBeanOne.getFreightTaxPercent());
   		 lpoDtlTwoMap.put("freightTotal", lpoDetailBeanOne.getFreightTotal());
   		 lpoDtlTwoMap.put("otherCharges", lpoDetailBeanOne.getOtherCharges());
   		 lpoDtlTwoMap.put("remarks", lpoDetailBeanOne.getRemarks());
			lpoDtlTwoMap.put("total",lpoDetailBeanOne.getTotal());
			

			  namedParameterJdbcTemplate.update(LpoQueryUtil.INSERT_LPO_DTL_TWO,lpoDtlTwoMap);
			  
			         }
			      }
			     }
			
			
			resultBean.setSuccess(true);
		}catch(Exception e){
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
		
	}

	@Override
	public List<LpoBean> getList() throws Exception {
		// TODO Auto-generated method stub
		List<LpoBean> salesCallEntryBeanList = new ArrayList<LpoBean>();
		try {
			salesCallEntryBeanList = jdbcTemplate.query(LpoQueryUtil.getList, new BeanPropertyRowMapper<LpoBean>(LpoBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return salesCallEntryBeanList;
	}
//edit
	@Override
	public LpoResultBean edit(Integer bean) throws Exception {
		LpoResultBean resultBean = new LpoResultBean();
		resultBean.setSuccess(false);
		try {
			resultBean.setLpoBean(jdbcTemplate.queryForObject(LpoQueryUtil.SELECT_LPO_HDR,new Object[] { bean }, new BeanPropertyRowMapper<LpoBean>(LpoBean.class)));
			
			List<LpoDetailBeanOne> lpoDetailBeanOne = jdbcTemplate.query(LpoQueryUtil.SELECT_LPO_DTL_ONE,new Object[] { bean },new BeanPropertyRowMapper<LpoDetailBeanOne>(LpoDetailBeanOne.class));	
			  resultBean.setLpoDetailBeanOne(lpoDetailBeanOne);		
			List<LpoDetailBeanTwo> lpoDetailBeanTwo = jdbcTemplate.query(LpoQueryUtil.SELECT_LPO_DTL_TWO,new Object[] { bean },new BeanPropertyRowMapper<LpoDetailBeanTwo>(LpoDetailBeanTwo.class));	
			  resultBean.setLpoDetailBeanTwo(lpoDetailBeanTwo);		
			  resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}
//update
	@Override
	public LpoResultBean update(LpoBean bean) throws Exception {
		LpoResultBean resultBean = new LpoResultBean();
		try {
			Map<String, Object> lopMap = new HashMap<String, Object>();
			
			lopMap.put("purchaseReqNo", bean.getPurchaseReqNo());
			lopMap.put("organizationName", bean.getOrganizationName());
			lopMap.put("poNumber", bean.getPoNumber());
			lopMap.put("requestType", bean.getRequestType());
			lopMap.put("poDate", bean.getPoDate());
			lopMap.put("woType", bean.getWoType());
			lopMap.put("purchaseType", bean.getPurchaseType());
			lopMap.put("purchaseFor", bean.getPurchaseFor());
			lopMap.put("vendor", bean.getVendor());
			lopMap.put("destinationLocation", bean.getDestinationLocation());
			lopMap.put("advance", bean.getAdvance());
			lopMap.put("currency", bean.getCurrency());
			lopMap.put("costCenter", bean.getCostCenter());
			lopMap.put("termsConditions", bean.getTermsConditions());
			lopMap.put("remarks", bean.getRemarks());
			lopMap.put("paymentTerms", bean.getPaymentTerms());
			lopMap.put("vendorAddress", bean.getVendorAddress());
			lopMap.put("vendorCity", bean.getVendorCity());
			lopMap.put("vendorState", bean.getVendorState()); 
			lopMap.put("vendorZip", bean.getVendorZip());
			lopMap.put("vendorCountry", bean.getVendorCountry());
			lopMap.put("destinationAddress", bean.getDestinationAddress());
			lopMap.put("destinationCity", bean.getDestinationCity());
			lopMap.put("destinationState", bean.getDestinationState());
			lopMap.put("destinationZip", bean.getDestinationZip());
			lopMap.put("destinationCountry", bean.getDestinationCountry()); 
			  

			namedParameterJdbcTemplate.update(LpoQueryUtil.UPDATE_LPO_HDR,lopMap);
			
			if(bean.getLpoDetailBeanOne().size()>0) {
					 
				  jdbcTemplate.update(LpoQueryUtil.DELETE_LPO_DTL_ONE,bean.getPurchaseReqNo());
				

			    	for(LpoDetailBeanOne lpoDetailBeanOne: bean.getLpoDetailBeanOne() ){
			    	
				    		 Map<String, Object> lpoDtlOneMap = new HashMap<String, Object>();
				    		 lpoDtlOneMap.put("purchaseReqNo", lpoDetailBeanOne.getPurchaseReqNo());	    		
				 			lpoDtlOneMap.put("itemCodeItemName", lpoDetailBeanOne.getItemCodeItemName());
				 			lpoDtlOneMap.put("itemDescription", lpoDetailBeanOne.getItemDescription());
				 			lpoDtlOneMap.put("edd", lpoDetailBeanOne.getEdd());
				 			lpoDtlOneMap.put("purchaseUOM", lpoDetailBeanOne.getPurchaseUOM());
				 			lpoDtlOneMap.put("purchaseQty", lpoDetailBeanOne.getPurchaseQty());
				 			lpoDtlOneMap.put("vendorUOM", lpoDetailBeanOne.getVendorUOM());
				 			lpoDtlOneMap.put("vendorQty", lpoDetailBeanOne.getVendorQty());
				 			lpoDtlOneMap.put("availableQty", lpoDetailBeanOne.getAvailableQty());
				 			lpoDtlOneMap.put("unitPrice", lpoDetailBeanOne.getNetPrice());
				 			lpoDtlOneMap.put("oldUnitPrice",lpoDetailBeanOne.getOldUnitPrice());
				 			lpoDtlOneMap.put("price", lpoDetailBeanOne.getPrice());
				 			lpoDtlOneMap.put("discountType", lpoDetailBeanOne.getDiscountType());
				 			lpoDtlOneMap.put("discountPercent", lpoDetailBeanOne.getDiscountPercent());
				 			lpoDtlOneMap.put("netPrice", lpoDetailBeanOne.getNetPrice());
				 			lpoDtlOneMap.put("cgst", lpoDetailBeanOne.getCgst());
				 			lpoDtlOneMap.put("sgst", lpoDetailBeanOne.getSgst());
				 			lpoDtlOneMap.put("igst", lpoDetailBeanOne.getIgst());
				 			lpoDtlOneMap.put("cgstPercent", lpoDetailBeanOne.getCgstPercent());
				 			lpoDtlOneMap.put("sgstPercent", lpoDetailBeanOne.getSgstPercent());
				 			lpoDtlOneMap.put("igstPercent", lpoDetailBeanOne.getIgstPercent());
				 			lpoDtlOneMap.put("total", lpoDetailBeanOne.getTotal());

				  
							  namedParameterJdbcTemplate.update(LpoQueryUtil.INSERT_LPO_DTL_ONE,lpoDtlOneMap);
			    } 
			    
			    }
			if(bean.getLpoDetailBeanTwo().size() > 0) {
				 
				  jdbcTemplate.update(LpoQueryUtil.DELETE_LPO_DTL_TWO,bean.getPurchaseReqNo());
				

			    	for(LpoDetailBeanTwo lpoDetailBeanTwo: bean.getLpoDetailBeanTwo()){
		
				    		 Map<String, Object> lpoDtlTwoMap = new HashMap<String, Object>();
				    		 lpoDtlTwoMap.put("subTotal", lpoDetailBeanTwo.getSubTotal());	    		
				    		 lpoDtlTwoMap.put("discount", lpoDetailBeanTwo.getDiscount());
				    		 lpoDtlTwoMap.put("cgst", lpoDetailBeanTwo.getCgst());
				    		 lpoDtlTwoMap.put("sgst", lpoDetailBeanTwo.getSgst());
				    		 lpoDtlTwoMap.put("iGST", lpoDetailBeanTwo.getiGST());
				    		 lpoDtlTwoMap.put("freight", lpoDetailBeanTwo.getFreight());
				    		 lpoDtlTwoMap.put("freightTaxPercent", lpoDetailBeanTwo.getFreightTaxPercent());
				    		 lpoDtlTwoMap.put("freightTotal", lpoDetailBeanTwo.getFreightTotal());
				    		 lpoDtlTwoMap.put("otherCharges", lpoDetailBeanTwo.getOtherCharges());
				    		 lpoDtlTwoMap.put("remarks", lpoDetailBeanTwo.getRemarks());
				 			lpoDtlTwoMap.put("total",lpoDetailBeanTwo.getTotal());
				 			
				 			
				  
							  namedParameterJdbcTemplate.update(LpoQueryUtil.INSERT_LPO_DTL_TWO,lpoDtlTwoMap);
			    } 
			    
			    }
			resultBean.setSuccess(true);
		}
		catch(Exception e){
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public LpoResultBean delete(Integer salesCallHdrId) throws Exception {
		LpoResultBean resultBean = new LpoResultBean();
		resultBean.setSuccess(false);
		try {
			if(salesCallHdrId!=null) {
				jdbcTemplate.update(LpoQueryUtil.DELETE_LPO_HDR,salesCallHdrId);
				jdbcTemplate.update(LpoQueryUtil.DELETE_LPO_DTL_ONE,salesCallHdrId);
				jdbcTemplate.update(LpoQueryUtil.DELETE_LPO_DTL_TWO,salesCallHdrId);
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
