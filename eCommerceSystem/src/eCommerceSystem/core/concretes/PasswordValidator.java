package eCommerceSystem.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSystem.core.abstracts.ValidatorService;
import eCommerceSystem.entities.concretes.User;

public class PasswordValidator implements ValidatorService{
	
	
	String passwordPattern="^.{6,}$";
	Pattern pattern=Pattern.compile(passwordPattern);
	
	
	

	@Override
	public boolean checkUser(User user) {
		
		Matcher matcher=pattern.matcher(user.getPassword());
		if(matcher.matches()==true) {
			System.out.println("Password formatý basarýlý...");
			return true;}
		
		
		
		System.out.println("Geçersiz parola...");
		
		return false;
	}




	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}

}
