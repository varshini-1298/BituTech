package com.bitutech.bankreceipt;

import java.util.List;

public interface BankReceiptService {
	
	BankReceiptResultBean save(BankReceiptBean bean) throws Exception;
	
	public List<BankReceiptBean> getCurrencyList() throws Exception;
	
	public List<BankReceiptBean> getChequeNo() throws Exception;

}
