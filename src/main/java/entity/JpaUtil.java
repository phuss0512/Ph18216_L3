package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class JpaUtil {
	public static EntityManagerFactory getFactory() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Ph18216_l3");
		return factory;
	}

	public static EntityManager getEntityManager() {
		EntityManager em = JpaUtil.getFactory().createEntityManager();

		return em;
	}
}
