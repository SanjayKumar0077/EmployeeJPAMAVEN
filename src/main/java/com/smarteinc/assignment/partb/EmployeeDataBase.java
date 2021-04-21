package com.smarteinc.assignment.partb;

import java.util.ArrayList;
import java.util.List;

import com.smarteinc.assignment.parta.Address;
import com.smarteinc.assignment.parta.Department;
import com.smarteinc.assignment.parta.Employee;

public class EmployeeDataBase {
public static List<Employee> getEmployee(){
	List<Employee> listOfEmployee=new ArrayList<Employee>();
	listOfEmployee.add(new Employee(1, "Sanjay", "san", 25, 200000, true, new Department(1, "HR","USA"), new Address(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
	listOfEmployee.add(new Employee(2, "jay", "j", 45, 150000, false, new Department(2, "IT","LONDON"), new Address(2, "MUMBAI", "MAHARASHTRA", "INDIA", "450001")));
	listOfEmployee.add(new Employee(3, "JOHN", "jon", 35, 850000, true, new Department(3, "HR","INDIA"), new Address(3, "DELHI", "DELHI_NCR", "INDIA", "340020")));
	listOfEmployee.add(new Employee(4, "MICK", "mic", 55, 20000, true, new Department(4, "IT","BRAZIL"), new Address(4, "KOLKATA", "WB", "INDIA", "700100")));
	listOfEmployee.add(new Employee(5, "SUNNY", "sun", 25, 7500000, false, new Department(5, "IT","AFGANISTAN"), new Address(5, "KABUL", "QUOTA", "AFGANISTAN", "900001")));
	listOfEmployee.add(new Employee(6, "BOKAI", "BOka", 67, 4500000, true, new Department(6, "HR","ITALY"), new Address(1, "GIYUU", "BEJING", "CHINA", "900001")));
//	listOfEmployee.add(new Employee(1, "Sanjay", "san", 25, 2500000, true, new Department(1, "HR","USA"), new Address(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new Employee(1, "Sanjay", "san", 25, 2500000, true, new Department(1, "HR","USA"), new Address(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new Employee(1, "Sanjay", "san", 25, 2500000, true, new Department(1, "HR","USA"), new Address(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new Employee(1, "Sanjay", "san", 25, 2500000, true, new Department(1, "HR","USA"), new Address(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new Employee(1, "Sanjay", "san", 25, 2500000, true, new Department(1, "HR","USA"), new Address(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new Employee(1, "Sanjay", "san", 25, 2500000, true, new Department(1, "HR","USA"), new Address(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new Employee(1, "Sanjay", "san", 25, 2500000, true, new Department(1, "HR","USA"), new Address(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new Employee(1, "Sanjay", "san", 25, 2500000, true, new Department(1, "HR","USA"), new Address(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new Employee(1, "Sanjay", "san", 25, 2500000, true, new Department(1, "HR","USA"), new Address(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
	return listOfEmployee;
}
}
