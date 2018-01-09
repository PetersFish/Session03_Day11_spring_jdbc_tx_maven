package cn.peter.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import cn.peter.dao.IUserDao;
import cn.peter.pojo.po.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	JdbcTemplate template = null;
	
	@Override
	public int save(User user) {
		String sql = "insert into user values (?,?,?)";
		return template.update(sql , user.getId(), user.getUsername(), user.getPassword());
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
