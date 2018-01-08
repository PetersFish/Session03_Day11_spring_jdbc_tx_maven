package cn.peter.dao;

import cn.peter.pojo.po.User;

public interface IUserDao {

	//´æ´¢user
	int save(User user);
	
	//²éÑ¯user
	User getById(Integer id);
	
	//¸üĞÂuser
	int update(User user);
	
	//É¾³ıuser
	int delete(User user);
}
