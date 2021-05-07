package JavaECommerceDemo.business.concretes;

import JavaECommerceDemo.business.abstracts.AuthService;
import JavaECommerceDemo.business.abstracts.UserService;
import JavaECommerceDemo.business.validation.AuthValidation;
import JavaECommerceDemo.core.verification.VerificationService;
import JavaECommerceDemo.entities.concretes.User;

public class AuthManager implements AuthService {

	UserService userService;
	VerificationService verificationService;

	public AuthManager(UserService userService, VerificationService verificationService) {
		this.userService = userService;
		this.verificationService = verificationService;
	}

	@Override
	public void register(String firstName, String lastName, String email, String password) {
		User user = new User(firstName, lastName, email, password);
		if (!AuthValidation.registerValidator(firstName, lastName, email, password)) {
			return;
		}
		else if (verificationService.verificate(user)) {
			System.out.println("Register Successful !");
			userService.add(user);
		}

	}

	@Override
	public void login(String email, String password) {
		if (!AuthValidation.loginValidator(email, password)) {
			return;
		}
		else {
			System.out.println("Login with Email Successful !");
		}

	}

}
