package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certi cer;
	private List<String> list;
	


	public Person(String name, int personId) {
		this.name = name;
		this.personId = personId;
	}
	public Person(String name, int personId, Certi cer) {
		super();
		this.name = name;
		this.personId = personId;
		this.cer = cer;
	}

	public Person(String name, int personId, Certi cer, List<String> list) {
		super();
		this.name = name;
		this.personId = personId;
		this.cer = cer;
		this.list = list;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", cer=" + cer + ", list=" + list + "]";
	}
	
}
