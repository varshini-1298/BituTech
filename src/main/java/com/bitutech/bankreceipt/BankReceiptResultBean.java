package com.bitutech.bankreceipt;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class BankReceiptResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean Success;
	
	private List<BankReceiptBean> BankReceiptDetails;
	private List<BankReceiptBean> currencyList;
	
	public boolean isSuccess() {
		return Success;
	}
	
	public void setSuccess(boolean success) {
		Success = success;
	}
	
	public List<BankReceiptBean> getBankReceiptDetails() {
		return BankReceiptDetails;
	}

	public void setBankReceiptDetails(List<BankReceiptBean> BankReceiptDetails) {
		this.BankReceiptDetails = BankReceiptDetails;
	}
	
	public List<BankReceiptBean> getCurrencyList() {
		return currencyList;
	}
	
	public void setCurrencyList(List<BankReceiptBean> currencyList) {
		this.currencyList=currencyList;
	}
}
