package com.bitutech.billofmaterial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitutech.core.util.DropDownList;

@Service
public class BillOfMaterialServiceImpl implements BillOfMaterialService {
	@Autowired
	BillOfMaterialDao billOfMaterialDao;

	@Override
	public BillOfMaterialResultBean save(BillOfMaterialHdrObjBean bean) throws Exception {
		return billOfMaterialDao.save(bean);
	}

	@Override
	public BillOfMaterialResultBean getList() throws Exception {
		// TODO Auto-generated method stub
		return billOfMaterialDao.getList();
	}
	@Override
	public BillOfMaterialResultBean getWorkOrderList() throws Exception {
		// TODO Auto-generated method stub
		return billOfMaterialDao.getWorkOrderList();
	}

	@Override
	public BillOfMaterialResultBean getBomNumber() throws Exception {
		// TODO Auto-generated method stub
		return billOfMaterialDao.getBomNumber();
	}

	


	
}
