package com.bitutech.salesquote;

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
import com.bitutech.purchaserequest.PurchaseRequestBean;
import com.bitutech.purchaserequest.PurchaseRequestQueryUtil;
import com.bitutech.purchaserequest.PurchaseRequestResultBean;
import com.bitutech.uomcategory.UomCategoryQueryUtil;
import com.bitutech.uomcategory.UomCategoryResultBean;

@Repository
public class SalesQuoteDaoImpl implements SalesQuoteDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public SalesQuoteResultBean save(SalesQuoteBean bean) throws Exception {
		SalesQuoteResultBean resultBean = new SalesQuoteResultBean();
		
		try {
			
			
			
			Map<String, Object> salesQuoteMap = new HashMap<String, Object>();
		    
			salesQuoteMap.put("customer", bean.getCustomer());
			salesQuoteMap.put("validFrom", bean.getValidFrom());
			salesQuoteMap.put("validTo", bean.getValidTo());
			salesQuoteMap.put("termCondition", bean.getTermCondition());
			salesQuoteMap.put("currency", bean.getCurrency());
			salesQuoteMap.put("expectedDate", bean.getExpectedDate());
			salesQuoteMap.put("id", bean.getId());
			salesQuoteMap.put("text", bean.getText());
			salesQuoteMap.put("modifiedBy","E0001");
			String countValue =  jdbcTemplate.queryForObject(SalesQuoteQueryUtil.GETCOUNT, String.class);
			salesQuoteMap.put("countValue", countValue);
			
			
			namedParameterJdbcTemplate.update(SalesQuoteQueryUtil.INSERT_SALES_QUOTE_HDR,salesQuoteMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<SalesQuoteBean> getSalesQuoteList() throws Exception {
		List<SalesQuoteBean> salesQuoteBean = new ArrayList<SalesQuoteBean>();
		try {
			salesQuoteBean = jdbcTemplate.query(SalesQuoteQueryUtil.getSalesQuoteList, new BeanPropertyRowMapper<SalesQuoteBean>(SalesQuoteBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return salesQuoteBean;
	}

//	@Override
//	public List<SalesQuoteBean> getUomcateList() throws Exception {
//		List<SalesQuoteBean> salesOrderBean = new ArrayList<SalesQuoteBean>();
//		try {
//			salesOrderBean = jdbcTemplate.query(SalesQuoteQueryUtil.getUomcategoryList, new BeanPropertyRowMapper<SalesQuoteBean>(SalesQuoteBean.class));
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		return salesOrderBean;
//	}
	//edit
			@Override
			public SalesQuoteResultBean edit(String bean) throws Exception {
				SalesQuoteResultBean resultBean = new SalesQuoteResultBean();
				resultBean.setSuccess(false);
				try {
					resultBean.setSalesQuoteBean(jdbcTemplate.queryForObject(SalesQuoteQueryUtil.SELECT_SALES_QUOTE_HDR,new Object[] { bean }, new BeanPropertyRowMapper<SalesQuoteBean>(SalesQuoteBean.class)));
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
			public SalesQuoteResultBean update(SalesQuoteBean Bean) throws Exception {
				SalesQuoteResultBean resultBean = new SalesQuoteResultBean();
				try {
//					
//				
					jdbcTemplate.queryForObject(SalesQuoteQueryUtil.UPDATE_SALES_QUOTE_HDR,new BeanPropertyRowMapper<SalesQuoteBean>(SalesQuoteBean.class), new Object[]
							{ Bean.getCustomer(),Bean.getValidFrom(),Bean.getValidTo(),Bean.getTermCondition(),Bean.getCurrency(),Bean.getExpectedDate(),Bean.getCountValue()});
						
					resultBean.setSuccess(true);
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
				return resultBean;
			}
			
			@Override
			public SalesQuoteResultBean delete(String countValue) throws Exception {
				SalesQuoteResultBean resultBean = new SalesQuoteResultBean();
				try {
					if(countValue!=null) {
						jdbcTemplate.update(SalesQuoteQueryUtil.DELETE_SALES_QUOTE_HDR,countValue);
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
