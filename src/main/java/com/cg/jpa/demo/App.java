package com.cg.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Vaman Deshmukh 
 *
 */

// ORM - concept 
// JPA - specification 

// 1. hibernate - tool / implementation 
// 2. toplink - tool / implementation 
// 3. ibatis - tool / implementation 

// SQL - interacts with DB 
// HQL JPQL 

public class App {
	public static void main(String[] args) {
		System.out.println("Start");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();

		System.out.println("insert - persist()");
		Employee emp = new Employee(101, "Sonu");
		manager.persist(emp);
		System.out.println(manager.find(Employee.class, 101).toString());
		Employee emp2 = new Employee(55, "Zzz");
		manager.persist(emp2);
		System.out.println(manager.find(Employee.class, emp2.getEid()).toString());
		Employee emp3 = new Employee(56, "Zzz");
		manager.persist(emp3);
		System.out.println(manager.find(Employee.class, emp3.getEid()).toString());

		System.out.println("update - merge()");
		Employee emp4 = new Employee(102, "Monu");
		manager.persist(emp4);
		System.out.println(manager.find(Employee.class, emp4.getEid()).toString());
		emp4.setEname("Tonu");
		manager.merge(emp4);
		System.out.println(manager.find(Employee.class, emp4.getEid()).toString());

		System.out.println("delete - remove()");
		Employee emp5 = new Employee(103, "Ponu");
		manager.persist(emp5);
		System.out.println(manager.find(Employee.class, emp5.getEid()).toString());
		manager.remove(emp5);
		if (null == manager.find(Employee.class, emp5.getEid()))
			System.out.println("Removed");
		manager.getTransaction().commit();
		System.out.println("End");
	}
}
