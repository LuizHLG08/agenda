package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	
	public ArrayList<JavaBeans> listContacts() {
		
		ArrayList<JavaBeans> contacts = new ArrayList<>();
		
		String read = "select * from contacts order by name";
		
		try {
			Connection con = connect();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				String idcon =  rs.getString(1);
				String name =  rs.getString(2);
				String phone =  rs.getString(3);
				String email =  rs.getString(4);
				
				contacts.add(new JavaBeans(idcon, name, phone, email));
			}
			
			con.close();
			return contacts;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
}
