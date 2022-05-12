package com.bitutech.inventory.deliveryorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryOrderServiceImpl implements DeliveryOrderService {
	@Autowired
	DeliveryOrderDao deliveryOrderDao;

	@Override
	public DeliveryOrderResultBean getDeliveryOrderList() throws Exception {
		// TODO Auto-generated method stub
		return deliveryOrderDao.getDeliveryOrderList();
	}

	@Override
	public DeliveryOrderResultBean saveOrUpdateDO(DeliveryOrder bean) throws Exception {
		// TODO Auto-generated method stub
		return deliveryOrderDao.saveOrUpdateDO(bean);
	}

	@Override
	public DeliveryOrderResultBean editDO(String doNumber) throws Exception {
		// TODO Auto-generated method stub
		return deliveryOrderDao.editDO(doNumber);
	}

	@Override
	public DeliveryOrderResultBean deleteDO(String doNumber, String userId) throws Exception {
		// TODO Auto-generated method stub
		return deliveryOrderDao.deleteDO(doNumber, userId);
	}

	@Override
	public DeliveryOrderResultBean getCompanyList() {
		// TODO Auto-generated method stub
		return deliveryOrderDao.getCompanyList();
	}

	@Override
	public DeliveryOrderResultBean getCustomerList() {
		// TODO Auto-generated method stub
		return deliveryOrderDao.getCustomerList();
	}

	@Override
	public DeliveryOrderResultBean getLocationList() {
		// TODO Auto-generated method stub
		return deliveryOrderDao.getLocationList();
	}

	@Override
	public DeliveryOrderResultBean getItemList() {
		// TODO Auto-generated method stub
		return deliveryOrderDao.getItemList();
	}

}
