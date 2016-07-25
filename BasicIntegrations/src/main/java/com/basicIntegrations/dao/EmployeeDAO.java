package com.basicIntegrations.dao;

import com.basicIntegrations.model.Employee;

public interface EmployeeDAO {
	
	public void create(Employee employee);
	public void update(Employee employee);
	public void delete(Employee employee);
	public Employee getOne(Integer id);
}