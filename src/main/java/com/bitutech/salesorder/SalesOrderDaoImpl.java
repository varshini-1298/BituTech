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
import com.bitutech.salesquote.SalesQuoteBean;
import com.bitutech.salesquote.SalesQuoteQueryUtil;
import com.bitutech.salesquote.SalesQuoteResultBean;

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
			salesOrderMap.put("currency", bean.getCurrency());
			salesOrderMap.put("deliveryDate", bean.getDeliveryDate());
			salesOrderMap.put("id", bean.getId());
			salesOrderMap.put("text", bean.getText());
			salesOrderMap.put("modifiedBy","E0001");
			String countValue =  jdbcTemplate.queryForObject(SalesOrderQueryUtil.GETCOUNT, String.class);
			salesOrderMap.put("countValue", countValue);
			
			namedParameterJdbcTemplate.update(SalesOrderQueryUtil.INSERT_SALES_ORDER_HDR,salesOrderMap);
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

//	@Override
//	public List<SalesOrderBean> getUomcateList() throws Exception {
//		List<SalesOrderBean> salesOrderBean = new ArrayList<SalesOrderBean>();
//		try {
//			salesOrderBean = jdbcTemplate.query(SalesOrderQueryUtil.getUomcategoryList, new BeanPropertyRowMapper<SalesOrderBean>(SalesOrderBean.class));
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		return salesOrderBean;
//	}
	//edit
	@Override
	public SalesOrderResultBean edit(String bean) throws Exception {
		SalesOrderResultBean resultBean = new SalesOrderResultBean();
		resultBean.setSuccess(false);
		try {
			resultBean.setSalesOrderBean(jdbcTemplate.queryForObject(SalesOrderQueryUtil.SELECT_SALES_ORDER_HDR,new Object[] { bean }, new BeanPropertyRowMapper<SalesOrderBean>(SalesOrderBean.class)));
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
	public SalesOrderResultBean update(SalesOrderBean Bean) throws Exception {
		SalesOrderResultBean resultBean = new SalesOrderResultBean();
		try {
//			
//		
			jdbcTemplate.queryForObject(SalesOrderQueryUtil.UPDATE_SALES_ORDER_HDR,new BeanPropertyRowMapper<SalesOrderBean>(SalesOrderBean.class), new Object[]
					{ Bean.getCustomer(),Bean.getText(),Bean.getCurrency(),Bean.getDeliveryDate(),Bean.getCountValue()});
				
			resultBean.setSuccess(true);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return resultBean;
	}
	
	@Override
	public SalesOrderResultBean delete(String countValue) throws Exception {
		SalesOrderResultBean resultBean = new SalesOrderResultBean();
		try {
			if(countValue!=null) {
				jdbcTemplate.update(SalesOrderQueryUtil.DELETE_SALES_ORDER_HDR,countValue);
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
