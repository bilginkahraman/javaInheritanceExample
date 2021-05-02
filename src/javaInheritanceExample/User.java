package javaInheritanceExample;

public class User {
	private int id;
	private String adress;
	private String email;
	
	public User() {
		
	}
	

	public User(int id, String adress, String email) {
		
		this.id = id;
		this.adress = adress;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}

}
