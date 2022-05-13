package com.bitutech.grn;

import java.util.List;

public class GRNBean {
	
	private int grnId;
	private String grnCode;
	private int locId;
	private String locName;
	private int vendorId;
	private String vendorName;
	private String vendorCode;
	private int poId;
	private String poNo;
	private String grnDate;
	private int purchaseType;
	private int poRequisitionId;
	private String poRequisition;
	private String poRequisitionDate;
	private String delOrderNo;
	private String delOrderDate;
	private String invoiceNo;
	private String invoiceDate;
	private String dueDate;
	private String costcenter;

	private String purchaseUOM;
	private double purchaseQty;
	private String purchaseUOMName;

	private String costCenterName;
				
	private int deliveryMthd;
	private int transMode;
	private List<GRNPurchaseOrderBean> poDetailData;
	private List<GRNPurchaseOrderBean> poDetailData2;
	private List<GRNPurchaseOrderBean> scheduleData;
	private int id;
	private String text;
	private int dstLocId;
	private String dstLocName;
	private String poType;
	private String conTransferNo;
	//private List<GRNPurchaseOrderBean> schDtlList;
	private int grnStatus;
	private String statusVal;
	private int qcLocationId;
	private String qcLocationName;
	private String companyId;
	private String companyName;
	private double poFreight;

	private String status;
	private String sourceLocationId;
	private String description;
	private double finalTotal;
	private double freight;
	private String remarksforother;
	private double totalAmount;
	// public String vendorName;
	public String vendorAddress;
	public String vendorPhone;
	public String entity;
	private double otherCharges;
	private double totalTaxCGST;
	private double totalTaxSGST;
	private double totalTaxIGST;

	private double taxCGSTinPercent;
	private double taxSGSTinPercent;
	private double taxIGSTinPercent;
	//private String budgetTypeName;
	private String preparedBy;
	private double subTotal;
	private double totalDiscount;
	private double freightTax;
	private double freightAmount;
	private String remarks;
	private String amountinWords;
	private String vendorEmail;
	private String organisationName;
	private double oldFreight;

	private double oldOtherCharges;
	public String createdBy;
	public String createdDate;

	private String gstgroupbyPercent;
	private double gstAmtgroupbyPercent;
	//private List<GRNBean> groupList;
	private double fTotal;
	private double roundOf;
	private double totalNetPrice;
	public String transMod;
	
	
	
	public List<GRNPurchaseOrderBean> getScheduleData() {
		return scheduleData;
	}
	public void setScheduleData(List<GRNPurchaseOrderBean> scheduleData) {
		this.scheduleData = scheduleData;
	}
	
