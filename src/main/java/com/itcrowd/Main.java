package com.itcrowd;

import java.util.List;

import javax.persistence.EntityManager;

public class Main {

	public static void main(String[] args) throws Exception {

		try {
			
			EntityManager em = HibernateUtil.getEntityManager();			
			Car car = new Car();
			car.setName("Audi");
			car.setModel("A8");
			car.setAvailable(true);
			car.setRegistration("ESI04503");
			
		//	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//	Date date = new Date();
			
		//	System.out.println(date);
						
			car.setCreationDate();
			
			Car car2 = new Car();
			car2.setName("Mazda");
			car2.setModel("6");
			car2.setAvailable(false);
			car2.setRegistration("DW95439");
			car2.setCreationDate();
			
			Car car3 = new Car();
			car3.setName("Mitshubishi");
			car3.setModel("Lancer");
			car3.setAvailable(true);
			car3.setRegistration("EL567232");
			car3.setCreationDate();
						
			CarDao carDao = new CarDao(em);
			carDao.save(car);
			carDao.save(car2);
			carDao.save(car3);
								
			List<Car> resultCar = carDao.findAll();
			System.out.println("-------------------------------------------------------------");
			System.out.println("Wynik findAll:");
			System.out.println("-------------------------------------------------------------");
			for (Car carEntity : resultCar) {
				System.out.println(carEntity);
			}
			System.out.println("-------------------------------------------------------------");
			
			List<Car> resultCarRegistration = carDao.findByRegistration("DW95439");
			System.out.println("-------------------------------------------------------------");
			System.out.println("Wynik findByRegistration:");
			System.out.println("-------------------------------------------------------------");
			for (Car carEnityRegistration : resultCarRegistration ) {
				System.out.println(carEnityRegistration);
			};
			System.out.println("-------------------------------------------------------------");
			
			List<Car> resultCarAvailable = carDao.findByAvailable(false);
			System.out.println("-------------------------------------------------------------");
			System.out.println("Wynik findByAvailable:");
			System.out.println("-------------------------------------------------------------");
			for (Car carEnityAvailable : resultCarAvailable ) {
				System.out.println(carEnityAvailable);
			};
			System.out.println("-------------------------------------------------------------");
			
			//Car resultCarById = carDao.findById(2l);
		//	System.out.println("Wynik findById:");
		//	System.out.println(resultCarById);
			
		//	carDao.remove(resultCarById);
			
			List<Car> resultCarAfterDelete = carDao.findAll();
			System.out.println("-------------------------------------------------------------");
			System.out.println("Wynik findAll after Delete:");
			System.out.println("-------------------------------------------------------------");
			for (Car carEntityAfterDelete : resultCarAfterDelete) {
				System.out.println(carEntityAfterDelete);
			}
			System.out.println("-------------------------------------------------------------");
			
					
						
			Customer customer = new Customer();
			customer.setFirst_name("Adam");
			customer.setSecond_name("Nowak");
			
			Customer customer2 = new Customer();
			customer2.setFirst_name("Micha³");
			customer2.setSecond_name("Tomczyk");
			
			Customer customer3 = new Customer();
			customer3.setFirst_name("Kamila");
			customer3.setSecond_name("Dziubek");
						
			CustomerDao customerDao = new CustomerDao(em);
			customerDao.save(customer);
			customerDao.save(customer2);
			customerDao.save(customer3);
			
											
			List<Customer> resultCustomer = customerDao.findAll();
			System.out.println("-------------------------------------------------------------");
			System.out.println("Wynik findAll:");
			System.out.println("-------------------------------------------------------------");
			for (Customer customerEntity : resultCustomer) {
				System.out.println(customerEntity);
			}
			System.out.println("-------------------------------------------------------------");
			
			List<Customer> resultCustomerByName = customerDao.findByName("Adam", "Nowak");
			System.out.println("-------------------------------------------------------------");
			System.out.println("Wynik findByName:");
			System.out.println("-------------------------------------------------------------");
			for (Customer customerEntityByName : resultCustomerByName) {
				System.out.println(customerEntityByName);
			}
			System.out.println("-------------------------------------------------------------");
			
			Customer resultCustomerById = customerDao.findById(2l);
			System.out.println("-------------------------------------------------------------");
			System.out.println("Wynik findById:");
			System.out.println("-------------------------------------------------------------");
			System.out.println(resultCustomerById);
			System.out.println("-------------------------------------------------------------");
			
			customerDao.remove(resultCustomerById);
			
			List<Customer> resultCustomerAfterDelete = customerDao.findAll();
			System.out.println("-------------------------------------------------------------");
			System.out.println("Wynik findAll after Delete:");
			System.out.println("-------------------------------------------------------------");
			for (Customer customerEntityAfterDelete : resultCustomerAfterDelete) {
				System.out.println(customerEntityAfterDelete);
			}
			System.out.println("-------------------------------------------------------------");
						
		
		}
		catch (Exception e) {
			System.out.println("Wyst¹pi³ b³ad w programie:" + e);
		}
		finally {
			HibernateUtil.closeEntityManager();
		}

	}

}
