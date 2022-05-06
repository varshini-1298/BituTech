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
			Map<String, Object> salesCallEntryMap = new HashMap<String, Object>();
			
			salesCallEntryMap.put("objective", bean.getObjective());
			salesCallEntryMap.put("commodity", bean.getCommodity());
			salesCallEntryMap.put("date", bean.getDate());
			salesCallEntryMap.put("nextCallDate", bean.getNextCallDate());
			salesCallEntryMap.put("status", bean.getStatus());
			salesCallEntryMap.put("conditionSupport", bean.getConditionSupport());
			salesCallEntryMap.put("reasonSupport", bean.getReasonSupport());
			salesCallEntryMap.put("reasonNotSupport", bean.getReasonNotSupport());
			salesCallEntryMap.put("remarks", bean.getRemarks());
			
			salesCallEntryMap.put("customer", bean.getCustomer());
			salesCallEntryMap.put("customerType", bean.getCustomerType());
			salesCallEntryMap.put("typeOfCall", bean.getTypeOfCall());
			salesCallEntryMap.put("emailId", bean.getEmailId());
			salesCallEntryMap.put("personMet", bean.getPersonMet());
			salesCallEntryMap.put("assignTo", bean.getAssignTo());
			salesCallEntryMap.put("visitDate", bean.getVisitDate());
			salesCallEntryMap.put("modeOfContact", bean.getModeOfContact());
			salesCallEntryMap.put("designation", bean.getDesignation()); 
			  
			Integer salesCallHdrId = namedParameterJdbcTemplate.queryForObject(LpoQueryUtil.INSERT_SALESENTRY_HDR,salesCallEntryMap,Integer.class);

			  if(salesCallHdrId != null) {
					 
				     if(bean.getSalescallEntryDetailBean().size()>0) {
				             
				    	 for(LpoDetailBean SalescallEntryDetailBean: bean.getSalescallEntryDetailBean() )
		    {
				    		 Map<String, Object> salesCallEntryDtlMap = new HashMap<String, Object>();
			salesCallEntryDtlMap.put("salesCallHdrId", salesCallHdrId);
			salesCallEntryDtlMap.put("objective", SalescallEntryDetailBean.getObjective());
			salesCallEntryDtlMap.put("commodity", SalescallEntryDetailBean.getCommodity());
			salesCallEntryDtlMap.put("date", SalescallEntryDetailBean.getDate());
			salesCallEntryDtlMap.put("nextCallDate", SalescallEntryDetailBean.getNextCallDate());
			salesCallEntryDtlMap.put("status", SalescallEntryDetailBean.getStatus());
			salesCallEntryDtlMap.put("conditionSupport", SalescallEntryDetailBean.getConditionSupport());
			salesCallEntryDtlMap.put("reasonSupport", SalescallEntryDetailBean.getReasonSupport());
			salesCallEntryDtlMap.put("reasonNotSupport", SalescallEntryDetailBean.getReasonNotSupport());
			salesCallEntryDtlMap.put("remarks", SalescallEntryDetailBean.getRemarks());

			  namedParameterJdbcTemplate.update(LpoQueryUtil.INSERT_SALESENTRY_DTL,salesCallEntryDtlMap);
			  
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
			resultBean.setSalesCallEntryBean(jdbcTemplate.queryForObject(LpoQueryUtil.SELECT_SALESENTRY_HDR,new Object[] { bean }, new BeanPropertyRowMapper<LpoBean>(LpoBean.class)));
			
			List<LpoDetailBean> salescallEntryDetailBean = jdbcTemplate.query(LpoQueryUtil.SELECT_SALESENTRY_DTL,new Object[] { bean },new BeanPropertyRowMapper<LpoDetailBean>(LpoDetailBean.class));	
			  resultBean.setSalescallEntryDetailBean(salescallEntryDetailBean);		
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
			Map<String, Object> salesCallEntryMap = new HashMap<String, Object>();
			
			salesCallEntryMap.put("customer", bean.getCustomer());
			salesCallEntryMap.put("customerType", bean.getCustomerType());
			salesCallEntryMap.put("typeOfCall", bean.getTypeOfCall());
			salesCallEntryMap.put("emailId", bean.getEmailId());
			salesCallEntryMap.put("personMet", bean.getPersonMet());
			salesCallEntryMap.put("assignTo", bean.getAssignTo());
			salesCallEntryMap.put("visitDate", bean.getVisitDate());
			salesCallEntryMap.put("modeOfContact", bean.getModeOfContact());
			salesCallEntryMap.put("designation", bean.getDesignation());
			salesCallEntryMap.put("salesCallHdrId",bean.getSalesCallHdrId());

			namedParameterJdbcTemplate.update(LpoQueryUtil.UPDATE_SALESENTRY_HDR,salesCallEntryMap);
			
			if(bean.getSalescallEntryDetailBean().size()>0) {
					 
				  jdbcTemplate.update(LpoQueryUtil.DELETE_SALESENTRY_DTL,bean.getSalesCallHdrId());
				

					
			             
			    	for(LpoDetailBean SalescallEntryDetailBean: bean.getSalescallEntryDetailBean() ){
			    	
				    		 Map<String, Object> salesCallEntryDtlMap = new HashMap<String, Object>();
				 			salesCallEntryDtlMap.put("salesCallHdrId", SalescallEntryDetailBean.getSalesCallHdrId());
				 			salesCallEntryDtlMap.put("objective", SalescallEntryDetailBean.getObjective());
				 			salesCallEntryDtlMap.put("commodity", SalescallEntryDetailBean.getCommodity());
				 			salesCallEntryDtlMap.put("date", SalescallEntryDetailBean.getDate());
				 			salesCallEntryDtlMap.put("nextCallDate", SalescallEntryDetailBean.getNextCallDate());
				 			salesCallEntryDtlMap.put("status", SalescallEntryDetailBean.getStatus());
				 			salesCallEntryDtlMap.put("conditionSupport", SalescallEntryDetailBean.getConditionSupport());
				 			salesCallEntryDtlMap.put("reasonSupport", SalescallEntryDetailBean.getReasonSupport());
				 			salesCallEntryDtlMap.put("reasonNotSupport", SalescallEntryDetailBean.getReasonNotSupport());
				 			salesCallEntryDtlMap.put("remarks", SalescallEntryDetailBean.getRemarks());
				  
							  namedParameterJdbcTemplate.update(LpoQueryUtil.INSERT_SALESENTRY_DTL,salesCallEntryDtlMap);
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
	public LpoResultBean delete(Integer salesCallHdrId) throws Exception {
		LpoResultBean resultBean = new LpoResultBean();
		resultBean.setSuccess(false);
		try {
			if(salesCallHdrId!=null) {
				jdbcTemplate.update(LpoQueryUtil.DELETE_SALESENTRY_HDR,salesCallHdrId);
				jdbcTemplate.update(LpoQueryUtil.DELETE_SALESENTRY_DTL,salesCallHdrId);
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
