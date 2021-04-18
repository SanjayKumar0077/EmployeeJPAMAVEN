import javax.persistence.*;

 @Entity
public class Department {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int departID;
    @Column(name = "DEPARTMENT")
    private String department;
    @Column(name = "OPERATED_REGION")
    private String operatedRegion;

    public Department() {
    }

    public int getDepartID() {
        return departID;
    }

    public void setDepartID(int departID) {
        this.departID = departID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOperatedRegion() {
        return operatedRegion;
    }

    public void setOperatedRegion(String operatedRegion) {
        this.operatedRegion = operatedRegion;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departID=" + departID +
                ", department='" + department + '\'' +
                ", operatedRegion='" + operatedRegion + '\'' +
                '}';
    }
}
