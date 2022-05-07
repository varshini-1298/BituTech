package com.bitutech.gatePass;

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
public class GatePassDaoImpl implements GatePassDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Override
	public GatePassResultBean save(GatePassBean bean) throws Exception {
		GatePassResultBean resultBean = new GatePassResultBean();
		try {
			Map<String, Object> gatePassMap = new HashMap<String, Object>();
			gatePassMap.put(" organizationName",bean.getOrganizationName());
			gatePassMap.put(" manualGatePassNumber",bean.getManualGatePassNumber());
			gatePassMap.put(" location",bean.getLocation());
			gatePassMap.put("gatePassDate",bean.getGatePassDate());
			gatePassMap.put("address",bean.getAddress());
			gatePassMap.put("deliveryOrderNo",bean.getDeliveryOrderNo());
			gatePassMap.put("party",bean.getParty());
			gatePassMap.put("invoiceNo",bean.getInvoiceNo());
			gatePassMap.put("modeOfDelivery",bean.getModeOfDelivery());
			gatePassMap.put("vendor",bean.getVendor());
			gatePassMap.put(" personName",bean.getPersonName());
			gatePassMap.put("purchaseOrder",bean.getPurchaseOrder());
		    gatePassMap.put("reasonRemarks",bean.getReasonRemarks());
			  
			
		
			
			Integer purchaseReqNo = namedParameterJdbcTemplate.queryForObject(GatePassQueryUtil.INSERT_GATE_PASS,gatePassMap,Integer.class);

			  if(purchaseReqNo != null) {
					 
				     if(bean.getGatePassDtlBean().length>0) {
				             
				    	 for(GatePassDtlBean gatePassDtlBean: bean.getGatePassDtlBean() )
		    {
				    		 Map<String, Object> gatePassDtlMap = new HashMap<String, Object>();
			gatePassDtlMap.put("outItemName", gatePassDtlBean.getInItemName());	    		
			gatePassDtlMap.put("uom", gatePassDtlBean.getUom());
			gatePassDtlMap.put("quantity", gatePassDtlBean.getQuantity());
			gatePassDtlMap.put("alternateUOM", gatePassDtlBean.getAlternateUOM());
			gatePassDtlMap.put("alternateQuantity", gatePassDtlBean.getAlternateQuantity());
			gatePassDtlMap.put("inItemName", gatePassDtlBean.getInItemName());
			gatePassDtlMap.put("inVendorUOM", gatePassDtlBean.getInVendorUOM());
			gatePassDtlMap.put("receivingVendorQty", gatePassDtlBean.getReceivingVendorQty());
			gatePassDtlMap.put("comvertePurchaseQty", gatePassDtlBean.getComvertePurchaseQty());
			gatePassDtlMap.put("unitPrice", gatePassDtlBean.getUnitPrice());
			gatePassDtlMap.put("description",gatePassDtlBean.getDescription());
			gatePassDtlMap.put("action", gatePassDtlBean.getAction());
			

			namedParameterJdbcTemplate.update(GatePassQueryUtil.INSERT_GATE_PASS_DTL,gatePassDtlMap);
			  
			         }
			      }
			     }
			resultBean.setSuccess(false);
		}
		catch(Exception e){
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}

	@Override
	public List<GatePassBean> getOrganizationList() throws Exception {
		List<GatePassBean> objGatePassBean = new ArrayList<GatePassBean>();
		try {
			objGatePassBean = jdbcTemplate.query(GatePassQueryUtil.getOrganizationList,new BeanPropertyRowMapper<GatePassBean>(GatePassBean.class));
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return objGatePassBean;
	}

	@Override
	public List<GatePassBean> getLocationList() throws Exception {
		List<GatePassBean> objGatePassBean = new ArrayList<GatePassBean>();
		try {
			objGatePassBean = jdbcTemplate.query(GatePassQueryUtil.getLocationList,new BeanPropertyRowMapper<GatePassBean>(GatePassBean.class));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objGatePassBean;
	}

	@Override
	public GatePassResultBean edit(Integer bean) throws Exception {
		GatePassResultBean resultBean = new GatePassResultBean();
		 resultBean.setSuccess(false);
		 try {
		 resultBean.setGatePassBean(jdbcTemplate.queryForObject(GatePassQueryUtil. SELECT_GATE_PASS,new Object[] { bean }, new
		  BeanPropertyRowMapper<GatePassBean>(GatePassBean.class)));
		 
		 
			List<GatePassDtlBean> gatePassDtlBean = jdbcTemplate.query(GatePassQueryUtil.SELECT_GATE_PASS_DTL,
					new Object[] { bean },
					new BeanPropertyRowMapper<GatePassDtlBean>(GatePassDtlBean.class));	
			  resultBean.setGatePassDtlBean(gatePassDtlBean);
		  resultBean.setSuccess(true);
		  } catch(Exception e)
		    {
			  e.printStackTrace();
			  }
		  return resultBean; 
		  }

	@Override
	public GatePassResultBean update(GatePassBean bean) throws Exception {
		GatePassResultBean resultBean = new GatePassResultBean();
		try {
			Map<String, Object> gatePassMap = new HashMap<String, Object>();
			gatePassMap.put(" organizationName",bean.getOrganizationName());
			gatePassMap.put(" manualGatePassNumber",bean.getManualGatePassNumber());
			gatePassMap.put(" location",bean.getLocation());
			gatePassMap.put("gatePassDate",bean.getGatePassDate());
			gatePassMap.put("address",bean.getAddress());
			gatePassMap.put("deliveryOrderNo",bean.getDeliveryOrderNo());
			gatePassMap.put("party",bean.getParty());
			gatePassMap.put("invoiceNo",bean.getInvoiceNo());
			gatePassMap.put("modeOfDelivery",bean.getModeOfDelivery());
			gatePassMap.put("vendor",bean.getVendor());
			gatePassMap.put(" personName",bean.getPersonName());
			gatePassMap.put("purchaseOrder",bean.getPurchaseOrder());
		    gatePassMap.put("reasonRemarks",bean.getReasonRemarks());
			  

			namedParameterJdbcTemplate.update(GatePassQueryUtil.UPDATE__GATE_PASS,gatePassMap);
			
		//	if(deliveryOrderNo != null) {
				 
			     if(bean.getGatePassDtlBean().length>0) {
			             
			    	 for(GatePassDtlBean gatePassDtlBean: bean.getGatePassDtlBean() )
	    {
			    		 Map<String, Object> gatePassDtlMap = new HashMap<String, Object>();
		gatePassDtlMap.put("outItemName", gatePassDtlBean.getInItemName());	    		
		gatePassDtlMap.put("uom", gatePassDtlBean.getUom());
		gatePassDtlMap.put("quantity", gatePassDtlBean.getQuantity());
		gatePassDtlMap.put("alternateUOM", gatePassDtlBean.getAlternateUOM());
		gatePassDtlMap.put("alternateQuantity", gatePassDtlBean.getAlternateQuantity());
		gatePassDtlMap.put("inItemName", gatePassDtlBean.getInItemName());
		gatePassDtlMap.put("inVendorUOM", gatePassDtlBean.getInVendorUOM());
		gatePassDtlMap.put("receivingVendorQty", gatePassDtlBean.getReceivingVendorQty());
		gatePassDtlMap.put("comvertePurchaseQty", gatePassDtlBean.getComvertePurchaseQty());
		gatePassDtlMap.put("unitPrice", gatePassDtlBean.getUnitPrice());
		gatePassDtlMap.put("description",gatePassDtlBean.getDescription());
		gatePassDtlMap.put("action", gatePassDtlBean.getAction());
		

	namedParameterJdbcTemplate.update(GatePassQueryUtil.INSERT_GATE_PASS_DTL,gatePassDtlMap);
		  
			    } 
			    
			    }
			
			resultBean.setSuccess(true);
		}
		catch(Exception e){
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
		//return null;
	}

	@Override
	public GatePassResultBean delete(Integer bean) throws Exception {
		GatePassResultBean resultBean = new GatePassResultBean();
		try {
			if(bean!=null) {
				jdbcTemplate.update(GatePassQueryUtil.DELETE_GATE_PASS_hdr,bean);
				jdbcTemplate.update(GatePassQueryUtil.DELETE_GATE_PASS_DTL,bean);
				
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
