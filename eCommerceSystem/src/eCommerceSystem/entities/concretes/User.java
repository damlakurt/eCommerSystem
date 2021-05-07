package eCommerceSystem.entities.concretes;

import eCommerceSystem.entities.abstracts.Entity;

public class User implements Entity{
	int id;
	String firstName;
	String lastName;
	String ePosta;
	String password;
	
	public User() {
		
	}

	public User(int id, String firstName, String lastName, String ePosta, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ePosta = ePosta;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

}
