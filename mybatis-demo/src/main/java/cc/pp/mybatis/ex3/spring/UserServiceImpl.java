package cc.pp.mybatis.ex3.spring;

public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int countAll() {
		return this.userDao.countAll();
	}

}
