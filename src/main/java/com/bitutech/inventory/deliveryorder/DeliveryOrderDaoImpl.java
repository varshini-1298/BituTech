package com.bitutech.inventory.deliveryorder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bitutech.common.Selectivity;

@Repository
public class DeliveryOrderDaoImpl implements DeliveryOrderDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public DeliveryOrderResultBean getDeliveryOrderList() {
		DeliveryOrderResultBean rb = new DeliveryOrderResultBean();
		DeliveryOrder objbean = new DeliveryOrder();
		List<DeliveryOrder> deliveryOrderList = null;
 		try { 
			deliveryOrderList = jdbcTemplate.query(new DeliveryOrderQueryUtil().getDeliveyOrderList,new Object[] {objbean.getDeliveryNo() }, new BeanPropertyRowMapper<DeliveryOrder>(DeliveryOrder.class));
			rb.setDeliveryOrderList(deliveryOrderList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return rb;
	}

	@Override
	public DeliveryOrderResultBean saveOrUpdateDO(DeliveryOrder bean) throws Exception {
		DeliveryOrderResultBean rb = new DeliveryOrderResultBean();
		String doNumber = null;
		bean.setUserId("E0001");
		try {
			doNumber = jdbcTemplate.queryForObject(new DeliveryOrderQueryUtil().saveOrUpdateDO(bean.getAction(), bean), String.class);
			if(bean.getDeliveryOrderDtlList() != null && !bean.getDeliveryOrderDtlList().isEmpty()) {
				String itemstr = "";
				for(DeliveryOrderDtl dtlBean: bean.getDeliveryOrderDtlList()) {
					if(itemstr.isEmpty()) {
						itemstr = dtlBean.getItemId()+","+dtlBean.getItemQty()+","+dtlBean.getGinDtlId();
					}else {
						itemstr = itemstr+"#-#"+dtlBean.getItemId()+"-"+dtlBean.getItemQty()+"-"+dtlBean.getGinDtlId();
					}
				}
				jdbcTemplate.execute(new DeliveryOrderQueryUtil().saveOrUpdateDODtl(bean.getAction(), doNumber, itemstr, bean.getUserId()));
			}
			rb.setSuccess(true);
		}catch(Exception e){
			rb.setSuccess(false);
			if(e.getMessage() != null) {
				rb.setMessage(e.getMessage());
			}
			e.printStackTrace();
		}
		return rb;
	}
	
	@Override
	public DeliveryOrderResultBean deleteDO(String doNumber, String userId) {
		DeliveryOrderResultBean rb = new DeliveryOrderResultBean();
		try {
			jdbcTemplate.update(new DeliveryOrderQueryUtil().deleteDeliveryOrderDtl, doNumber);
			jdbcTemplate.update(new DeliveryOrderQueryUtil().deleteDeliveryOrder, doNumber);
			rb.setSuccess(true);
		}catch(Exception e){
			rb.setSuccess(false);
			if(e.getMessage() != null) {
				rb.setMessage(e.getMessage());
			}
			e.printStackTrace();
		}
		return rb;
	}

	@Override
	public DeliveryOrderResultBean editDO(String doNumber) throws Exception {
		DeliveryOrderResultBean rb = new DeliveryOrderResultBean();
		DeliveryOrder deliveryOrder = null;
		List<DeliveryOrderDtl> deliveryOrderDtlList = null;
		try {
			deliveryOrder = jdbcTemplate.queryForObject(new DeliveryOrderQueryUtil().getDeliveyOrderList, 
					new BeanPropertyRowMapper<DeliveryOrder>(DeliveryOrder.class), doNumber);
			deliveryOrderDtlList = jdbcTemplate.query(new DeliveryOrderQueryUtil().getDeliveryOrderDtlList, 
					new BeanPropertyRowMapper<DeliveryOrderDtl>(DeliveryOrderDtl.class), doNumber);
			deliveryOrder.setDeliveryOrderDtlList(deliveryOrderDtlList);
			rb.setDeliveryOrder(deliveryOrder);
		}catch(Exception e){
			e.printStackTrace();
		}
		return rb;
	}

	@Override
	public DeliveryOrderResultBean getCompanyList() {
		DeliveryOrderResultBean rb = new DeliveryOrderResultBean();
		List<Selectivity> companyList = null;
		try {
			companyList = jdbcTemplate.query(new DeliveryOrderQueryUtil().getCompanyList, new BeanPropertyRowMapper<Selectivity>(Selectivity.class));
			rb.setCompanyList(companyList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return rb;
	}

	@Override
	public DeliveryOrderResultBean getCustomerList() {
		DeliveryOrderResultBean rb = new DeliveryOrderResultBean();
		List<Selectivity> customerList = null;
		try {
			customerList = jdbcTemplate.query(new DeliveryOrderQueryUtil().getCustomerList, new BeanPropertyRowMapper<Selectivity>(Selectivity.class));
			rb.setCustomerList(customerList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return rb;
	}

	@Override
	public DeliveryOrderResultBean getLocationList() {
		DeliveryOrderResultBean rb = new DeliveryOrderResultBean();
		List<Selectivity> locationList = null;
		try {
			locationList = jdbcTemplate.query(new DeliveryOrderQueryUtil().getLocationList, new BeanPropertyRowMapper<Selectivity>(Selectivity.class));
			rb.setLocationList(locationList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return rb;
	}

	@Override
	public DeliveryOrderResultBean getItemList() {
		DeliveryOrderResultBean rb = new DeliveryOrderResultBean();
		List<Selectivity> itemList = null;
		try {
			itemList = jdbcTemplate.query(new DeliveryOrderQueryUtil().getItemList, new BeanPropertyRowMapper<Selectivity>(Selectivity.class));
			rb.setItemList(itemList);
		}catch(Exception e){
			e.printStackTrace();
		}
		return rb;
	}

}
