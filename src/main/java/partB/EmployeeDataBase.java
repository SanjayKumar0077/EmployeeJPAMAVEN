package partB;

import java.util.ArrayList;
import java.util.List;
/*int empID, String empName, String password, 
 * int empAge, double empCTC, boolean empActive,
			DepartmentB department, AddressB address
 * */
public class EmployeeDataBase {
public static List<EmployeeB> getEmployee(){
	List<EmployeeB> listOfEmployee=new ArrayList<EmployeeB>();
	listOfEmployee.add(new EmployeeB(1, "Sanjay", "san", 25, 200000, true, new DepartmentB(1, "HR","USA"), new AddressB(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
	listOfEmployee.add(new EmployeeB(2, "jay", "j", 45, 150000, false, new DepartmentB(2, "IT","LONDON"), new AddressB(2, "MUMBAI", "MAHARASHTRA", "INDIA", "450001")));
	listOfEmployee.add(new EmployeeB(3, "JOHN", "jon", 35, 850000, true, new DepartmentB(3, "HR","INDIA"), new AddressB(3, "DELHI", "DELHI_NCR", "INDIA", "340020")));
	listOfEmployee.add(new EmployeeB(4, "MICK", "mic", 55, 20000, true, new DepartmentB(4, "IT","BRAZIL"), new AddressB(4, "KOLKATA", "WB", "INDIA", "700100")));
	listOfEmployee.add(new EmployeeB(5, "SUNNY", "sun", 25, 7500000, false, new DepartmentB(5, "IT","AFGANISTAN"), new AddressB(5, "KABUL", "QUOTA", "AFGANISTAN", "900001")));
	listOfEmployee.add(new EmployeeB(6, "BOKAI", "BOka", 67, 4500000, true, new DepartmentB(6, "HR","ITALY"), new AddressB(1, "GIYUU", "BEJING", "CHINA", "900001")));
//	listOfEmployee.add(new EmployeeB(1, "Sanjay", "san", 25, 2500000, true, new DepartmentB(1, "HR","USA"), new AddressB(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new EmployeeB(1, "Sanjay", "san", 25, 2500000, true, new DepartmentB(1, "HR","USA"), new AddressB(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new EmployeeB(1, "Sanjay", "san", 25, 2500000, true, new DepartmentB(1, "HR","USA"), new AddressB(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new EmployeeB(1, "Sanjay", "san", 25, 2500000, true, new DepartmentB(1, "HR","USA"), new AddressB(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new EmployeeB(1, "Sanjay", "san", 25, 2500000, true, new DepartmentB(1, "HR","USA"), new AddressB(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new EmployeeB(1, "Sanjay", "san", 25, 2500000, true, new DepartmentB(1, "HR","USA"), new AddressB(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new EmployeeB(1, "Sanjay", "san", 25, 2500000, true, new DepartmentB(1, "HR","USA"), new AddressB(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new EmployeeB(1, "Sanjay", "san", 25, 2500000, true, new DepartmentB(1, "HR","USA"), new AddressB(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
//	listOfEmployee.add(new EmployeeB(1, "Sanjay", "san", 25, 2500000, true, new DepartmentB(1, "HR","USA"), new AddressB(1, "PUNE", "MAHARASHTRA", "INDIA", "450001")));
	return listOfEmployee;
}
}
