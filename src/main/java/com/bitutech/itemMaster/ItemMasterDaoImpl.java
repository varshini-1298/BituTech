package com.bitutech.itemMaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemMasterDaoImpl implements ItemMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public ItemMasterBean save(ItemMasterBean bean) throws Exception {
		ItemMasterBean itemMasterBean = new ItemMasterBean();
		try {
			Map<String, Object> itemMasterMap = new HashMap<String, Object>();
		    
		    
		   jdbcTemplate.update(ItemMasterQueryUtil.INSERT_ITEM_MASTER,itemMasterMap);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return itemMasterBean;
	}

	@Override
	public List<ItemMasterBean> getItemList() throws Exception {
		List<ItemMasterBean> objCustomerMasterBean = new ArrayList<ItemMasterBean>();
		try {
			objCustomerMasterBean = jdbcTemplate.query(ItemMasterQueryUtil.getItemList, new BeanPropertyRowMapper<ItemMasterBean>(ItemMasterBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objCustomerMasterBean;
	}


}
