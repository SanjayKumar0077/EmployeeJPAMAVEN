package partB;

public class DepartmentB {
	private int DepartmentID;
	private String Department;
	 private String region;
	public int getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(int departmentID) {
		DepartmentID = departmentID;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public DepartmentB(int departmentID, String department, String region) {
		super();
		DepartmentID = departmentID;
		Department = department;
		this.region = region;
	}
	public DepartmentB() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DepartmentB [DepartmentID=" + DepartmentID + ", Department=" + Department + ", region=" + region + "]";
	}
	 
	
}
