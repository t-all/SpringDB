package hibernate;

import hibernate.entity.Detail;
import hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = Util.getSessionFactory();
        Session session = null;

        try {

            session = sessionFactory.getCurrentSession();

//            Employee employee = new Employee("Sam", "Samov", "Sale", 1000);
//            Detail detail = new Detail("Minsk", "12332112", "sam@test.com");
//
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();

            session.beginTransaction();

            Detail detail = session.get(Detail.class, 6L);
            System.out.println(detail.getEmployee());
            session.getTransaction().commit();
        }
        finally {
            session.close();
            sessionFactory.close();
        }

    }
}

