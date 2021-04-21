package com.smarteinc.assignment.parta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Application {
	private static final EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("EmployeeProject");

	public static void main(String[] args) {

	}

	// a) Provide a method to create employee record and associate with a department
	// then save in database

	public static Employee saveEmployee(Employee employeeMaster) {
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
