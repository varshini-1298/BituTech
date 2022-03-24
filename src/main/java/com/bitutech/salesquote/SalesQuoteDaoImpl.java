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
			
			namedParameterJdbcTemplate.update(SalesQuoteQueryUtil.INSERT_SALES_QUOTE,salesQuoteMap);
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

	@Override
	public List<SalesQuoteBean> getUomcateList() throws Exception {
		List<SalesQuoteBean> salesOrderBean = new ArrayList<SalesQuoteBean>();
		try {
			salesOrderBean = jdbcTemplate.query(SalesQuoteQueryUtil.getUomcategoryList, new BeanPropertyRowMapper<SalesQuoteBean>(SalesQuoteBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return salesOrderBean;
	}


}
