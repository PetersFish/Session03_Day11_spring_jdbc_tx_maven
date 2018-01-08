package cn.peter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.peter.dao.IUserDao;
import cn.peter.pojo.po.User;
import cn.peter.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserDao userdao;

	@Override
	public int save(User user) {
		System.out.println("+++++++++++Ôö¼Óuser++++++++++++");
		return userdao.save(user);
	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
