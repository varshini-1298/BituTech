package com.bitutech.menuProperty;

import com.bitutech.core.util.CustomException;

public interface MenuPropertyDao {
	public MenuPropertyResultBean getMenuProperty(MenuPropertyBean menuPropertyBean) throws CustomException;
	
}
