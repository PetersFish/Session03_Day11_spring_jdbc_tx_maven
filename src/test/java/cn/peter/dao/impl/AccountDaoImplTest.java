package cn.peter.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.peter.dao.IAccountDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-jdbc-tx-test1.xml"})
public class AccountDaoImplTest {

	@Autowired
	IAccountDao adao;
	
	@Test
	public void test() {
		adao.deMoney(2, 100.0);
	}
	
}
