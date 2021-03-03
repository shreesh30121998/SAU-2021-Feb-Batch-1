package com.Hibernate.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Product product1=new Product();
    	product1.setId(1);
    	product1.setName("Product 1");
    	
    	Product product2=new Product();
    	product2.setId(2);
    	product2.setName("Product 2");
    	
    	Category category1=new Category();
    	category1.setCatid(1);
    	category1.setCatname("Customer 1");
    	
    	Category category2=new Category();
    	category2.setCatid(2);
    	category2.setCatname("Customer 2");
    	
    	Supplier supplier1= new Supplier();
    	supplier1.setSid(1);
    	supplier1.setSname("Supplier 1");
    	
    	Supplier supplier2= new Supplier();
    	supplier2.setSid(2);
    	supplier2.setSname("Supplier 2");
    	
    	product1.getSups().add(supplier1);
    	product1.getCat().add(category1);
    	product2.getSups().add(supplier2);
    	product2.getCat().add(category2);
    	
    	
    	category1.getSups().add(supplier1);
    	category2.getSups().add(supplier2);
    	
    	category1.setProduct(product1);
    	category2.setProduct(product2);
    	
    	supplier1.getCats().add(category1);
    	supplier1.getProds().add(product1);
    	supplier2.getCats().add(category2);
    	supplier2.getProds().add(product2);
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Product.class).addAnnotatedClass(Category.class);
        ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf=con.buildSessionFactory();
		Session session= sf.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(product1);
    	session.save(supplier1);
    	session.save(category1);
    	
    	session.save(product2);
    	session.save(supplier2);
    	session.save(category2);
    	
    	
		tx.commit(); 
    }
}
