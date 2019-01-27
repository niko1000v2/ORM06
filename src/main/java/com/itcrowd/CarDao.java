package com.itcrowd;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class CarDao extends AbstractDao<Car> {

	public CarDao(EntityManager em) {
		super(em, Car.class);
		
	}
	
	public List<Car> findByRegistration(String registration) {
		return em.createQuery("from Car WHERE registration=:registration").setParameter("registration",registration).getResultList(); 
			
		}
	
	public List<Car> findByAvailable(boolean available) {
		return em.createQuery("from Car WHERE available=:available").setParameter("available",available).getResultList(); 
			
		}
	
		
}
