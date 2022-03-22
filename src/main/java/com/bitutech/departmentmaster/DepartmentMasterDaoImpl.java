package com.bitutech.departmentmaster;

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
public class DepartmentMasterDaoImpl implements DepartmentMasterDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public DepartmentMasterResultBean save(DepartmentMasterBean bean) throws Exception {
		DepartmentMasterResultBean resultBean = new DepartmentMasterResultBean();
		try {
			Map<String, Object> departmentMasterMap = new HashMap<String, Object>();
			
			departmentMasterMap.put("departmentName",bean.getDepartmentName());
			departmentMasterMap.put("departmentHead", bean.getDepartmentHead());
			departmentMasterMap.put("deptStatus", bean.isDeptStatus());
			departmentMasterMap.put("remarks", bean.getRemarks());
			String deptCode = jdbcTemplate.queryForObject(DepartmentMasterQueryUtil.GET_DEPT_CODE, String.class);
			departmentMasterMap.put("deptCode", deptCode);
			namedParameterJdbcTemplate.update(DepartmentMasterQueryUtil.INSERT_DEPARTMENT_MASTER,departmentMasterMap);
		   resultBean.setSuccess(true);
		}catch(Exception e) {
			e.printStackTrace();
			resultBean.setSuccess(false);
		}
		
		return resultBean;
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
