package cn.peter.service;

import org.springframework.stereotype.Component;

import cn.peter.pojo.po.User;

@Component
public interface IUserService {

	//´æ´¢user
	int save(User user);
	
	//²éÑ¯user
	User getById(Integer id);
	
	//¸üÐÂuser
	int update(User user);
	
	//É¾³ýuser
	int delete(User user);
}
