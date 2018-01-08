package cn.peter.service;

import org.springframework.stereotype.Component;

import cn.peter.pojo.po.User;

@Component
public interface IUserService {

	//�洢user
	int save(User user);
	
	//��ѯuser
	User getById(Integer id);
	
	//����user
	int update(User user);
	
	//ɾ��user
	int delete(User user);
}
