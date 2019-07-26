package Buoi1;


import java.io.Serializable;


public class Employee implements Serializable, Comparable<Employee> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String salary;
	String address;
	int    year;
	
	public Employee (String name, String salary, String address, int year) {
		this.name    = name;
		this.salary  = salary;
		this.address = address;
		this.year    = year;
	}
	public String showEmployee () {
		return name+", "+year+", "+salary+", "+address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int compareTo(Employee arg0) {
		// TODO Auto-generated method stub
		return this.name.length() -  arg0.getName().length();
	}
	
}
