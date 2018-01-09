package cn.peter.service.impl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.peter.service.IAccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-jdbc-tx-test1.xml"})
public class AccountServiceImplTest {
	
	@Autowired
	IAccountService aservice;

	@Test
	public void testTransfer() {
		aservice.transfer(1, 2, 100.0);
	}

}
