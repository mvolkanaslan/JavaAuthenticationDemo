package JavaECommerceDemo.core.verification;

import JavaECommerceDemo.entities.concretes.User;

public class EmailVerification implements VerificationService{

	@Override
	public boolean verificate(User user) {
		System.out.println("Please Click the Link Below for Verification!");
		System.out.println("User Confirmed  : " + user.getFirstName() + " " + user.getLastName());
		return true;
	}

}
