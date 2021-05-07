package eCommerceSystem.core.concretes;

import eCommerceSystem.core.abstracts.ValidatorService;
import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.notiMa.LoginBasicManager;

public class LoginBasicManagerAdapter implements ValidatorService{

	@Override
	public boolean checkUser(User user) {
		
LoginBasicManager loginBasicManager = new LoginBasicManager	();
loginBasicManager.add(user.getePosta(), user.getPassword());

System.out.println("ePosta ve Þifre Alaný Zorunludur");


		return false;
	
	
	
	}

	@Override
	public void add(User user) {
		System.out.println("Temel Kullanýcý Bilgileriyle Giriþ Yapýldý : " + user.getFirstName() );
		
	}

}
