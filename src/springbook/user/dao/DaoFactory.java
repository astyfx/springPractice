package springbook.user.dao;

<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DaoFactory {
	
	@Bean
	public UserDao userDao() {
		UserDao dao = new UserDao(connectionMaker());
		return dao;
	}
	@Bean
=======
=======
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
public class DaoFactory {
	public UserDao userDao() {
		UserDao userDao = new UserDao(connectionMaker());
		return userDao;
	}
	
<<<<<<< HEAD
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
=======
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
