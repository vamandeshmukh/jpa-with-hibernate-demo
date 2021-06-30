package com.cg.jpa.demo.delete;

// Design patterns 

public class App {

	public static void main(String[] args) {
		System.out.println("Start");

		Delete obj1 = new Delete();
		Delete obj2 = new Delete();
		Delete obj3 = new Delete();

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		System.out.println(obj1.num);
	}

}
