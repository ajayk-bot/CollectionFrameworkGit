package comparableAndComparator;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<TestEmployee>{

	@Override
	public int compare(TestEmployee name1, TestEmployee name2) {
		// TODO Auto-generated method stub
		return name1.getName().compareTo(name2.getName());
	}

}
