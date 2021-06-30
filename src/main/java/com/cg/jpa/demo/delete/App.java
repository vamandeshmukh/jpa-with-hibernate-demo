package com.cg.jpa.demo.delete;

// Design patterns 

public class App {

	public static void main(String[] args) {
		System.out.println("Start");

		Delete obj1 = Delete.getInstance();
		Delete obj2 = Delete.getInstance();
		Delete obj3 = Delete.getInstance();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.equals(obj3));
		System.out.println(obj2.equals(obj3));

		System.out.println(obj1 == obj2);
	}
}
