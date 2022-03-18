package com.bitutech.salescallentry;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bitutech.designationmaster.DesignationMasterQueryUtil;

@Repository
public class SalesCallEntryDaoImpl implements SalesCallEntryDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public SalesCallEntryBean save(SalesCallEntryBean bean) throws Exception {
		SalesCallEntryBean salesCallEntryBean = new SalesCallEntryBean();
		try {
			Map<String, Object> salesCallEntryMap = new HashMap<String, Object>();
			
			jdbcTemplate.update(SalesEntryMasterQueryUtil.INSERT_SALESENTRY_MASTER,salesCallEntryMap);

		}catch(Exception e){
			e.printStackTrace();
		}
		
		return salesCallEntryBean;
	}

}
