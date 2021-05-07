package JavaECommerceDemo.business.abstracts;

import JavaECommerceDemo.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
}
