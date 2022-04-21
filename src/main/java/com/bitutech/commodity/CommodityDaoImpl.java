package com.bitutech.commodity;

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
public class CommodityDaoImpl implements CommodityDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public CommodityResultBean save(CommodityBean bean) throws Exception {
		CommodityResultBean resultBean = new CommodityResultBean();
		try {
			Map<String, Object> commodityMap = new HashMap<String, Object>();
		    
			commodityMap.put("commodity", bean.getCommodity());
			commodityMap.put("imdgClass", bean.getImdgClass());
			commodityMap.put("classification", bean.getClassification());
			commodityMap.put("hsCode", bean.getHsCode());
			commodityMap.put("imdgcodePage", bean.getImdgcodePage());
			commodityMap.put("blClause", bean.getBlClause());
			commodityMap.put("unNo", bean.getUnNo());
			commodityMap.put("flashPoint", bean.getFlashPoint());
			String commodityCode =  jdbcTemplate.queryForObject(CommodityQueryUtil.save_Commodity, String.class);
			commodityMap.put("commodityCode", commodityCode);
			
			namedParameterJdbcTemplate.update(CommodityQueryUtil.INSERT_UOM,commodityMap);
		   resultBean.setSuccess(true);
		   
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
	}
	

	@Override
	public List<CommodityBean> getCommodityList() throws Exception {
		List<CommodityBean> uomCategoryBean = new ArrayList<CommodityBean>();
		try {
			uomCategoryBean = jdbcTemplate.query(CommodityQueryUtil.getUomList, new BeanPropertyRowMapper<CommodityBean>(CommodityBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return uomCategoryBean;
	}

	@Override
	public CommodityResultBean edit(String commodityCode) throws Exception {
		CommodityResultBean resultBean = new CommodityResultBean();
		resultBean.setSuccess(false);
		try {
			
			resultBean.setCommodityBean(jdbcTemplate.queryForObject(CommodityQueryUtil.SELECT_COMMODITY_MASTER,new Object[] { commodityCode }, new BeanPropertyRowMapper<CommodityBean>(CommodityBean.class)));
			resultBean.setSuccess(true);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return resultBean; 
	}

	@Override
	public CommodityResultBean update(CommodityBean bean) throws Exception {
		CommodityResultBean resultBean = new CommodityResultBean();
		try {
			
			  Map<String, Object> commodityMap = new HashMap<String, Object>();
			  commodityMap.put("commodity", bean.getCommodity());
				commodityMap.put("imdgClass", bean.getImdgClass());
				commodityMap.put("classification", bean.getClassification());
				commodityMap.put("hsCode", bean.getHsCode());
				commodityMap.put("imdgcodePage", bean.getImdgcodePage());
				commodityMap.put("blClause", bean.getBlClause());
				commodityMap.put("unNo", bean.getUnNo());
				commodityMap.put("flashPoint", bean.getFlashPoint());
				commodityMap.put("commodityCode", bean.getCommodityCode());
				
			  namedParameterJdbcTemplate.update(CommodityQueryUtil.
			  UPDATE_COMMODITY_MASTER,commodityMap);
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return resultBean;
	}

	@Override
	public CommodityResultBean delete(String commodityCode) throws Exception {
		CommodityResultBean resultBean = new CommodityResultBean();
		try {
			if(commodityCode!=null) {
				jdbcTemplate.update(CommodityQueryUtil.DELETE_COMMODITY_MASTER,commodityCode);
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
