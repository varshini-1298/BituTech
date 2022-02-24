package com.bitutech.menuProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bitutech.common.ErrorMessage;
import com.bitutech.core.util.CustomException;
import com.bitutech.usermanagement.User;

@Repository
public class MenuPropertyDaoImpl implements MenuPropertyDao{
	private final static Logger LOGGER = LoggerFactory.getLogger(MenuPropertyDaoImpl.class);
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public MenuPropertyResultBean getMenuProperty(MenuPropertyBean menuPropertyBean) throws CustomException {
		MenuPropertyResultBean objEmployeeMasterResultBean = new MenuPropertyResultBean();
		objEmployeeMasterResultBean.setSuccess(false);
		try {
			
			
			
			Map<String, Object> empMap = new HashMap<String, Object>();
			
			
			objEmployeeMasterResultBean.setSuccess(true);

		} catch (Exception e) {
			LOGGER.error("Error in Menu Property", e);
			objEmployeeMasterResultBean.setSuccess(false);
			objEmployeeMasterResultBean.setMessage(ErrorMessage.ERROR_MenuList);
			throw new CustomException(ErrorMessage.ERROR_MenuList);
		}
		
		return objEmployeeMasterResultBean;
	}
}
