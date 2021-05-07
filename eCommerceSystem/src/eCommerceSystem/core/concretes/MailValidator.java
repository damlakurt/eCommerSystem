package eCommerceSystem.core.concretes;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceSystem.core.abstracts.ValidatorService;
import eCommerceSystem.entities.concretes.User;

public class MailValidator implements ValidatorService{
	
	
	String mailPattern="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern = Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);
	
	
	@Override
   public boolean checkUser(User user) {
	Matcher matcher = pattern.matcher(user.getePosta());
	if (matcher.matches()==true) {
		System.out.println("Mail formatý Basarýlý ");
		return true;
		
	}
	System.out.println("Geçersiz mail formatý.");
	return false;
	
	}


	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}
	

}
