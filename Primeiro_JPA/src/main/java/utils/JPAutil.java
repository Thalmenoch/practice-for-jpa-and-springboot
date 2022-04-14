package utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {
	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory("Practice_for_TJW"); 

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
