package com.bitutech.grn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitutech.core.util.CustomException;


@RestController
@RequestMapping("/api/auth/app/grn")
public class GRNController {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(GRNController.class);
	
	@Autowired
	GRNService grnService ;
	
	@RequestMapping(value = "/listGRN")
	public @ResponseBody GRNResultBean getGRNMasterList() throws CustomException, InterruptedException {
		GRNResultBean objGRNResultBean = new GRNResultBean();
		try {
			objGRNResultBean.setlGRNBean(grnService.getGRNMasterList());
			objGRNResultBean.setSuccess(true);
		} catch (Exception e) {
			LOGGER.error("Error", e);
			throw new CustomException();
		}
		return objGRNResultBean;
	}
	
	
	@RequestMapping(value = "/getPOList")
	public @ResponseBody GRNResultBean getPOList() throws CustomException {
		GRNResultBean sVendor = new GRNResultBean();
		try {
			sVendor = grnService.getPOList();
		} catch (Exception e) {
			LOGGER.error("Error", e);
			throw new CustomException();
		}
		return sVendor;
	}

	
	@RequestMapping("/getPODtlList")
	public @ResponseBody GRNResultBean getPODtlList(@RequestParam("poId") int poId) throws CustomException {
		GRNResultBean sVendor = new GRNResultBean();
		try {
			sVendor = grnService.getPODtlList(poId);
		} catch (Exception e) {
			LOGGER.error("Error", e);
			throw new CustomException();
		}
		return sVendor;
	}
	
	@RequestMapping("/getRequisition")
	public @ResponseBody GRNResultBean getRequisition(@RequestParam("poId") int poId) throws CustomException {
		GRNResultBean sVendor = new GRNResultBean();
		try {
			sVendor = grnService.getRequisition(poId);
		} catch (Exception e) {
			LOGGER.error("Error", e);
			throw new CustomException();
		}
		return sVendor;
	}
	
	@RequestMapping("/getLocationList")
	public @ResponseBody GRNResultBean getLocationList() throws CustomException {
		GRNResultBean sLocation = new GRNResultBean();
		try {
			sLocation = grnService.getParentLocationList();
		} catch (Exception e) {
			LOGGER.error("Error", e);
			throw new CustomException();
		}
		return sLocation;
	}
	
	@RequestMapping("/getVendorList")
	public @ResponseBody GRNResultBean getVendorList() throws CustomException {
		GRNResultBean sVendor = new GRNResultBean();
		try {
			sVendor = grnService.getVendorList();
		} catch (Exception e) {
			LOGGER.error("Error", e);
			throw new CustomException();
		}
		return sVendor;
	}

	
	@RequestMapping("/getVendorAddress")
	public @ResponseBody GRNResultBean getVendorAddress(@RequestParam("vendorId") int vendorId) throws CustomException {
		GRNResultBean sVendor = new GRNResultBean();
		try {
			sVendor = grnService.getVendorAddress(vendorId);
		} catch (Exception e) {
			LOGGER.error("Error", e);
			throw new CustomException();
		}
		return sVendor;
	}
	
	@RequestMapping("/grnAutoIncrementNo")
	public @ResponseBody GRNResultBean grnAutoIncrementNo() throws CustomException {
		GRNResultBean objGRNResultBean = new GRNResultBean();
		String code = null;
		try {
			code = grnService.grnAutoIncrementNo();
			objGRNResultBean.setCode(code);
		} catch (Exception e) {
			LOGGER.error("Error", e);
			throw new CustomException();
		}
		return objGRNResultBean;
	}
	
	@RequestMapping(value = "/saveGRN", method = RequestMethod.POST)
	public @ResponseBody boolean saveGrn(@RequestBody GRNBean bean) throws Exception {
		boolean isSuccess = false;
		GRNResultBean objGRNResultBean = new GRNResultBean();
		try {
			isSuccess = grnService.saveGrn(bean);
			objGRNResultBean.setSuccess(isSuccess);
		} catch (Exception e) {
			LOGGER.error("Error", e);
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	@RequestMapping("/getGrnEditData")
	public @ResponseBody GRNResultBean getGrnEditData(@RequestParam("grnCode") String grnCode) throws CustomException {
		GRNResultBean editData = null;
		try {
			editData = grnService.getGrnEditData(grnCode);
		} catch (Exception e) {
			LOGGER.error("Error", e);
			throw new CustomException();
		}
		return editData;
	}
	
	@RequestMapping("/getItemAttributes")
	public @ResponseBody GRNResultBean getItemAttributes(@RequestParam("itemId") int itemId) throws CustomException {
		GRNResultBean bean = new GRNResultBean();
		try {
			bean.setItemAttributes(grnService.getItemAttributes(itemId));
		} catch (Exception e) {
			LOGGER.error("Error", e);
			throw new CustomException();
		}
		return bean;
	}


}
