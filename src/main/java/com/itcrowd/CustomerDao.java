package com.itcrowd;

import java.util.List;

import javax.persistence.EntityManager;

public class CustomerDao extends AbstractDao<Customer> {

	public CustomerDao(EntityManager em) {
		super(em, Customer.class);

	}
	
	
	public List<Customer> findByName(String first_name, String second_name ) {
		return em.createQuery("from Customer WHERE first_name=:first_name and second_name=:second_name")
				.setParameter("first_name",first_name)
				.setParameter("second_name", second_name)
				.getResultList(); 
			
		}

}