	public String getPoRequisition() {
		return poRequisition;
	}
	public void setPoRequisition(String poRequisition) {
		this.poRequisition = poRequisition;
	}
	public String getPoRequisitionDate() {
		return poRequisitionDate;
	}
	public void setPoRequisitionDate(String poRequisitionDate) {
		this.poRequisitionDate = poRequisitionDate;
	}
	public int getGrnId() {
		return grnId;
	}
	public void setGrnId(int grnId) {
		this.grnId = grnId;
	}
	public String getGrnCode() {
		return grnCode;
	}
	public void setGrnCode(String grnCode) {
		this.grnCode = grnCode;
	}
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public String getLocName() {
		return locName;
	}
	public void setLocName(String locName) {
		this.locName = locName;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorCode() {
		return vendorCode;
	}
	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}
	public int getPoId() {
		return poId;
	}
	public void setPoId(int poId) {
		this.poId = poId;
	}
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public String getGrnDate() {
		return grnDate;
	}
	public void setGrnDate(String grnDate) {
		this.grnDate = grnDate;
	}
	public int getPurchaseType() {
		return purchaseType;
	}
	public void setPurchaseType(int purchaseType) {
		this.purchaseType = purchaseType;
	}
	public String getDelOrderNo() {
		return delOrderNo;
	}
	public void setDelOrderNo(String delOrderNo) {
		this.delOrderNo = delOrderNo;
	}
	public String getDelOrderDate() {
		return delOrderDate;
	}
	public void setDelOrderDate(String delOrderDate) {
		this.delOrderDate = delOrderDate;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getCostcenter() {
		return costcenter;
	}
	public void setCostcenter(String costcenter) {
		this.costcenter = costcenter;
	}
	public String getPurchaseUOM() {
		return purchaseUOM;
	}
	public void setPurchaseUOM(String purchaseUOM) {
		this.purchaseUOM = purchaseUOM;
	}
	public double getPurchaseQty() {
		return purchaseQty;
	}
	public void setPurchaseQty(double purchaseQty) {
		this.purchaseQty = purchaseQty;
	}
	public String getPurchaseUOMName() {
		return purchaseUOMName;
	}
	public void setPurchaseUOMName(String purchaseUOMName) {
		this.purchaseUOMName = purchaseUOMName;
	}
	public String getCostCenterName() {
		return costCenterName;
	}
	public void setCostCenterName(String costCenterName) {
		this.costCenterName = costCenterName;
	}
	public int getDeliveryMthd() {
		return deliveryMthd;
	}
	public void setDeliveryMthd(int deliveryMthd) {
		this.deliveryMthd = deliveryMthd;
	}
	public int getTransMode() {
		return transMode;
	}
	public void setTransMode(int transMode) {
		this.transMode = transMode;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getDstLocId() {
		return dstLocId;
	}
	public void setDstLocId(int dstLocId) {
		this.dstLocId = dstLocId;
	}
	public String getDstLocName() {
		return dstLocName;
	}
	public void setDstLocName(String dstLocName) {
		this.dstLocName = dstLocName;
	}
	public String getPoType() {
		return poType;
	}
	public void setPoType(String poType) {
		this.poType = poType;
	}
	public String getConTransferNo() {
		return conTransferNo;
	}
	public void setConTransferNo(String conTransferNo) {
		this.conTransferNo = conTransferNo;
	}
	public int getGrnStatus() {
		return grnStatus;
	}
	public void setGrnStatus(int grnStatus) {
		this.grnStatus = grnStatus;
	}
	public String getStatusVal() {
		return statusVal;
	}
	public void setStatusVal(String statusVal) {
		this.statusVal = statusVal;
	}
	public int getQcLocationId() {
		return qcLocationId;
	}
	public void setQcLocationId(int qcLocationId) {
		this.qcLocationId = qcLocationId;
	}
	public String getQcLocationName() {
		return qcLocationName;
	}
	public void setQcLocationName(String qcLocationName) {
		this.qcLocationName = qcLocationName;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPoFreight() {
		return poFreight;
	}
	public void setPoFreight(double poFreight) {
		this.poFreight = poFreight;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSourceLocationId() {
		return sourceLocationId;
	}
	public void setSourceLocationId(String sourceLocationId) {
		this.sourceLocationId = sourceLocationId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getFinalTotal() {
		return finalTotal;
	}
	public void setFinalTotal(double finalTotal) {
		this.finalTotal = finalTotal;
	}
	public double getFreight() {
		return freight;
	}
	public void setFreight(double freight) {
		this.freight = freight;
	}
	public String getRemarksforother() {
		return remarksforother;
	}
	public void setRemarksforother(String remarksforother) {
		this.remarksforother = remarksforother;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorPhone() {
		return vendorPhone;
	}
	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public double getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(double otherCharges) {
		this.otherCharges = otherCharges;
	}
	public double getTotalTaxCGST() {
		return totalTaxCGST;
	}
	public void setTotalTaxCGST(double totalTaxCGST) {
		this.totalTaxCGST = totalTaxCGST;
	}
	public double getTotalTaxSGST() {
		return totalTaxSGST;
	}
	public void setTotalTaxSGST(double totalTaxSGST) {
		this.totalTaxSGST = totalTaxSGST;
	}
	public double getTotalTaxIGST() {
		return totalTaxIGST;
	}
	public void setTotalTaxIGST(double totalTaxIGST) {
		this.totalTaxIGST = totalTaxIGST;
	}
	public double getTaxCGSTinPercent() {
		return taxCGSTinPercent;
	}
	public void setTaxCGSTinPercent(double taxCGSTinPercent) {
		this.taxCGSTinPercent = taxCGSTinPercent;
	}
	public double getTaxSGSTinPercent() {
		return taxSGSTinPercent;
	}
	public void setTaxSGSTinPercent(double taxSGSTinPercent) {
		this.taxSGSTinPercent = taxSGSTinPercent;
	}
	public double getTaxIGSTinPercent() {
		return taxIGSTinPercent;
	}
	public void setTaxIGSTinPercent(double taxIGSTinPercent) {
		this.taxIGSTinPercent = taxIGSTinPercent;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public double getTotalDiscount() {
		return totalDiscount;
	}
	public void setTotalDiscount(double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	public double getFreightTax() {
		return freightTax;
	}
	public void setFreightTax(double freightTax) {
		this.freightTax = freightTax;
	}
	public double getFreightAmount() {
		return freightAmount;
	}
	public void setFreightAmount(double freightAmount) {
		this.freightAmount = freightAmount;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getVendorEmail() {
		return vendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}
	public String getOrganisationName() {
		return organisationName;
	}
	public void setOrganisationName(String organisationName) {
		this.organisationName = organisationName;
	}
	public double getOldFreight() {
		return oldFreight;
	}
	public void setOldFreight(double oldFreight) {
		this.oldFreight = oldFreight;
	}
	public double getOldOtherCharges() {
		return oldOtherCharges;
	}
	public void setOldOtherCharges(double oldOtherCharges) {
		this.oldOtherCharges = oldOtherCharges;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getGstgroupbyPercent() {
		return gstgroupbyPercent;
	}
	public void setGstgroupbyPercent(String gstgroupbyPercent) {
		this.gstgroupbyPercent = gstgroupbyPercent;
	}
	public double getGstAmtgroupbyPercent() {
		return gstAmtgroupbyPercent;
	}
	public void setGstAmtgroupbyPercent(double gstAmtgroupbyPercent) {
		this.gstAmtgroupbyPercent = gstAmtgroupbyPercent;
	}
	public double getfTotal() {
		return fTotal;
	}
	public void setfTotal(double fTotal) {
		this.fTotal = fTotal;
	}
	public double getRoundOf() {
		return roundOf;
	}
	public void setRoundOf(double roundOf) {
		this.roundOf = roundOf;
	}
	public double getTotalNetPrice() {
		return totalNetPrice;
	}
	public void setTotalNetPrice(double totalNetPrice) {
		this.totalNetPrice = totalNetPrice;
	}
	public String getTransMod() {
		return transMod;
	}
	public void setTransMod(String transMod) {
		this.transMod = transMod;
	}
	public List<GRNPurchaseOrderBean> getPoDetailData() {
		return poDetailData;
	}
	public void setPoDetailData(List<GRNPurchaseOrderBean> poDetailData) {
		this.poDetailData = poDetailData;
	}
	public int getPoRequisitionId() {
		return poRequisitionId;
	}
	public void setPoRequisitionId(int poRequisitionId) {
		this.poRequisitionId = poRequisitionId;
	}

	//private String poAmendNo;
	
	
	


}
