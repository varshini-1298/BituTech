package com.bitutech.gatePass;

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
public class GatePassDaoImpl implements GatePassDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Override
	public GatePassResultBean save(GatePassBean bean) throws Exception {
		GatePassResultBean resultBean = new GatePassResultBean();
		try {
			Map<String, Object> gatePassMap = new HashMap<String, Object>();
			
			gatePassMap.put("organizationName",bean.getOrganizationName());
			gatePassMap.put("location",bean.getLocation());
			gatePassMap.put("deliveryOrderNo",bean.getDeliveryOrderNo());
		
			namedParameterJdbcTemplate.update(GatePassQueryUtil.INSERT_GATE_PASS,gatePassMap);
			resultBean.setSuccess(false);
		}
		catch(Exception e){
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}

	@Override
	public List<GatePassBean> getOrganizationList() throws Exception {
		List<GatePassBean> objGatePassBean = new ArrayList<GatePassBean>();
		try {
			objGatePassBean = jdbcTemplate.query(GatePassQueryUtil.getOrganizationList,new BeanPropertyRowMapper<GatePassBean>(GatePassBean.class));
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return objGatePassBean;
	}

	@Override
	public List<GatePassBean> getLocationList() throws Exception {
		List<GatePassBean> objGatePassBean = new ArrayList<GatePassBean>();
		try {
			objGatePassBean = jdbcTemplate.query(GatePassQueryUtil.getLocationList,new BeanPropertyRowMapper<GatePassBean>(GatePassBean.class));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return objGatePassBean;
	}

}
