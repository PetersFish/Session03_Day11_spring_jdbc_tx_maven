package cn.peter.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.peter.pojo.po.User;
import cn.peter.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-aop.xml"})
public class UserServiceImplTest {

	@Autowired
	User user;
	
	@Autowired
	IUserService userservice;
	
	@Test
	public void testSave() {
		userservice.save(user);
	}
}
