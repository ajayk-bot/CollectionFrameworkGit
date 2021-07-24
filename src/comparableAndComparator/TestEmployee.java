package comparableAndComparator;

public class TestEmployee {// implements Comparable<TestEmployee>{

	private int id;
	private int balance;
	private double salary;
	private String name;
	private String address;

	public TestEmployee(int i, int balance, double salary, String name, String address) {
		super();
		this.id = i;
		this.balance = balance;
		this.salary = salary;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "TestEmployee [id=" + id + ", balance=" + balance + ", salary=" + salary + ", name=" + name
				+ ", address=" + address + "]";
	}

	/*
	 * 
	 * @Override public int compareTo(TestEmployee o) { // TODO Auto-generated
	 * method stub return this.getId() - o.getId(); }
	 * 
	 */	
}
