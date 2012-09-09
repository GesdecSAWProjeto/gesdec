package saw.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class HibernateUtil {
	
	private static SessionFactory factory;
	private static ServiceRegistry serviceRegistry;
	
	private static SessionFactory configureSessionFactory() {
		
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			factory = configuration.buildSessionFactory(serviceRegistry);
			return factory;
		} catch (Throwable ex) {
			System.err.println("Falha na criação do objeto SessionFactory:" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return configureSessionFactory();
	}
}
