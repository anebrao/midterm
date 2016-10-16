package exceptions;

import com.cisc181.core.Person;

public class PersonExceptions extends Exception {

	private Person p;

	public PersonExceptions(Person prson) {
		this.p = prson;
	}
}
