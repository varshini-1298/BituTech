package com.bitutech.deliveryNote;

import java.io.Serializable;
import java.util.List;

public class DeliveryNoteResultBean extends DeliveryNoteBean implements Serializable{
	private static final long serialVersionUID = 1L;

	public boolean Success;
	
	private List<DeliveryNoteBean> deliveryNoteDetails;
	private List<DeliveryNoteBean> organizationList;
	private List<DeliveryNoteBean> sourceList;
	private List<DeliveryNoteBean> destinationList;
	
	public boolean isSuccess() {
		return Success;
	}
	
	public void setSuccess(boolean success) {
		Success = success;
	}
	
	public List<DeliveryNoteBean> getDeliveryNoteDetails(){
		return deliveryNoteDetails;
	}
	
	public void setDeliveryNoteDetails(List<DeliveryNoteBean> deliveryNoteDetails) {
		this.deliveryNoteDetails = deliveryNoteDetails;
	}
	
	public List<DeliveryNoteBean> getorganizationList(){
		return organizationList;
	}
	
	public void setOrganizationList(List<DeliveryNoteBean> organizationList) {
		this.organizationList=organizationList;
	}
	
	public List<DeliveryNoteBean> getSourceList(){
		return sourceList;
	}
	
	public void setSourceList(List<DeliveryNoteBean> sourceList) {
		this.sourceList = sourceList;
	}
	
	public List<DeliveryNoteBean> getDestinationList(){
		return destinationList;
	}
	
	public void setDestinationList(List<DeliveryNoteBean> destinationList) {
		this.destinationList = destinationList;
	}
}
