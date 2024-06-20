package test;

import model.User;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ModalTest {
    public static void main(String[] args) {
        try{
            SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
            if(sessionFactory != null){
                try(Session session = sessionFactory.openSession()){
                    var user = User.builder()
                            .username("tanphong1")
                            .password("123456")
                            .email("tanphong1@gmail.com")
                            .build();
                    session.beginTransaction();

                    session.getTransaction().commit();
                }
            }
        }catch (Exception e){

        }
    }
}
