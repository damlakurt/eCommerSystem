package eCommerceSystem.core.concretes;

import eCommerceSystem.core.abstracts.ValidatorService;
import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.notiMa.LoginGoogleManager;

public class LoginGoogleManagerAdapter implements ValidatorService {

	
	

	@Override
	public boolean checkUser(User user) {
		
		
		LoginGoogleManager loginGoogleManager = new LoginGoogleManager();
		loginGoogleManager.add(user.getePosta(), user.getPassword());
		
		return true;
		
		

	
	}

	@Override
	public void add(User user) {
System.out.println("Google Hesabýyla Üye Oldu : " +user.getFirstName()+" " +  user.getePosta());		
	}

}
