package com.cg.jpa.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDemo {
	public static void main(String[] args) {
		System.out.println("Start");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abc");
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();

//		Query query = manager.createQuery("SELECT * FROM my_emp_table;"); // CE - SQL Query 
		Query query = manager.createQuery("FROM Employee"); // JPQL , HQL

		List<Employee> empList = query.getResultList();

		for (Employee emp : empList)
			System.out.println(emp.toString());

		System.out.println("End");
	}
}
