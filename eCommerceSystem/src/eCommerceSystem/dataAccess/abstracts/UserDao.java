package eCommerceSystem.dataAccess.abstracts;

import java.util.List;

import eCommerceSystem.entities.concretes.User;

public interface UserDao {
	
	public void add (User user);
	
	public void login(User user);
	
	
	User get(int id);
	User getEmail();
	List<User> getAll();
	
	
	
	

}
