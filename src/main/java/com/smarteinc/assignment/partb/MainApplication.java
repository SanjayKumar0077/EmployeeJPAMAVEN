package com.smarteinc.assignment.partb;

import java.util.List;

//B. Non DB operations, here you are using Plain POJOs without JPA or J
public class MainApplication {
public static void main(String[] args) {
	//Given a department find all active employees above
	
	List<EmployeeB> employee = EmployeeDataBase.getEmployee();
	employee.stream().filter(p->p.isEmpActive() && p.getEmpAge()>40)
	.forEach(p->System.out.println(p.getDepartment().getDepartment()));
	
	//b) Given a department find all active employees 
	//below a given age having CTC greater than
	List<EmployeeB> employee2 = EmployeeDataBase.getEmployee();
	employee2.stream().filter(p->p.isEmpActive()&&p.getEmpCTC()<200000).forEach(p->System.out.println(p));
}
}
