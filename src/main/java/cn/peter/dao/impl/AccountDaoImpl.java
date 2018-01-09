package cn.peter.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.peter.dao.IAccountDao;

@Repository
public class AccountDaoImpl  implements IAccountDao {

	@Autowired
	JdbcTemplate template;
	
	@Override
	public int inMoney(Integer from, Double amount) {
		return template.update("update t_account set amount=amount+? where id=?", new Object[] {amount,from});
	}

	@Override
	public int deMoney(Integer from, Double amount) {
		return template.update("update t_account set amount=amount-? where id=?", new Object[] {amount,from});
	}

	
}
