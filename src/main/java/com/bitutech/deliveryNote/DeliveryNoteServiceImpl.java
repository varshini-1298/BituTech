package com.bitutech.deliveryNote;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitutech.countrymaster.CountryMasterBean;

@Service
public class DeliveryNoteServiceImpl implements DeliveryNoteService {
	@Autowired
	DeliveryNoteDao deliveryNoteDao;

	@Override
	public DeliveryNoteResultBean save(DeliveryNoteBean bean) throws Exception {
		return deliveryNoteDao.save(bean);
	}

	@Override
	public List<DeliveryNoteBean> getOrganizationList() throws Exception {
		return deliveryNoteDao.getOrganizationList();
	}

	@Override
	public List<DeliveryNoteBean> getSourceList() throws Exception {
		return deliveryNoteDao.getSourceList();
	}

	@Override
	public List<DeliveryNoteBean> getDestinationList() throws Exception {
		return deliveryNoteDao.getDestinationList();
	}
	

	


}
