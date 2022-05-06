package com.bitutech.purchase.LPO;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;


public class LpoResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public boolean success;

	public List<LpoBean> lpoDetails;
	private List<LpoDetailBeanOne> LpoDetailBeanOne;
	private List<LpoDetailBeanTwo> LpoDetailBeanTwo;
	private LpoBean lpoBean;
	
	public List<LpoBean> getLpoDetails() {
		return lpoDetails;
	}

	public void setLpoDetails(List<LpoBean> lpoDetails) {
		this.lpoDetails = lpoDetails;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public LpoBean getLpoBean() {
		return lpoBean;
	}

	public void setLpoBean(LpoBean lpoBean) {
		this.lpoBean = lpoBean;
	}
	public List<LpoDetailBeanOne> getLpoDetailBeanOne() {
		return LpoDetailBeanOne;
	}

	public void setLpoDetailBeanOne(List<LpoDetailBeanOne> lpoDetailBeanOne) {
		LpoDetailBeanOne = lpoDetailBeanOne;
	}
	public List<LpoDetailBeanTwo> getLpoDetailBeanTwo() {
		return LpoDetailBeanTwo;
	}

	public void setLpoDetailBeanTwo(List<LpoDetailBeanTwo> lpoDetailBeanTwo) {
		LpoDetailBeanTwo = lpoDetailBeanTwo;
	}

}
