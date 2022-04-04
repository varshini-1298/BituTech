package com.bitutech.deliveryNote;

import java.util.List;

public interface DeliveryNoteService {
	
	DeliveryNoteResultBean save(DeliveryNoteBean bean) throws Exception;
	
	public List<DeliveryNoteBean> getOrganizationList() throws Exception;
	
	public List<DeliveryNoteBean> getSourceList() throws Exception;
	
	public List<DeliveryNoteBean> getDestinationList() throws Exception;

}
