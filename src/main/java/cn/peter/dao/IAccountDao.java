package cn.peter.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface IAccountDao {

	//add money to account
	int inMoney(Integer from, Double amount);
	
	//minus money from account
	int deMoney(Integer from, Double amount);
}
