package com.autumn.zen.ioc;

import com.autumn.zen.ioc.bean.Person;

public class PersonFactory {

	public Person createPaulGasol() {
		Person paulGasol = new Person(5, "Paul", "Gasol");
		return paulGasol;
	}

	public static Person createKobeBryant() {
		Person kobeBryant = new Person(6, "Kobe", "Bryant", 4000);
		return kobeBryant;
	}
}
