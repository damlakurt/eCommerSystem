package eCommerceSystem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;

public class BasicUserDao implements UserDao{
	

	
public ArrayList<User> users=new ArrayList<User>();
	
	public BasicUserDao(ArrayList<User> users) {
		super();
		this.users = users;
	}
	
	
	@Override
	public void add(User user) {
		
		users.add(user);
		System.out.println("Saved to db: ");
		for(User user1:users) {
			System.out.println(user1.getFirstName());
			System.out.println("*********");
		
		
		}}

	
	
		
	

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(User user) {
		

			
		}
	
	

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
