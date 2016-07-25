package com.basicIntegrations.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.basicIntegrations.common.HibernateUtil;
import com.basicIntegrations.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void create(Employee employee) {
		Session session = HibernateUtil.buildSessionFactory().getCurrentSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(employee);
		transaction.commit();
	}
	public void update(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.update(employee);
		transaction.commit();
		
	}
	public void delete(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.delete(employee);
		transaction.commit();
		
	}
	public Employee getOne(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		Employee employee = session.load(Employee.class, id);
		transaction.commit();
		return employee;
	}
}
