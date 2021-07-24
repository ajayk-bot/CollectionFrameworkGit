package map_methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LoopThroughMapInJava {
	
	
	/*
	 * public static <Integer, Worker extends Comparable<Worker>> Worker
	 * maxUsingIteration(Map<Integer, Worker> map) { Map.Entry<Integer, Worker>
	 * maxEntry = null; for (Map.Entry<Integer, Worker> entry1 : map.entrySet()) {
	 * if (maxEntry == null || entry1.getValue().compareTo(maxEntry.getValue()) > 0)
	 * { maxEntry = entry1; } } return maxEntry.getValue();
	 * 
	 * }
	 */

	public static void main(String[] args) {
		
		HashMap<Integer, Worker> workHashMap = new HashMap<Integer, Worker>();

		workHashMap.put(76833, new Worker(76833, "Tim", 3000));
		workHashMap.put(76834, new Worker(76834, "Tarun", 5000));
		workHashMap.put(76835, new Worker(76835, "Nikolai", 6000));
		workHashMap.put(76836, new Worker(76836, "Roger", 3500));

		Set<Entry<Integer, Worker>> setOfviews = workHashMap.entrySet();
		List<Entry<Integer, Worker>> list = new ArrayList<>(setOfviews);

		/*
		 * Collections.sort(list, new Comparator<Entry<Integer, Worker>>() {
		 * 
		 * @Override public int compare(Entry<Integer, Worker> o1, Entry<Integer,
		 * Worker> o2) { // TODO Auto-generated method stub return
		 * o1.getValue().getName().compareTo(o2.getValue().getName()); } });
		 * 
		 */

		Comparator<Entry<Integer, Worker>> idComparator = new Comparator<Entry<Integer, Worker>>() {

			@Override
			public int compare(Entry<Integer, Worker> o1, Entry<Integer, Worker> o2) {

				return o1.getValue().getId() - o2.getValue().getId();
			}
		};

		Comparator<Entry<Integer, Worker>> salaryComparator = new Comparator<Entry<Integer, Worker>>() {

			@Override
			public int compare(Entry<Integer, Worker> o1, Entry<Integer, Worker> o2) {

				return o1.getValue().getSalary() - o2.getValue().getSalary();
			}
		};

		Comparator<Entry<Integer, Worker>> nameComparator = new Comparator<Entry<Integer, Worker>>() {

			@Override
			public int compare(Entry<Integer, Worker> o1, Entry<Integer, Worker> o2) {

				return o1.getValue().getName().compareTo(o2.getValue().getName());
			}
		};

		System.out.println("------sorted hashMap by name or ID or Salary--------- ");
		// Collections.sort(list, idComparator);
		// Collections.sort(list, salaryComparator);
		Collections.sort(list, nameComparator);

		for (Entry<Integer, Worker> entry : list) {
			System.out.println("KEY : " + entry.getKey() + " VALUE :" + entry.getValue());
		}

		System.out.println("Getting the worker by get() method: " + workHashMap.get(76834));// getting by key

		// looping through the map to get ID,Name,Salary
		Set<Entry<Integer, Worker>> entries = workHashMap.entrySet();
		for (Entry<Integer, Worker> entry : entries) {
			// System.out.println("Key : " + entry.getKey() + " Value :" +
			// entry.getValue());
			Worker worker = entry.getValue();
			System.out.println(
					" ID: " + worker.getId() + " Name: " + worker.getName() + " Salary: " + worker.getSalary());
		}

		// Getting the salary and updating the salary for each employee by 2
		// multiplication.

		for (Entry<Integer, Worker> entrySet : entries) {
			Worker worker = entrySet.getValue();
			int salaryOfemp = worker.getSalary();
			int HikeInSalary = salaryOfemp * 2;

			worker.setSalary(HikeInSalary);

		}

		// using collection getting a specific worker salary and print it in console
		// says want to print salary of emp [demon].
		Collection<Worker> workobj = workHashMap.values();
		// System.out.println(work);
		for (Worker w : workobj) {
			if (w.getName().equals("Nikolai")) {
				System.out.println("Nikolai salary is: " + w.getSalary());
			}
		}

		// print after salary hike:

		System.out.println("---print salary after HIKE -----");
		for (Iterator iterator = workobj.iterator(); iterator.hasNext();) {
			Worker worker = (Worker) iterator.next();

		}
		System.out.println(workobj);
	}

	/**
	 * Question : Find highest salary employee name and its salary; do the sort
	 * first on the bases of salary
	 **/

	
}


class Worker implements Comparable<Worker> {
	private int id;
	private String name;
	private int salary;

	public Worker(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Worker o) {
		if (this.getSalary() > o.getSalary()) {
			return 1;
		} else if (this.getSalary() < o.getSalary()) {
			return -1;
		} else {
			return 0;
		}
	}

}