package com.bitutech.departmentmaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentMasterDaoImpl implements DepartmentMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public DepartmentMasterBean save(DepartmentMasterBean bean) throws Exception {
		DepartmentMasterBean departmentMasterBean = new DepartmentMasterBean();
		try {
			Map<String, Object> departmentMasterMap = new HashMap<String, Object>();
		     
		   jdbcTemplate.update(DepartmentMasterQueryUtil.INSERT_DEPARTMENT_MASTER,departmentMasterMap);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return departmentMasterBean;
	}

	@Override
	public List<DepartmentMasterBean> getDepartmentList() throws Exception {
		List<DepartmentMasterBean> objCustomerMasterBean = new ArrayList<DepartmentMasterBean>();
		try {
			objCustomerMasterBean = jdbcTemplate.query(DepartmentMasterQueryUtil.getDepartmentList, new BeanPropertyRowMapper<DepartmentMasterBean>(DepartmentMasterBean.class));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return objCustomerMasterBean;
	}


}
