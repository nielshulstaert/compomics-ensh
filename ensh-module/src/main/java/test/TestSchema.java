package test;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: mmueller<br/>
 * Date: 20-Nov-2007<br/>
 * Time: 19:37:20<br/>
 */

public class TestSchema {

//    static {
//        Configuration config = new Configuration().
//                setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect").
//                setProperty("hibernate.connection.driver_class", "org.hsqldb.jdbcDriver").
//                setProperty("hibernate.connection.url", "jdbc:hsqldb:mem:baseball").
//                setProperty("hibernate.connection.username", "sa").
//                setProperty("hibernate.connection.password", "").
//                setProperty("hibernate.connection.pool_size", "1").
//                setProperty("hibernate.connection.autocommit", "true").
//                setProperty("hibernate.cache.provider_class", "org.hibernate.cache.HashtableCacheProvider").
//                setProperty("hibernate.hbm2ddl.auto", "create-drop").
//                setProperty("hibernate.show_sql", "true").
//                addClass(Component.class);
//
//        HibernateUtil.setSessionFactory(config.buildSessionFactory());
//    }
//
//    public static void addComponent(Component component) {
//
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        try {
//            session.save(component);
//            transaction.commit();
//        }
//        finally {
//            session.close();
//        }
//    }
//
//    public static void addToModule(Module module) {
//
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        try {
//            session.save(module);
//            transaction.commit();
//        }
//        finally {
//            session.close();
//        }
//    }
//
//    public static void reset() throws HibernateException {
//
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//
//        try {
//
//            String deleteModules = "delete from Module where id > 0";
//            String deleteComponents = "delete from Component where id > 0";
//
//
//            // or String hqlDelete = "delete Customer where name = :oldName";
//            session.createQuery(deleteModules)
//                    .executeUpdate();
//            session.createQuery(deleteComponents)
//                                .executeUpdate();
//
//
//            tx.commit();
//            session.close();
//
//        }
//        catch (HibernateException e) {
//            tx.rollback();
//            throw e;
//        }
//        finally {
//            session.close();
//        }
//
//    }
}