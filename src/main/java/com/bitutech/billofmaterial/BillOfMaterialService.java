package com.bitutech.billofmaterial;

import java.util.List;

import com.bitutech.core.util.DropDownList;

public interface BillOfMaterialService {

	BillOfMaterialResultBean save(BillOfMaterialHdrObjBean bean) throws Exception;

	BillOfMaterialResultBean getList() throws Exception;
	
	BillOfMaterialResultBean getWorkOrderList() throws Exception;
	
	BillOfMaterialResultBean getBomNumber() throws Exception;
	
	
}