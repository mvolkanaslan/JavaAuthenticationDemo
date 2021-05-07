package JavaECommerceDemo.core.abstracts;

public interface EntityBaseRepository<T> {

	void add(T entity);
	void delete(T entity);
	void update(T entity);
	
}
