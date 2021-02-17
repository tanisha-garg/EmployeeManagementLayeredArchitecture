package com.cg.empmgt.ui;

import com.cg.empmgt.entities.*;
import com.cg.empmgt.service.*;
import com.cg.empmgt.exceptions.*;
import java.util.*;

public class EmployeeUI {
	
	private IEmployeeService service = new EmployeeServiceImpl();

	public static void main(String[] args) {
		
		EmployeeUI app = new EmployeeUI();
		app.start();		

	}
	
	void start() {
		
		try {
			Employee tanisha = service.add("Tanisha", "Developer");
			Employee srinidhi = service.add("Srinidhi", "Tester");
			Employee sindhuja = service.add("Sundhuja", "Human Resource");
			
			display(tanisha);
			display(srinidhi);
			display(sindhuja);
			
			Employee fetchEmployee = service.findById(1);
			display(fetchEmployee);
			
			Employee removeEmployee = service.removeById(2);
			List<Employee>list = service.findAll();
			displayAll(list);
			
		}catch(InvalidIdException e) {
			System.out.println(e.getMessage());
		}catch(InvalidEmployeeNameException e) {
			System.out.println(e.getMessage());
		}catch(InvalidDepartmentException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void display(Employee employee) {
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getDepartment());
	}
	
	public void displayAll(Collection<Employee>employees) {
		for(Employee employee : employees) {
			display(employee);
		}
	}

}
