package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "Luizh123$";
	
	private Connection connect() {
		
		Connection con = null;
		
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
			
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void insertContact(JavaBeans contact) {
		String create = "insert into contacts (name, phone, email) values (?,?,?)";
		
		try {
			Connection con = connect();
			
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, contact.getName());
			pst.setString(2, contact.getPhone());
			pst.setString(3, contact.getEmail());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
