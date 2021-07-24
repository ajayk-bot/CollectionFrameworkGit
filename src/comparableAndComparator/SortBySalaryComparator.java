package comparableAndComparator;

import java.util.Comparator;

public class SortBySalaryComparator implements Comparator<TestEmployee>{

	
	@Override
	public int compare(TestEmployee sal1, TestEmployee sal2) {
		// TODO Auto-generated method stub
		return (int) (sal1.getSalary() - sal2.getSalary());
	}

}
