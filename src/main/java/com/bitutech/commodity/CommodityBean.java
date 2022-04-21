package com.bitutech.commodity;

public class CommodityBean {
	
	private String commodity;
	private String imdgClass;
	private String classification;
	private String hsCode;
	private String imdgcodePage;	
	private String blClause;
	private String unNo;
	private String flashPoint;
	private String commodityCode;
	private boolean hazardous;
	
	public final boolean isHazardous() {
		return hazardous;
	}
	public final void setHazardous(boolean hazardous) {
		this.hazardous = hazardous;
	}
	public final String getCommodityCode() {
		return commodityCode;
	}
	public final void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getImdgClass() {
		return imdgClass;
	}
	public void setImdgClass(String imdgClass) {
		this.imdgClass = imdgClass;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getHsCode() {
		return hsCode;
	}
	public void setHsCode(String hsCode) {
		this.hsCode = hsCode;
	}
	public String getImdgcodePage() {
		return imdgcodePage;
	}
	public void setImdgcodePage(String imdgcodePage) {
		this.imdgcodePage = imdgcodePage;
	}
	public String getBlClause() {
		return blClause;
	}
	public void setBlClause(String blClause) {
		this.blClause = blClause;
	}
	public String getUnNo() {
		return unNo;
	}
	public void setUnNo(String unNo) {
		this.unNo = unNo;
	}
	public String getFlashPoint() {
		return flashPoint;
	}
	public void setFlashPoint(String flashPoint) {
		this.flashPoint = flashPoint;
	}
	
	
	
	
	
	
	
	
}
