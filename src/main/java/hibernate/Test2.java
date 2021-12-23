package hibernate;

import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Util.getSessionFactory();
        Session session = null;

        try {
//            Session session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Tom", "Tomov", "IT", 500);
//            Detail detail = new Detail("Mosckow", "1234567", "tom@yesy.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//            session.getTransaction().commit();

//            Session session = sessionFactory.getCurrentSession();
//            Employee employee = new Employee("Bob", "Bobov", "SALE", 800);
//            Detail detail = new Detail("Moscow", "1234567", "bob@yesy.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//            session.getTransaction().commit();

//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 3L);
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();

            session = sessionFactory.getCurrentSession();

            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2L);
            session.delete(employee);

            session.getTransaction().commit();
        }
        finally {
            session.close();
            sessionFactory.close();
        }

    }
}

