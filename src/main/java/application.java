import java.util.List;

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

		EmployeeMaster saveEmployee = saveEmployee(employeeMaster1);
	 
		List<EmployeeMaster> employee = getEmployee();
		System.out.println(employee);
		entityManagerFactory.close();

	}
	public static List<EmployeeMaster> getEmployee(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = null;
		try {
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			EmployeeMaster find = entityManager.find(EmployeeMaster.class, 12);
			//System.out.println(find);

			entityTransaction.commit();
		} catch (Exception exception) {
			if (entityTransaction != null) {
				entityTransaction.rollback();
			}
			exception.printStackTrace();

		} finally {
			entityManager.close();
		}
		return null;
		
		
	}
	//a) Provide a method to create employee record and associate with a department then save in database

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
	//b) Provide a method to create department and save 
	
	public static String createDepartment(int id) {
		
		return null;
		
	}
}
