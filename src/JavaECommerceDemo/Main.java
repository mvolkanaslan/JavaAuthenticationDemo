package JavaECommerceDemo;

import GithubAuthService.GithubAuthManager;
import GoogleAuthService.GoogleAuthManager;
import JavaECommerceDemo.business.abstracts.AuthService;
import JavaECommerceDemo.business.concretes.AuthManager;
import JavaECommerceDemo.business.concretes.UserManager;
import JavaECommerceDemo.core.verification.EmailVerification;
import JavaECommerceDemo.core.verification.SmsVerification;
import JavaECommerceDemo.dataAccess.concretes.entityFramework.EFUserDao;
import JavaECommerceDemo.dataAccess.concretes.hibernate.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		AuthService authManager = new AuthManager(new UserManager(new HibernateUserDao(),new EmailVerification()));
		authManager.register("Volkan", "ASLAN", "volkan@volkan.com", "123456");
		System.out.println("-------------------------------");
		authManager.login("volkan@volkan.com", "123456");
		System.out.println("-------------------------------");
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.login();
		System.out.println("-------------------------------");
		GithubAuthManager githubAuthManager = new GithubAuthManager();
		githubAuthManager.login();
		
		
	}

}
