package JavaECommerceDemo.core.verification;

import JavaECommerceDemo.entities.concretes.User;

public class SmsVerification implements VerificationService{

	@Override
	public boolean verificate(User user) {
		System.out.println("Please Enter the Code in the SMS message for Verification !");
		System.out.println("User Confirmed : " + user.getFirstName() + " " + user.getLastName());
		return true;
	}

}
