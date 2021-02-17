package com.cg.empmgt.ui;

import com.cg.empmgt.entities.Employee;

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
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
		public void display(Employee employee) {
			System.out.println(employee.getId()+":"+employee.getName()+" "+employee.getDepartment());
		}
		
	}

}
