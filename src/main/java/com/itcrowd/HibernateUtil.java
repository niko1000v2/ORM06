package com.itcrowd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit-h2");
	private static EntityManager entityManager;

	private HibernateUtil() {
	}

	public static EntityManager getEntityManager() {
		if (entityManager == null) {
			entityManager = emf.createEntityManager();
		}
		return entityManager;
	}

	public static void closeEntityManager() {
		entityManager.close();
		emf.close();

	}
}