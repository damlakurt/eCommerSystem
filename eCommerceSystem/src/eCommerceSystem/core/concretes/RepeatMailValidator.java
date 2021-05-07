package eCommerceSystem.core.concretes;

import java.util.ArrayList;

import eCommerceSystem.core.abstracts.ValidatorService;
import eCommerceSystem.entities.concretes.User;

public class RepeatMailValidator implements ValidatorService{
	
private ArrayList<String> mails=new ArrayList<String>();
	
	
	public RepeatMailValidator(ArrayList<String> mails) {
		super();
		this.mails = mails;
	}


	@Override
	public boolean checkUser(User user) {
		if(mails.isEmpty()) {
			System.out.println("Mail adresi daha önce kaydedilmedi...");
			mails.add(user.getePosta());
			return true;
		}
		 for (String mail : mails) {
			if(mail==user.getePosta()) {
				System.out.println("Bu mail adresi zaten var..");
				return false;
		}	
		}
		 System.out.println("Mail adresi daha önce kaydedilmedi...");
			mails.add(user.getePosta());
			return true;

}


	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}
}