package cn.peter.service.impl;

import org.springframework.stereotype.Component;

import cn.peter.pojo.po.User;
import cn.peter.service.IUserService;

@Component
public class UserServiceImpl implements IUserService {

	@Override
	public int save(User user) {
		System.out.println("+++++++++++Ôö¼Óuser++++++++++++");
		return 0;
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
