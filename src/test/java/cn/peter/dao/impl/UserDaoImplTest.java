package cn.peter.dao.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.peter.pojo.po.User;
import cn.peter.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-aop-test2.xml"})
public class UserDaoImplTest {

	@Autowired
	User user;
	@Autowired
	UserDaoImpl userdao;
	@Autowired
	IUserService userservice;
	
	@Test
	public void testSave() {
		user.setId(1);
		user.setUsername("Peter");
		user.setPassword("123");
		//userdao.save(user);
		userservice.save(user);
	}

}
