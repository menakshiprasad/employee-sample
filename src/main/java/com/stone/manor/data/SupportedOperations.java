package com.stone.manor.data;

import java.util.ArrayList;
import java.util.List;

public class SupportedOperations {

	/**
	 * Return list of supported operations
	 * 
	 * @return
	 */
	public static List<Operation> getSupportedOperations() {

		Operation op1 = new Operation("Who are you?", "/anyway/:company/:from", "Tells from which company you come.");

		Operation op2 = new Operation("birthday", "/bday/:name/:from", "Wishes Happy birthday");

		Operation op3 = new Operation("Bravo Mike", "/bm/:name/:from", "Appreciate you");

		List<Operation> opsList = new ArrayList<>();

		opsList.add(op1);
		opsList.add(op2);
		opsList.add(op3);

		return opsList;
	}
}

class Operation {
	private String name;
	private String url;
	private String desc;

	public Operation(String name, String url, String desc) {
		super();
		this.name = name;
		this.url = url;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public String getDesc() {
		return desc;
	}

}
