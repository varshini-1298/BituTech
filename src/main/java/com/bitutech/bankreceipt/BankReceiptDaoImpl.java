package com.bitutech.bankreceipt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bitutech.countrymaster.CountryMasterQueryUtil;

@Repository
public class BankReceiptDaoImpl implements BankReceiptDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public BankReceiptResultBean save(BankReceiptBean bean) throws Exception {
		BankReceiptResultBean resultBean = new BankReceiptResultBean();
		try {
			Map<String, Object> bankReceiptMap = new HashMap<String, Object>();
			bankReceiptMap.put("currencyCode",bean.getCurrency());
			bankReceiptMap.put("chequeNo",bean.getChequeNo());
			bankReceiptMap.put("amount",bean.getAmount());
			
			namedParameterJdbcTemplate.update(BankReceiptQueryUtil.INSERT_BANK_RECEIPT,bankReceiptMap);
			resultBean.setSuccess(true);			
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<BankReceiptBean> getCurrencyList() throws Exception {
		List<BankReceiptBean> objBankReceiptBean = new ArrayList<BankReceiptBean>();
		try {
			objBankReceiptBean = jdbcTemplate.query(BankReceiptQueryUtil.getCurrencyList,new BeanPropertyRowMapper<BankReceiptBean>(BankReceiptBean.class));
		}
		catch(Exception e){
			e.printStackTrace();			
		}
		return objBankReceiptBean;
  	}

	@Override
	public List<BankReceiptBean> getChequeNo() throws Exception {
		List<BankReceiptBean> objBankReceiptBean = new ArrayList<BankReceiptBean>();
		try {
			objBankReceiptBean = jdbcTemplate.query(BankReceiptQueryUtil.getChequeNo,new BeanPropertyRowMapper<BankReceiptBean>(BankReceiptBean.class));
		}
		catch(Exception e){
			e.printStackTrace();			
		}
		return objBankReceiptBean;
	}
	

}
