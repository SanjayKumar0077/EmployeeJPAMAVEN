package com.smarteinc.assignment.partb;

import java.util.List;

import com.smarteinc.assignment.parta.Employee;

//B. Non DB operations, here you are using Plain POJOs without JPA or J
public class MainApplication {
public static void main(String[] args) {
	//Given a department find all active employees above
	
	List<Employee> employee = EmployeeDataBase.getEmployee();
	employee.stream().filter(p->p.isActive() && p.getAge()>40)
	.forEach(p->System.out.println(p.getDepartment()));
	
	//b) Given a department find all active employees 
	//below a given age having CTC greater than
	List<Employee> employee2 = EmployeeDataBase.getEmployee();
	employee2.stream().filter(p->p.isActive()&&p.getCtc()<200000).forEach(p->System.out.println(p));
}
}
