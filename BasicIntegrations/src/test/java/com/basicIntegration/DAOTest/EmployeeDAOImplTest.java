package com.basicIntegration.DAOTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.basicIntegrations.dao.EmployeeDAO;
import com.basicIntegrations.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-config.xml")

public class EmployeeDAOImplTest {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Test
	public void create_test(){
		
		Employee employee = new Employee();
		employee.setAdEntId(2593582);
		employee.setFirstName("Boureima Edouard");
		employee.setLastName("Zerbo");
		
		System.out.println("Testing Create method");
		
		employeeDAO.create(employee);
		
	}

}
