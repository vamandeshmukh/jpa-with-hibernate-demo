package com.cg.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Vaman
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Start");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();

		// insert
//		Employee emp2 = new Employee(52, "Ccc");
//		manager.persist(emp2);
//		System.out.println(manager.find(Employee.class, emp2.getEid()).toString());
//		Employee emp3 = new Employee(55, "Zzz");
//		manager.persist(emp3);
//		System.out.println(manager.find(Employee.class, emp3.getEid()).toString());
//		Employee emp4 = new Employee(55, "Zzz");
//		manager.persist(emp4);
//		System.out.println(manager.find(Employee.class, emp4.getEid()).toString());

		// update
//		emp4.setEname("Xxx");
//		manager.merge(emp4);
//		System.out.println(manager.find(Employee.class, emp4.getEid()).toString());

		// delete
//		Employee emp5 = new Employee(56, "Ddd");
//		manager.persist(emp5);
//		System.out.println(manager.find(Employee.class, emp5.getEid()).toString());
//		manager.remove(emp5);
//		if (null == manager.find(Employee.class, emp5.getEid()))
//			System.out.println("Removed");

		manager.getTransaction().commit();
		System.out.println("End");
	}
}
