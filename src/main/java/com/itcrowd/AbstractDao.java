package com.itcrowd;

import java.util.List;

import javax.persistence.EntityManager;

public class AbstractDao<T> {

	protected EntityManager em;
	private Class<T> entityClass;

	public AbstractDao(EntityManager em, Class<T> entityClass) {
		
		this.em = em;
		this.entityClass = entityClass;
		
	}

	public void save(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	public List<T> findAll() {
		return em.createQuery("from " + entityClass.getName()).getResultList();
	}
	
	public T findById(Long id) {
		return em.find(entityClass, id);
		}
	
	public void remove(T entity) {
		em.getTransaction().begin();
		em.remove(entity);
		em.getTransaction().commit();
	}
	
	

}
