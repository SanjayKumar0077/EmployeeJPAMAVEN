import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Department {
	@Id
	private String empDepartment;
	@ManyToMany(mappedBy = "depatrment", cascade = CascadeType.ALL)
	private Set<Region> operatedRegion;
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public Set<Region> getOperatedRegion() {
		return operatedRegion;
	}
	public void setOperatedRegion(Set<Region> operatedRegion) {
		this.operatedRegion = operatedRegion;
	}
	public Department(String empDepartment, Set<Region> operatedRegion) {
		super();
		this.empDepartment = empDepartment;
		this.operatedRegion = operatedRegion;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
