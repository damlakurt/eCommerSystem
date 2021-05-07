package eCommerceSystem;

import java.util.ArrayList;

import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.business.concretes.UserManager;
import eCommerceSystem.core.abstracts.ValidatorService;
import eCommerceSystem.core.concretes.LoginBasicManagerAdapter;
import eCommerceSystem.core.concretes.LoginGoogleManagerAdapter;
import eCommerceSystem.core.concretes.MailValidator;
import eCommerceSystem.core.concretes.NameValidator;
import eCommerceSystem.core.concretes.PasswordValidator;
import eCommerceSystem.core.concretes.RepeatMailValidator;
import eCommerceSystem.dataAccess.concretes.BasicUserDao;
import eCommerceSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		
		ArrayList<User> users=new ArrayList<User>();
		ArrayList<String> mails=new ArrayList<String>();
		
		ValidatorService [] validatorService= {new MailValidator(),new PasswordValidator(),new NameValidator(),
				new RepeatMailValidator(mails)};
		
	
		
		UserService userService = new UserManager(new BasicUserDao(users),validatorService );
		
		User user = new User(1, "Damla", "Kurt", "damla@mail.com", "112354");
	
		User user4 = new User(4, "Barýs", "Eymen", "damla@mail.com", "1255555");
		
		User user3 = new User(2, "Su","Kuþ", "sukus@mail.com", "6666666");
		 
		
		userService.add(user);
		userService.add(user4);
		
		
		
		
		ValidatorService validatorService2 =new LoginGoogleManagerAdapter();
	
		validatorService2.checkUser(user4);
		
		ValidatorService validatorService3 = new LoginBasicManagerAdapter();
		validatorService3.add(user3);
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
	}


