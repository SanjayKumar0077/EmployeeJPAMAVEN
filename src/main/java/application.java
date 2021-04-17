import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class application {
	private static EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("EmployeeProject");
	// private static EntityTransaction entityTransaction;
       
	public static void main(String[] args) {

		saveEmployee();
		entityManagerFactory.close();
	}

	public static String saveEmployee() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = null;
		try {
			 entityTransaction=entityManager.getTransaction();
			 entityTransaction.begin();
			EmployeeMaster employeeMaster = new EmployeeMaster();
			Department department = new Department();
			//department.setDepartID(1);
			department.setDepartment("HR");
			department.setOperatedRegion("MUMBAI");
			System.out.println("Objected created...application");
			Address address = new Address();
			//address.setAddressID(1);
			address.setCity("PUNE");
			address.setCountry("INDIA");
			address.setPinCode("450001");
			address.setState("MAHARASHTRA");

			//employeeMaster.setDepartment(department);
			//employeeMaster.setAddress(address);
			employeeMaster.setEmpActive(true);
			employeeMaster.setEmpAge(27);
			employeeMaster.setEmpCTC(810000);
			//employeeMaster.setEmpID(1);
			employeeMaster.setPassword("SANJAY");
			 entityManager.persist(employeeMaster);
			entityTransaction.commit();
		} catch (Exception exception) {
			if (entityTransaction != null) {
				entityTransaction.rollback();
			}
			//exception.printStackTrace();
			//System.out.println(exception);
		} finally {
			entityManager.close();
		}
		return "null";
	}
}
