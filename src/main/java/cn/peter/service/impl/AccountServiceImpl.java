package cn.peter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.peter.dao.IAccountDao;
import cn.peter.service.IAccountService;

@Service
public class AccountServiceImpl implements IAccountService {

	@Autowired
	IAccountDao adao;
	
	//@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public int transfer(Integer from, Integer to, Double amount) {
		adao.deMoney(from, amount);
		int i = 10/0;
		adao.inMoney(to, amount);
		return 1;
	}

}
