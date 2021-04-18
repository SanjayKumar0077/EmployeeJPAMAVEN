import static java.lang.System.out;

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
//		Department department = new Department();
//		department.setDepartID(3);
//		department.setDepartment("IT");
//		department.setOperatedRegion("Delhi");
// 		Address address = new Address();
//		address.setAddressID(3);
//		address.setCity("NOIDA");
//		address.setCountry("INDIA");
//		address.setPinCode("767899");
//		address.setState("UP");
//
//		employeeMaster1.setDepartment(department);
//		employeeMaster1.setAddress(address);
//		employeeMaster1.setEmpActive(true);
//		employeeMaster1.setEmpAge(30);
//		employeeMaster1.setEmpCTC(1000100);
//		employeeMaster1.setEmpID(3);
//		employeeMaster1.setPassword("RAHUL");
//
//		//EmployeeMaster saveEmployee = saveEmployee(employeeMaster1);
//		//out.println(saveEmployee);
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
			System.out.println(find);

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
}
