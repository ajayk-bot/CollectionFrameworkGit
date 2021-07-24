package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSortPrimitiveDataType {

	public static void main(String[] args) {

		ArrayList<TestEmployee> arrayTest = new ArrayList<TestEmployee>();

		TestEmployee emp1 = new TestEmployee(23, 4000, 10000, "Ajay", "Pune");
		TestEmployee emp2 = new TestEmployee(4, 5000, 9000, "Sanajay", "Abam");
		TestEmployee emp3 = new TestEmployee(41, 3000, 2000, "shashi", "Mumbai");
		TestEmployee emp4 = new TestEmployee(10, 12000, 11000, "mahesh", "Shilong");

		arrayTest.add(emp1);
		arrayTest.add(emp2);
		arrayTest.add(emp3);
		arrayTest.add(emp4);
		System.out.println(arrayTest);

		// make the comparator
		Comparator<TestEmployee> idComparator = new Comparator<TestEmployee>() {

			@Override
			public int compare(TestEmployee T1, TestEmployee T2) {
				// TODO Auto-generated method stub
				return T1.getId() - T2.getId();
			}
		};

		Collections.sort(arrayTest, idComparator);
		System.out.println(arrayTest);
		// arrayTest.sort(idComparator);
		// System.out.println(arrayTest);
	}

}
