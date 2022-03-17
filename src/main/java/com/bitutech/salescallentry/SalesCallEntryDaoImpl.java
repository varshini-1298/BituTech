package com.bitutech.salescallentry;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class SalesCallEntryDaoImpl implements SalesCallEntryDao {

	@Override
	public SalesCallEntryBean save(SalesCallEntryBean bean) throws Exception {
		SalesCallEntryBean salesCallEntryBean = new SalesCallEntryBean();
		try {
			Map<String, Object> salesCallEntry = new HashMap<String, Object>();
			salesCallEntry.put("", salesCallEntryBean.equals(salesCallEntry));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return salesCallEntryBean;
	}

}
