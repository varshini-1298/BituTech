package com.bitutech.bankreceipt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;

@RestController
@RequestMapping("/api/auth/app/bankReceipt")
public class BankReceiptController {
	
	@Autowired
	BankReceiptService bankReceiptService;
	
	@RequestMapping(value="/save")
	public BankReceiptResultBean save (@RequestBody BankReceiptBean bean) {
		BankReceiptResultBean objbean = new BankReceiptResultBean();
		try {
			objbean = bankReceiptService.save(bean);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return objbean;
	}
	
	@RequestMapping(value="/getList")
	public BankReceiptResultBean getCurrencyList() throws Exception{
		BankReceiptResultBean objResultBean = new BankReceiptResultBean();
		objResultBean.setBankReceiptDetails(bankReceiptService.getCurrencyList());
		objResultBean.setSuccess(true);
		return objResultBean;
	}
	
	@RequestMapping(value="/getCurrencyList")
	public BankReceiptResultBean getChequeNo() throws Exception{
		BankReceiptResultBean objResultBean = new BankReceiptResultBean();
		objResultBean.setCurrencyList(bankReceiptService.getCurrencyList());
		objResultBean.setSuccess(true);
		return objResultBean;
	}

}
