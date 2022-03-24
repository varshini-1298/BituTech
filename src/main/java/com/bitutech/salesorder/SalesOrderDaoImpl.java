package com.bitutech.salesorder;

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
public class SalesOrderDaoImpl implements SalesOrderDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public SalesOrderResultBean save(SalesOrderBean bean) throws Exception {
		SalesOrderResultBean resultBean = new SalesOrderResultBean();
		try {
			Map<String, Object> salesOrderMap = new HashMap<String, Object>();
		    
			salesOrderMap.put("customer", bean.getCustomer());
			salesOrderMap.put("validFrom", bean.getValidFrom());
			salesOrderMap.put("validTo", bean.getValidTo());
			
			namedParameterJdbcTemplate.update(SalesOrderQueryUtil.INSERT_SALES_ORDER,salesOrderMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<SalesOrderBean> getSalesOrderList() throws Exception {
		List<SalesOrderBean> salesOrderBean = new ArrayList<SalesOrderBean>();
		try {
			salesOrderBean = jdbcTemplate.query(SalesOrderQueryUtil.getSalesOrderList, new BeanPropertyRowMapper<SalesOrderBean>(SalesOrderBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return salesOrderBean;
	}

	@Override
	public List<SalesOrderBean> getUomcateList() throws Exception {
		List<SalesOrderBean> salesOrderBean = new ArrayList<SalesOrderBean>();
		try {
			salesOrderBean = jdbcTemplate.query(SalesOrderQueryUtil.getUomcategoryList, new BeanPropertyRowMapper<SalesOrderBean>(SalesOrderBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return salesOrderBean;
	}


}
