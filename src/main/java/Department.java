import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@Override
	public String toString() {
		return "Department [DepartmentID=" + DepartmentID + ", Department=" + Department + ", region=" + region + "]";
	}

	public Department(int departmentID, String department, String region) {
		super();
		DepartmentID = departmentID;
		Department = department;
		this.region = region;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	 
	 
}
