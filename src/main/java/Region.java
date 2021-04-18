import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Region {
	@Id
	private String region;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
//    (
//    		  name = "course_like", 
//    		  joinColumns = @JoinColumn(name = "student_id"), 
//    		  inverseJoinColumns = @JoinColumn(name = "course_id"))
	 private Set<Department> depatrment;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set<Department> getDepatrment() {
		return depatrment;
	}

	public void setDepatrment(Set<Department> depatrment) {
		this.depatrment = depatrment;
	}

	public Region(String region, Set<Department> depatrment) {
		super();
		this.region = region;
		this.depatrment = depatrment;
	}

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
