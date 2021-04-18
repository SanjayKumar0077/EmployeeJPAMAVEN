package partB;

public class EmployeeB {
	private int empID;
	private String empName;
	private String password;
	private int empAge;
	private double empCTC;
	private boolean empActive;
	private DepartmentB department;
	private AddressB address;
	 
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public double getEmpCTC() {
		return empCTC;
	}
	public void setEmpCTC(double empCTC) {
		this.empCTC = empCTC;
	}
	public boolean isEmpActive() {
		return empActive;
	}
	public void setEmpActive(boolean empActive) {
		this.empActive = empActive;
	}
	public DepartmentB getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentB department) {
		this.department = department;
	}
	public AddressB getAddress() {
		return address;
	}
	public void setAddress(AddressB address) {
		this.address = address;
	}
	public EmployeeB(int empID, String empName, String password, int empAge, double empCTC, boolean empActive,
			DepartmentB department, AddressB address) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.password = password;
		this.empAge = empAge;
		this.empCTC = empCTC;
		this.empActive = empActive;
		this.department = department;
		this.address = address;
	}
	public EmployeeB() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeB [empID=" + empID + ", empName=" + empName + ", password=" + password + ", empAge=" + empAge
				+ ", empCTC=" + empCTC + ", empActive=" + empActive + ", department=" + department + ", address="
				+ address + "]";
	}
	 
}
