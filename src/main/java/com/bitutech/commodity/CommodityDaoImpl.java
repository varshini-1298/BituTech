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


}
