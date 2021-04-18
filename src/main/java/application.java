 
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class application {
	private static final EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("EmployeeProject");

	public static void main(String[] args) {
		EmployeeMaster employeeMaster1 = new EmployeeMaster();
		Department department = new Department();
		department.setDepartmentID(0);
		department.setDepartment("IT");
		Address address = new Address();
		address.setAddressID(3);
		address.setCity("INDORE");
		address.setCountry("INDIA");
		address.setPinCode("347899");
		address.setState("MP");

		employeeMaster1.setDepartment(department);
		employeeMaster1.setAddress(address);
		employeeMaster1.setEmpActive(true);
		employeeMaster1.setEmpAge(50);
		employeeMaster1.setEmpCTC(2000100);
		employeeMaster1.setEmpID(3);
		employeeMaster1.setPassword("SUNIL");
         //method no 1
		saveEmployee(employeeMaster1);
		// method no 2

		createDepartment(1, new Department(1, "MARKETING", "NEW DELHI"));
		entityManagerFactory.close();

	}

	// a) Provide a method to create employee record and associate with a department
	// then save in database

	public static EmployeeMaster saveEmployee(EmployeeMaster employeeMaster) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = null;
		try {
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			entityManager.merge(employeeMaster);

			entityTransaction.commit();
		} catch (Exception exception) {
			if (entityTransaction != null) {
				entityTransaction.rollback();
			}
			exception.printStackTrace();

		} finally {
			entityManager.close();
		}
		return employeeMaster;

	}
	// b) Provide a method to create department and save

	public static String createDepartment(int id, Department department) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = null;

		try {
			// Get transaction and start
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			// Find customer and make changes
			entityManager.find(Department.class, id);

			// Save the customer object
			entityManager.merge(department);
			entityTransaction.commit();
		} catch (Exception ex) {

			if (entityTransaction != null) {
				entityTransaction.rollback();
			}
			ex.printStackTrace();
		} finally {
			// Close EntityManager
			entityManager.close();
		}
		return "update sucessfully";
	}

}
