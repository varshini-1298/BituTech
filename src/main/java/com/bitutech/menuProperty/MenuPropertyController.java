package com.bitutech.menuProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags="BituTech", description=" Menu Property")
@RestController
@RequestMapping("/api/auth/menuProperty")
public class MenuPropertyController {
	
	@Autowired
	private MenuPropertyService menuPropertyService;
	
	
	@ApiOperation(value = "MenuProperty Controller")
	@PostMapping("/getMenuProperty")
	private MenuPropertyResultBean getMenuProperty(@RequestBody MenuPropertyBean employeeMasterBean) {
		MenuPropertyResultBean menuPropertyResultBean = new MenuPropertyResultBean();
		try {
			menuPropertyResultBean = menuPropertyService.getMenuProperty(employeeMasterBean);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return menuPropertyResultBean;

	}
}
