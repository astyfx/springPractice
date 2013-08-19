package springbook.user.dao;

import java.sql.Connection;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import java.sql.DriverManager;
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
=======
import java.sql.DriverManager;
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

<<<<<<< HEAD
<<<<<<< HEAD
import springbook.user.domain.User; 
=======
import springbook.user.domain.User;
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
=======
import springbook.user.domain.User;
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4

public class UserDao {
	private ConnectionMaker connectionMaker;
	
<<<<<<< HEAD
<<<<<<< HEAD
	public UserDao(ConnectionMaker simpleConnectionMaker) {
		this.connectionMaker = simpleConnectionMaker;
	}

	public void add(User user) throws ClassNotFoundException, SQLException {
		Connection c = this.connectionMaker.makeConnection();
=======
=======
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
	public UserDao(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}
	
	
	public void add(User user) throws ClassNotFoundException, SQLException {
		Connection c = connectionMaker.makeConnection();
<<<<<<< HEAD
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
=======
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4

		PreparedStatement ps = c.prepareStatement(
			"insert into users(id, name, password) values(?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());

		ps.executeUpdate();

		ps.close();
		c.close();
	}

<<<<<<< HEAD
<<<<<<< HEAD
	public User get(String id) throws ClassNotFoundException, SQLException {
		Connection c = this.connectionMaker.makeConnection();
		PreparedStatement ps = c
				.prepareStatement("select * from users where id = ?");
=======
=======
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4

	public User get(String id) throws ClassNotFoundException, SQLException {
		Connection c = connectionMaker.makeConnection();
		
		PreparedStatement ps = c.prepareStatement("select * from users where id = ?");
<<<<<<< HEAD
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
=======
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
		ps.setString(1, id);

		ResultSet rs = ps.executeQuery();
		rs.next();
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));

		rs.close();
		ps.close();
		c.close();

		return user;
	}
<<<<<<< HEAD
<<<<<<< HEAD

	

=======
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
=======
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
}
