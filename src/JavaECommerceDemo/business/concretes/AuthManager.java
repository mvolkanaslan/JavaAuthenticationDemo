package JavaECommerceDemo.business.concretes;

import JavaECommerceDemo.business.abstracts.AuthService;
import JavaECommerceDemo.business.abstracts.UserService;
import JavaECommerceDemo.business.validation.AuthValidation;
import JavaECommerceDemo.core.verification.VerificationService;
import JavaECommerceDemo.entities.concretes.User;

public class AuthManager implements AuthService {

	UserService userService;
	

	public AuthManager(UserService userService) {
		this.userService = userService;
		
	}

	@Override
	public void register(String firstName, String lastName, String email, String password) {
		User user = new User(firstName, lastName, email, password);
			userService.add(user);
			System.out.println("Register Successful !");
	}

	@Override
	public void login(String email, String password) {
			System.out.println("Login with Email Successful !");
	}

}
