package com.bitutech.deliveryNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DeliveryNoteDaoImpl implements DeliveryNoteDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public DeliveryNoteResultBean save(DeliveryNoteBean bean) throws Exception {
		DeliveryNoteResultBean resultBean = new DeliveryNoteResultBean();
		try {
			Map<String, Object> deliveryNoteMap = new HashMap<String, Object>();
			
			deliveryNoteMap.put("organizationName", bean.getOrganizationName());
			deliveryNoteMap.put("sourceLocation", bean.getSourceLocation());
			deliveryNoteMap.put("destinationLocation", bean.getDestinationLocation());
			
			namedParameterJdbcTemplate.update(DeliveryNoteQueryUtil.INSERT_DELIVERY_NOTE,deliveryNoteMap);
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}

	@Override
	public List<DeliveryNoteBean> getOrganizationList() throws Exception {
		List<DeliveryNoteBean> objDeliveryNoteBean = new ArrayList<DeliveryNoteBean>();
		try {
			objDeliveryNoteBean = jdbcTemplate.query(DeliveryNoteQueryUtil.getOrganizationList, new BeanPropertyRowMapper<DeliveryNoteBean>(DeliveryNoteBean.class));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objDeliveryNoteBean;
	}

	@Override
	public List<DeliveryNoteBean> getSourceList() throws Exception {
		List<DeliveryNoteBean> objDeliveryNoteBean = new ArrayList<DeliveryNoteBean>();
		try {
			objDeliveryNoteBean = jdbcTemplate.query(DeliveryNoteQueryUtil.getSourceList, new BeanPropertyRowMapper<DeliveryNoteBean>(DeliveryNoteBean.class));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objDeliveryNoteBean;
	}

	@Override
	public List<DeliveryNoteBean> getDestinationList() throws Exception {
		List<DeliveryNoteBean> objDeliveryNoteBean = new ArrayList<DeliveryNoteBean>();
		try {
			objDeliveryNoteBean = jdbcTemplate.query(DeliveryNoteQueryUtil.getDestinationList, new BeanPropertyRowMapper<DeliveryNoteBean>(DeliveryNoteBean.class));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objDeliveryNoteBean;
	}

}
