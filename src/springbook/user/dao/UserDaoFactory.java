package springbook.user.dao;

public class UserDaoFactory {
	public UserDao userDao() {
		UserDao dao = new UserDao(connectionMaker());
		return dao;
	}

	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
