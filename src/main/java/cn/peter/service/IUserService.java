package cn.peter.service;

import org.springframework.stereotype.Service;

import cn.peter.pojo.po.User;

@Service
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
