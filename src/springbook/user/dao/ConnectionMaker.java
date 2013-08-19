package springbook.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
<<<<<<< HEAD
<<<<<<< HEAD

	public abstract Connection makeConnection() throws ClassNotFoundException,
			SQLException;

}
=======
	public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
=======
	public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
>>>>>>> 334a0c662ee534448b4d6090dd1bd43619526bc4
