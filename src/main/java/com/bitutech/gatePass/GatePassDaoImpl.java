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

import com.bitutech.itemMaster.ItemMasterBean;
import com.bitutech.itemMaster.ItemMasterDetailBean;
import com.bitutech.itemMaster.ItemMasterQueryUtil;
import com.bitutech.itemMaster.ItemMasterResultBean;

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

	@Override
	public GatePassResultBean edit(Integer bean) throws Exception {
		GatePassResultBean resultBean = new GatePassResultBean();
		 resultBean.setSuccess(false);
		 try {
		 resultBean.setGatePassBean(jdbcTemplate.queryForObject(GatePassQueryUtil. SELECT_GATE_PASS,new Object[] { bean }, new
		  BeanPropertyRowMapper<GatePassBean>(GatePassBean.class)));
		 
		 
			List<GatePassDtlBean> gatePassDtlBean = jdbcTemplate.query(GatePassQueryUtil.SELECT_GATE_PASS_DTL,
					new Object[] { bean },
					new BeanPropertyRowMapper<GatePassDtlBean>(GatePassDtlBean.class));	
			  resultBean.setGatePassDtlBean(gatePassDtlBean);
		  resultBean.setSuccess(true);
		  } catch(Exception e)
		    {
			  e.printStackTrace();
			  }
		  return resultBean; 
		  }

	@Override
	public GatePassResultBean update(GatePassBean itemMaster) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GatePassResultBean delete(Integer bean) throws Exception {
		GatePassResultBean resultBean = new GatePassResultBean();
		try {
			if(bean!=null) {
				jdbcTemplate.update(GatePassQueryUtil.DELETE_GATE_PASS_hdr,bean);
				jdbcTemplate.update(GatePassQueryUtil.DELETE_GATE_PASS_DTL,bean);
				
			}
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}	
		return resultBean;
	}

}
