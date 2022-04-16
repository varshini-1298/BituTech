package com.bitutech.uom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.bitutech.boo.BillOfOperationBean;
import com.bitutech.boo.BillOfOperationQueryUtil;
import com.bitutech.boo.BillOfOperationResultBean;
import com.bitutech.countrymaster.CountryMasterBean;
import com.bitutech.countrymaster.CountryMasterQueryUtil;

@Repository
public class UomDaoImpl implements UomDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;


	@Override
	public UomResultBean save(UomBean bean) throws Exception {
		UomResultBean resultBean = new UomResultBean();
		try {
			Map<String, Object> uomCategoryMap = new HashMap<String, Object>();
		    
			uomCategoryMap.put("unitMeasure", bean.getUnitMeasure());
			uomCategoryMap.put("uomCategory", bean.getUomCategory());
			uomCategoryMap.put("description", bean.getDescription());;
			
			namedParameterJdbcTemplate.update(UomQueryUtil.INSERT_UOM,uomCategoryMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}

	@Override
	public List<UomBean> getUomList() throws Exception {
		List<UomBean> uomCategoryBean = new ArrayList<UomBean>();
		try {
			uomCategoryBean = jdbcTemplate.query(UomQueryUtil.getUomList, new BeanPropertyRowMapper<UomBean>(UomBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return uomCategoryBean;
	}

	@Override
	public List<UomBean> getUomcateList() throws Exception {
		List<UomBean> objUomMasterBean = new ArrayList<UomBean>();
		try {
			objUomMasterBean = jdbcTemplate.query(UomQueryUtil.getUomcategoryList, new BeanPropertyRowMapper<UomBean>(UomBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return objUomMasterBean;
	}

	@Override
	public UomResultBean update(UomBean bean) throws Exception {
		UomResultBean resultBean = new UomResultBean();
		try {
			jdbcTemplate.update(UomQueryUtil.UPDATE_UOM,bean.getUnitMeasure(),bean.getUomCategory(),bean.getDescription(),Integer.parseInt(bean.getId()));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return resultBean;
	}
	
	@Override
	public UomResultBean edit(Integer bean) throws Exception {
		UomResultBean resultBean = new UomResultBean();
		try {
			resultBean.setUomBean(jdbcTemplate.queryForObject(UomQueryUtil.SELECT_UOM,new Object[] { bean }, new BeanPropertyRowMapper<UomBean>(UomBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		return resultBean;
	}
	
	//delete
		@Override
		public UomResultBean delete(Integer id) throws Exception {
			UomResultBean resultBean = new UomResultBean();
			try {
				if(id!=null) {
					jdbcTemplate.update(UomQueryUtil.DELETE_UOM,id);
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
