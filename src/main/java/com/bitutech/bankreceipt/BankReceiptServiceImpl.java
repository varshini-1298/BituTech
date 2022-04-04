package com.bitutech.bankreceipt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankReceiptServiceImpl implements BankReceiptService {
	
	@Autowired
	BankReceiptDao bankReceiptDao;
	
	@Override
	public BankReceiptResultBean save(BankReceiptBean bean) throws Exception{
		return bankReceiptDao.save(bean);
	}
	
	@Override
	public List<BankReceiptBean> getCurrencyList() throws Exception{
		return bankReceiptDao.getCurrencyList();
	}
	
	@Override
	public List<BankReceiptBean> getChequeNo() throws Exception{
		return bankReceiptDao.getChequeNo();
	}
	

}
