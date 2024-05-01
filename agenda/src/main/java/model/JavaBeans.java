package model;

public class JavaBeans {
	
	private String idcon;
	private String name;
	private String phone;
	private String email;
	
	public JavaBeans () {
	}
	
	public JavaBeans(String idcon, String name, String phone, String email) {
		super();
		this.idcon = idcon;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getIdcon() {
		return idcon;
	}
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
