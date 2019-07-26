package Buoi1;

import java.util.*; 

public class App {
	public static void main (String[] arg) {
		System.out.println("Start Program");
		
		//1.a  Add Order to the list and print their information
		ArrayList<Order> arrLst= new ArrayList<Order>();
		Order order1 = new Order(00, "Delivery at morning, 145 Cong Hoa", new Date());
		arrLst.add(order1);
		Order order2 = new Order(01, "Delivery at noon, 275 Hoang Van Thu", new Date());
		arrLst.add(order2);
		System.out.println("Start to print ArrayList");
		printList(arrLst);
		
		//1.b Add Order to the Map (id as key) and print their information
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (Order odr: arrLst) {
			map.put(odr.getId(), odr.getDescription() + " " +odr.getDateOrder());
		}
		System.out.println("Start to print Map");
		printMap(map);
		
		//2.a Implement Comparable to Employee [name], sort and print data
		ArrayList<Employee> lst = new ArrayList<Employee>(); 
        lst.add(new Employee("John St", "12000", "12 Ton Duc Thang", 1993)); 
        lst.add(new Employee("Jack Martin", "2000", "123 Vo van Kiet", 1977)); 
        lst.add(new Employee("Sue", "22000", "227 Nguyen Van Linh", 1993)); 
        lst.add(new Employee("Mark John", "19000", "212 CMT8", 1993)); 
        System.out.println("\nStart to print unordered list\n");
        for (Employee em:lst) {
        	System.out.print(em.getName()+", "+em.getYear()+", "+em.getSalary()+", "+em.getAddress()+ "\n");
        }
        Collections.sort(lst);
        System.out.println("\nStart to print Comparable-ordered list\n");
        for (Employee em:lst) {
        	System.out.print(em.getName()+", "+em.getYear()+", "+em.getSalary()+", "+em.getAddress()+ "\n");
        }
        
        //2.b Implement Comparator for Order [Id], sort and print data
        ArrayList<Order> lst2 = new ArrayList<Order>();
        lst2.add(new Order(01, "Delivery at 28  Ly Tu Trong", new Date()));
        lst2.add(new Order(00, "Delivery at 238 Ly Thuong Kiet", new Date())); 
        lst2.add(new Order(04, "Delivery at 282 Ly Phuc Man", new Date())); 
        lst2.add(new Order(03, "Delivery at 128 Nguyen Tat Thanh", new Date()));
        System.out.println("\nStart to print unordered list\n");
        for (Order or:lst2) {
        	System.out.print(or.getId()+", "+or.getDescription()+", "+or.getDateOrder()+ "\n");
        }
        Collections.sort(lst2, new Order(02, "Delivery at 278  Ly Thong", new Date()));
        System.out.println("\nStart to print Comparator-ordered list\n");
        for (Order or:lst2) {
        	System.out.print(or.getId()+", "+or.getDescription()+", "+or.getDateOrder()+ "\n");
        }
	}
	
	
	public static void printList (ArrayList<Order> arrLst) {
		for (Order odr: arrLst) {
			System.out.println("/////////////////////////////////////");
			System.out.println("ID: " +odr.getId() );
			System.out.println("Description: " +odr.getDescription() );
			System.out.println("Date Order: " +odr.getDateOrder() );
		}
		System.out.println("/////////////////////////////////////");
	}
	
	public static void printMap(Map<Integer, String> map) {
		System.out.println("/////////////////////////////////////");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
		System.out.println("/////////////////////////////////////");
	}
}
