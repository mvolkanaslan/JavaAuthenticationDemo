package JavaECommerceDemo.business.concretes;

import JavaECommerceDemo.business.abstracts.UserService;
import JavaECommerceDemo.dataAccess.abstracts.UserDao;
import JavaECommerceDemo.entities.concretes.User;

public class UserManager implements UserService{

	UserDao userDao;
	
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
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