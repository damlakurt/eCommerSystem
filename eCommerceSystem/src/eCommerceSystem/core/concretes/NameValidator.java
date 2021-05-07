package eCommerceSystem.core.concretes;



import eCommerceSystem.core.abstracts.ValidatorService;
import eCommerceSystem.entities.concretes.User;

public class NameValidator implements ValidatorService {

	@Override
	public boolean checkUser(User user) {
		
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			System.out.println("Geçerli ad soyad...");
			return true;
			
				
			}
				System.out.println("Geçersiz ad soyad..");
		return false;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}
	

	}
