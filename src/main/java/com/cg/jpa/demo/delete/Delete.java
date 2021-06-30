package com.cg.jpa.demo.delete;

// singleton class - design pattern 

public class Delete {

	private static Delete delete;

	private Delete() {

	}

	public static Delete getInstance() {
		if (null == delete)
			delete = new Delete();
		return delete;
	}

}
