package com.bitutech.purchase.LPO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LpoServiceImpl implements LpoService {
	@Autowired
	LpoDao lpoDao;

	@Override
	public LpoResultBean save(LpoBean bean) throws Exception {
		// TODO Auto-generated method stub
		return lpoDao.save(bean);
	}

	@Override
	public List<LpoBean> getList() throws Exception {
		// TODO Auto-generated method stub
		return lpoDao.getList();
	}

	@Override
	public LpoResultBean edit(Integer bean) throws Exception {
		// TODO Auto-generated method stub
		return lpoDao.edit(bean);
	}

	@Override
	public LpoResultBean update(LpoBean bean) throws Exception {
		// TODO Auto-generated method stub
		return lpoDao.update(bean);
	}

	@Override
	public LpoResultBean delete(Integer bean) throws Exception {
		// TODO Auto-generated method stub
		return lpoDao.delete(bean);
	}

}
