package springbook.user.dao;

import java.sql.SQLException;

<<<<<<< HEAD
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

=======
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
import springbook.user.domain.User;

public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
<<<<<<< HEAD
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		
		UserDao dao = context.getBean("userDao", UserDao.class);

		User user = new User();
		user.setId("astyfx");
		user.setName("애스티");
		user.setPassword("dotmxl");

		dao.add(user);
			
		System.out.println(user.getId() + " 등록 성공");
=======
		UserDao dao = new DaoFactory().userDao();
		
		User user = new User();
		user.setId("astyfx");
		user.setName("�ֽ�Ƽ");
		user.setPassword("dotmxl");
		
		dao.add(user);
			
		System.out.println(user.getId() + " ��� ����");
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
			
<<<<<<< HEAD
		System.out.println(user2.getId() + " 조회 성공");
=======
		System.out.println(user2.getId() + " ��ȸ ����");
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
	}
}
