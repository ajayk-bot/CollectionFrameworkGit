package listPractise;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {

		List<List<String>> listoflist = new ArrayList<List<String>>();
		
		List<String> innerList1 = new ArrayList<String>();
		innerList1.add("Test1");
		innerList1.add("Test2");
		innerList1.add("Test3");
		innerList1.add("Test4");
		
		System.out.println("innerlist1 is -->" + innerList1);
		
		List<String> innerList2 = new ArrayList<String>();
		innerList2.add("Test5");
		innerList2.add("Test6");
		innerList2.add("Test7");
		innerList2.add("Test8");
		
		System.out.println("innerlist2 is -->" + innerList2);
		
		listoflist.add(innerList1);
		listoflist.add(innerList2);
		System.out.println(listoflist.toString());
		
		System.out.println(listoflist.get(0));
		
		
		List  l1 = listoflist.get(0);
		List l2 = listoflist.get(1);
		
		System.out.println(l1.get(2));
		
	}

}
