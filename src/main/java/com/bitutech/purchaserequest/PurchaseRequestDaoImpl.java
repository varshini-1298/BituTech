package com.bitutech.purchaserequest;

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
public class PurchaseRequestDaoImpl  implements PurchaseRequestDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public PurchaseRequestResultBean save(PurchaseRequestBean bean) throws Exception {
		PurchaseRequestResultBean resultBean = new PurchaseRequestResultBean();
		try {
			Map<String, Object> purchaseRequestMap = new HashMap<String, Object>();
			
			purchaseRequestMap.put("company",bean.getCompany());
			purchaseRequestMap.put("requestType",bean.getRequestType());
			purchaseRequestMap.put("requestDate",bean.getRequestDate());
			purchaseRequestMap.put("destinationLocation",bean.getDestinationLocation());
			purchaseRequestMap.put("jobTitle", bean.getJobTitle());
	        purchaseRequestMap.put("requestedBy", bean.getRequestedBy());
			purchaseRequestMap.put("prReqNo",bean.getPrReqNo());
			purchaseRequestMap.put("sourceLocation", bean.getSourceLocation());
			purchaseRequestMap.put("costCenter", bean.getCostCenter());
			purchaseRequestMap.put("costCenter", bean.getCostCenter());
			purchaseRequestMap.put("requisitionId", bean.getRequisitionId());
			purchaseRequestMap.put("requisitionNo", '1');
			
			
			int i = namedParameterJdbcTemplate.update(PurchaseRequestQueryUtil.INSERT_PURCHASE_REQUISITION,purchaseRequestMap);
			
		   resultBean.setSuccess(true);
		         }catch(Exception e) {
			          e.printStackTrace();
			          resultBean.setSuccess(false);
		         }
		
		return resultBean;	
	}

	@Override
	public List<PurchaseRequestBean> getPurchaseRequestList() throws Exception {
		List<PurchaseRequestBean> purchaseRequestBean = new ArrayList<PurchaseRequestBean>();
		try {
			purchaseRequestBean = jdbcTemplate.query(PurchaseRequestQueryUtil.getPurchaseRequestList, new BeanPropertyRowMapper<PurchaseRequestBean>(PurchaseRequestBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return purchaseRequestBean;
	}

	
//	@Override
//	public List<PurchaseRequestBean> getUomcateList() throws Exception {
//		List<PurchaseRequestBean> objUomMasterBean = new ArrayList<PurchaseRequestBean>();
//		try {
//			objUomMasterBean = jdbcTemplate.query(PurchaseRequestQueryUtil.getUomcategoryList, new BeanPropertyRowMapper<PurchaseRequestBean>(PurchaseRequestBean.class));
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		return objUomMasterBean;
//	}
	
	//edit
		@Override
		public PurchaseRequestResultBean edit(Integer bean) throws Exception {
			PurchaseRequestResultBean resultBean = new PurchaseRequestResultBean();
			resultBean.setSuccess(false);
			try {
				resultBean.setPurchaseRequestBean(jdbcTemplate.queryForObject(PurchaseRequestQueryUtil.SELECT_PURCHASE_REQUISITION,new Object[] { bean }, new BeanPropertyRowMapper<PurchaseRequestBean>(PurchaseRequestBean.class)));
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
		public PurchaseRequestResultBean update(PurchaseRequestBean Bean) throws Exception {
			PurchaseRequestResultBean resultBean = new PurchaseRequestResultBean();
			try {
//				Map<String, Object> booMap = new HashMap<String, Object>();
//			    
//				booMap.put("booNo", bean.getBooNo());
//				booMap.put("bomRef", bean.getBomRef());
//				booMap.put("productName", bean.getProductName());
//				booMap.put("date", bean.getDate());
//				namedParameterJdbcTemplate.update(BillOfOperationQueryUtil.UPDATE_BILL_OF_OPERATION_DETAIL,booMap);
//			
				jdbcTemplate.queryForObject(PurchaseRequestQueryUtil.UPDATE_PURCHASE_REQUISITION,new BeanPropertyRowMapper<PurchaseRequestBean>(PurchaseRequestBean.class), new Object[]
						{ Bean.getRequestType(),Bean.getSourceLocation(),Bean.getRequestedBy(),Bean.getDestinationLocation(),Bean.getRequisitionId()});
					
				resultBean.setSuccess(true);
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return resultBean;
		}

		//delete
		@Override
		public PurchaseRequestResultBean delete(Integer requisitionId) throws Exception {
			PurchaseRequestResultBean resultBean = new PurchaseRequestResultBean();
			try {
				if(requisitionId!=null) {
					jdbcTemplate.update(PurchaseRequestQueryUtil.DELETE_PURCHASE_REQUISITION,requisitionId);
				}
				resultBean.setSuccess(true);
			}
			catch(Exception e) {
				e.printStackTrace();
				resultBean.setSuccess(false);
			}	
			return resultBean;	}



}
