package com.bitutech.bankreceipt;

import java.util.List;

public interface BankReceiptDao {
	
	BankReceiptResultBean save(BankReceiptBean bean) throws Exception;
	
	List<BankReceiptBean> getCurrencyList() throws Exception;
	
	List<BankReceiptBean> getChequeNo() throws Exception;

}
