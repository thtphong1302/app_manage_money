package test;

import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    @Getter
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try{
            return new Configuration().configure().buildSessionFactory();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeSessionFactory() {
        getSessionFactory().close();
    }
}
