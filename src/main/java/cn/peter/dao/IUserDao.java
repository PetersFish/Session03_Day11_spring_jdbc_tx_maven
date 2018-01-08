package cn.peter.dao;

import org.springframework.stereotype.Repository;

import cn.peter.pojo.po.User;

@Repository
public interface IUserDao {

	//´æ´¢user
	int save(User user);
	
	//²éÑ¯user
	User getById(Integer id);
	
	//¸üÐÂuser
	int update(User user);
	
	//É¾³ýuser
	int delete(User user);
}
