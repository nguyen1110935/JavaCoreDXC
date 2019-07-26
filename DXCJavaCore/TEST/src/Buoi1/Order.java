package Buoi1;

import java.util.Comparator;
import java.util.Date;

public class Order implements Comparator<Order> {
	int id;
	String description;
	Date dateOrder;
	
	public Order (int id, String des, Date date){
		this.id= id;
		this.description = des;
		this.dateOrder = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	@Override
	public int compare(Order arg0, Order arg1) {
		// TODO Auto-generated method stub
		return arg0.getId()-arg1.getId();
	}
}
