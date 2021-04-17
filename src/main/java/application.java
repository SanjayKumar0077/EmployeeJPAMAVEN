import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class application {
    private static EntityManagerFactory entityManagerFactory = Persistence
            .createEntityManagerFactory("EmployeeProject");

    public static void main(String[] args) {
        EmployeeMaster employeeMaster=new EmployeeMaster();
       // employeeMaster.setDepartment(d);

        saveEmployee(employeeMaster);
        entityManagerFactory.close();
    }

    public static String saveEmployee(EmployeeMaster employeeMaster) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction.begin();
            entityManager.persist(employeeMaster);
            entityTransaction.commit();
        } catch (Exception exception) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
            }
            exception.printStackTrace();
        } finally {
            entityManager.close();
        }
        return "Save Employee successfully";
    }
}
