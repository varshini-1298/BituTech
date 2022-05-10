package com.bitutech.grn;

import java.util.List;

import com.bitutech.core.util.CustomException;

public interface GRNService {

	GRNResultBean getPOList();

	GRNResultBean getPODtlList(int poId);

	GRNResultBean getRequisition(int poId);

	GRNResultBean getParentLocationList();

	GRNResultBean getVendorAddress(int vendorId);

	GRNResultBean getVendorList();

	String grnAutoIncrementNo();

	boolean saveGrn(GRNBean bean);

	List<GRNBean> getGRNMasterList() throws CustomException;

	GRNResultBean getGrnEditData(String grnCode);

	GRNPurchaseOrderBean getItemAttributes(int itemId);

}
