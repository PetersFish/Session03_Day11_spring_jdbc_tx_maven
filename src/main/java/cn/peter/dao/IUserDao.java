package cn.peter.dao;

import org.springframework.stereotype.Repository;

import cn.peter.pojo.po.User;

@Repository
public interface IUserDao {

	//�洢user
	int save(User user);
	
	//��ѯuser
	User getById(Integer id);
	
	//����user
	int update(User user);
	
	//ɾ��user
	int delete(User user);
}
