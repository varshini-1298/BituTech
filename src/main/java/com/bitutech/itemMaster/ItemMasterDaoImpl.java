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
	public ItemMasterResultBean save(ItemMasterBean bean) throws Exception {
		ItemMasterResultBean resultBean = new ItemMasterResultBean();
		try {
			Map<String, Object> itemMasterMap = new HashMap<String, Object>();
		    
			itemMasterMap.put("itemType", bean.getItemType());
			itemMasterMap.put("itemName", bean.getItemName());
			itemMasterMap.put("itemDescription", bean.getItemDescription());
			itemMasterMap.put("itemCode", bean.getItemCode());
			itemMasterMap.put("saleable", bean.getSaleable());
			itemMasterMap.put("purchaseable", bean.getPurchaseable());
					    
		   jdbcTemplate.update(ItemMasterQueryUtil.INSERT_ITEM_MASTER,itemMasterMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			 resultBean.setSuccess(false);
		}
		
		return resultBean;
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
