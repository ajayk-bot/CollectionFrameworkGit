package javastreamlearning;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamJavaPractise {

	public static void main(String[] args) {

		List<Person> person = new ArrayList<Person>();
		person.add(new Person("AJay", 100));
		person.add(new Person("sanjay", 50));
		person.add(new Person("shashi", 95));
		person.add(new Person("anshu", 150));
		person.add(new Person("satranjan", 200));

		/*
		 * System.out.println(person); for (Person person2 : person) {
		 * System.out.println(person2); }
		 */

		List<Person> hunderedDollarClub = new ArrayList<Person>();

		/*
		 * for (Person p : person) { if(p.billion >= 100) { hunderedDollarClub.add(p); }
		 * }
		 */

		// System.out.println(hunderedDollarClub);

		// hunderedDollarClub.forEach( per -> System.out.println(per.name));
		/*
		 * for (Person per1 : hunderedDollarClub) { System.out.println(per1.name); }
		 */

		//List<Person> DollarClub = person.stream().filter(per -> per.billion >= 100).sorted(Comparator.comparing(person -> ))
				//.(Collectors.toList());
		//DollarClub.forEach( per -> System.out.println(per.name));
	}

}

class Person {

	String name;
	int billion;

	public Person(String name, int billion) {
		super();
		this.name = name;
		this.billion = billion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.name + ", " + "Billion: " + this.billion + "";
	}

}