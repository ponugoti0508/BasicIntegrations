package com.basicIntegrations.common;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.basicIntegrations.model.Employee;

public class HibernateUtil {
	
	public static SessionFactory buildSessionFactory(){
		SessionFactory sessionFactory = null; 
		try {
			Configuration configuration = new  Configuration().configure();
			configuration.addAnnotatedClass(Employee.class);
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties())
					.build();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return sessionFactory;
	}
}
