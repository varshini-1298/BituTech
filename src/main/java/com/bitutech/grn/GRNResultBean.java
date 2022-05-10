package com.bitutech.grn;

import java.util.List;

public class GRNResultBean {
	
	private List<GRNBean> lRequisitionList;
	
	private List<GRNPurchaseOrderBean> lRequisitionDtl;
	
	private List<GRNBean> lPurchaseOrder;
	
	private List<GRNPurchaseOrderBean> lPurchaseOrderDtl;
	
	private List<GRNPurchaseOrderBean> lVendorAddressDtl;
	
	private List<GRNBean>lLocationLst;
	
	private List<GRNBean> lVendor;
	
	private List<GRNBean> lGRNBean;
	
	private String code;
	
	private boolean success;
	
	private double grnFreight;
	
	private double grnOtherCharges;
	
	public GRNBean editBeanData;
	
	private GRNPurchaseOrderBean itemAttributes;

	public List<GRNBean> getlRequisitionList() {
		return lRequisitionList;
	}

	public void setlRequisitionList(List<GRNBean> lRequisitionList) {
		this.lRequisitionList = lRequisitionList;
	}

	public List<GRNPurchaseOrderBean> getlRequisitionDtl() {
		return lRequisitionDtl;
	}

	public void setlRequisitionDtl(List<GRNPurchaseOrderBean> lRequisitionDtl) {
		this.lRequisitionDtl = lRequisitionDtl;
	}

	public List<GRNBean> getlPurchaseOrder() {
		return lPurchaseOrder;
	}

	public void setlPurchaseOrder(List<GRNBean> lPurchaseOrder) {
		this.lPurchaseOrder = lPurchaseOrder;
	}

	public List<GRNPurchaseOrderBean> getlPurchaseOrderDtl() {
		return lPurchaseOrderDtl;
	}

	public void setlPurchaseOrderDtl(List<GRNPurchaseOrderBean> lPurchaseOrderDtl) {
		this.lPurchaseOrderDtl = lPurchaseOrderDtl;
	}

	public double getGrnFreight() {
		return grnFreight;
	}

	public void setGrnFreight(double grnFreight) {
		this.grnFreight = grnFreight;
	}

	public double getGrnOtherCharges() {
		return grnOtherCharges;
	}

	public void setGrnOtherCharges(double grnOtherCharges) {
		this.grnOtherCharges = grnOtherCharges;
	}

	public List<GRNBean> getlLocationLst() {
		return lLocationLst;
	}

	public void setlLocationLst(List<GRNBean> lLocationLst) {
		this.lLocationLst = lLocationLst;
	}

	public List<GRNPurchaseOrderBean> getlVendorAddressDtl() {
		return lVendorAddressDtl;
	}

	public void setlVendorAddressDtl(List<GRNPurchaseOrderBean> lVendorAddressDtl) {
		this.lVendorAddressDtl = lVendorAddressDtl;
	}

	public List<GRNBean> getlVendor() {
		return lVendor;
	}

	public void setlVendor(List<GRNBean> lVendor) {
		this.lVendor = lVendor;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<GRNBean> getlGRNBean() {
		return lGRNBean;
	}

	public void setlGRNBean(List<GRNBean> lGRNBean) {
		this.lGRNBean = lGRNBean;
	}

	public GRNBean getEditBeanData() {
		return editBeanData;
	}

	public void setEditBeanData(GRNBean editBeanData) {
		this.editBeanData = editBeanData;
	}

	public GRNPurchaseOrderBean getItemAttributes() {
		return itemAttributes;
	}

	public void setItemAttributes(GRNPurchaseOrderBean itemAttributes) {
		this.itemAttributes = itemAttributes;
	}
	
	
	

	
	
	
	

}
