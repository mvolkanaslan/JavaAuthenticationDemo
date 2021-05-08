package JavaECommerceDemo.business.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import JavaECommerceDemo.entities.concretes.User;

public class AuthValidation {
	public static boolean userValidator(User user) {
		boolean result = true;
		boolean[] errors = {emailValidation(user.getEmail()),passwordValidation(user.getPassword()),firstNameValidation(user.getFirstName()),lastNameValidation(user.getLastName())};
		for(boolean error:errors) {
			if(!error) {
				result= false;
			}
		}
		return result;
	}
	
	 protected static boolean emailValidation(String email) {
		//@"^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$"
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher = pattern.matcher(email);
		if(!matcher.matches()) {
			System.out.println("Email is not Valid !"); ;
			return false;
		}
		return true;
	}
	 protected static boolean passwordValidation(String password) {
		Pattern pattern = Pattern.compile("^(?=.*?[0-9]).{6,}$");
		Matcher matcher = pattern.matcher(password);
		if(!matcher.matches()) {
			System.out.println("Password must be minimum 6 characters !"); ;
			return false;
		}
		return true;
	 }
	 protected static boolean firstNameValidation(String firstName) {
		 if(firstName.length()<2) {
			 System.out.println("FirstName must be minimum 2 characters !"); ;
				return false;
		 }
		 return true;
	 }
	 protected static boolean lastNameValidation(String lastName) {
		 if(lastName.length()<2) {
			 System.out.println("LastName must be minimum 2 characters !"); ;
				return false;
		 }
		 return true;
	 }
	

}
