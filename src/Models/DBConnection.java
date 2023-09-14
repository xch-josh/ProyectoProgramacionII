package Models;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection implements AutoCloseable {
	Connection cnn;
	
	public Connection Connect(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cnn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/bdnegocio", "root", "Alessis#23");
			return cnn;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	@Override
	public void close(){
		try {
			cnn.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
