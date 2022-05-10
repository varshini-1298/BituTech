package com.bitutech.grn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitutech.core.util.CustomException;


@Service
public class GRNServiceImpl implements GRNService{
	
	@Autowired
	GRNDao grnDao;

	@Override
	public GRNResultBean getPOList() {
		// TODO Auto-generated method stub
		return grnDao.getPOList();
	}

	@Override
	public GRNResultBean getPODtlList(int poId) {
		// TODO Auto-generated method stub
		return grnDao.getPODtlList(poId);
	}

	@Override
	public GRNResultBean getRequisition(int poId) {
		// TODO Auto-generated method stub
		return grnDao.getRequisition(poId);
	}

	@Override
	public GRNResultBean getParentLocationList() {
		// TODO Auto-generated method stub
		return grnDao.getParentLocationList();
	}

	@Override
	public GRNResultBean getVendorAddress(int vendorId) {
		// TODO Auto-generated method stub
		return grnDao.getVendorAddress(vendorId);
	}

	@Override
	public GRNResultBean getVendorList() {
		// TODO Auto-generated method stub
		return grnDao.getVendorList();
	}

	@Override
	public String grnAutoIncrementNo() {
		// TODO Auto-generated method stub
		return grnDao.grnAutoIncrementNo();
	}

	@Override
	public boolean saveGrn(GRNBean bean) {
		// TODO Auto-generated method stub
		return grnDao.saveGrn(bean);
	}

	@Override
	public List<GRNBean> getGRNMasterList() throws CustomException {
		// TODO Auto-generated method stub
		return grnDao.getGRNMasterList();
	}

	@Override
	public GRNResultBean getGrnEditData(String grnCode) {
		// TODO Auto-generated method stub
		return grnDao.getGrnEditData(grnCode);
	}

	@Override
	public GRNPurchaseOrderBean getItemAttributes(int itemId) {
		// TODO Auto-generated method stub
		return grnDao.getItemAttributes(itemId);
	}
	
	

}
