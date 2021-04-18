import javax.persistence.*;

@Entity
@Table(name = "USER")
public class EmployeeMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empID;
	private String password;
	private int empAge;
	private double empCTC;
	private boolean empActive;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Department department;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Address address;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	 
}
