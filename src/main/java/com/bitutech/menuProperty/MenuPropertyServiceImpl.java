package com.bitutech.menuProperty;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitutech.core.util.CustomException;
import com.bitutech.usermanagement.User;

@Service
public class MenuPropertyServiceImpl implements MenuPropertyService{
	@Autowired
	MenuPropertyDao menuPropertyDao;
	
	@Override
	public MenuPropertyResultBean getMenuProperty(MenuPropertyBean menuPropertyBean) throws CustomException {
		// TODO Auto-generated method stub
		return menuPropertyDao.getMenuProperty(menuPropertyBean);
	}

}
