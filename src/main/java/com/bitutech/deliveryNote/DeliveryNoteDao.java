package com.bitutech.deliveryNote;

import java.util.List;

public interface DeliveryNoteDao {
	
	DeliveryNoteResultBean save(DeliveryNoteBean bean) throws Exception;
	
	List<DeliveryNoteBean> getOrganizationList() throws Exception;
	
	List<DeliveryNoteBean> getSourceList() throws Exception;
	
	List<DeliveryNoteBean> getDestinationList() throws Exception;

}
