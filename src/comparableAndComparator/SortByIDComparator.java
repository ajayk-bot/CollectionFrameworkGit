package comparableAndComparator;

import java.util.Comparator;

public class SortByIDComparator implements Comparator<TestEmployee> {

	@Override
	public int compare(TestEmployee o1, TestEmployee o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}

}
