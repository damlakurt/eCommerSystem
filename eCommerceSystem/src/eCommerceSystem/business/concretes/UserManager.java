package eCommerceSystem.business.concretes;

import java.util.List;

import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.core.abstracts.ValidatorService;
import eCommerceSystem.dataAccess.abstracts.UserDao;
import eCommerceSystem.entities.concretes.User;


public class UserManager implements UserService{
	
	 private UserDao userdao;
	 private  ValidatorService [] validatorService;
	 


	public UserManager(UserDao userdao, ValidatorService [] validatorService) {
		super();
		this.userdao = userdao;
		this.validatorService=validatorService;
		
	}

	@Override
	public void add(User user) {

		for (ValidatorService validatorService : validatorService) {
			if(validatorService.checkUser(user)==false) {
				System.out.println("Kayıt Basarısız. ");
				return;
			}
			
		}
		int realCode = (int) (Math.random() * 100000);
		System.out.println("Dogrulama Kodunuz: "+realCode);
		System.out.println("Dogrulama Basarılı...");
		System.out.println("Kayıt Basarılı...");
		userdao.add(user);
			
			
			
		}
	

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
		
		
		
	}

	@Override
	public void login(User user) {
		

		
		}
	}


