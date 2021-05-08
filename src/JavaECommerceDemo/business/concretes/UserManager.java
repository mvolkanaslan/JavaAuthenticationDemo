package JavaECommerceDemo.business.concretes;

import JavaECommerceDemo.business.abstracts.UserService;
import JavaECommerceDemo.business.validation.AuthValidation;
import JavaECommerceDemo.core.verification.VerificationService;
import JavaECommerceDemo.dataAccess.abstracts.UserDao;
import JavaECommerceDemo.entities.concretes.User;

public class UserManager implements UserService{

	UserDao userDao;
	VerificationService verificationService;
	
	public UserManager(UserDao userDao, VerificationService verificationService) {
		this.userDao = userDao;
		this.verificationService = verificationService;
	}

	@Override
	public void add(User user) {
		if (!AuthValidation.userValidator(user)) {
			return;
		}
		else if (verificationService.verificate(user)) {
			userDao.add(user);
		}
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}
}