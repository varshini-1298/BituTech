package com.bitutech.commodity;

import java.io.Serializable;
import java.util.List;

import com.bitutech.core.util.BasicResultBean;

public class CommodityResultBean extends BasicResultBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	

	public boolean Success;
	
	private List<CommodityBean> commodityListDetails;
	private CommodityBean CommodityMasterBean;
	
	public final CommodityBean getCommodityMasterBean() {
		return CommodityMasterBean;
	}

	public final void setCommodityMasterBean(CommodityBean commodityMasterBean) {
		CommodityMasterBean = commodityMasterBean;
	}
	
	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public List<CommodityBean> getCommodityListDetails() {
		return commodityListDetails;
	}

	public void setCommodityListDetails(List<CommodityBean> commodityListDetails) {
		this.commodityListDetails = commodityListDetails;
	}

	
}
