package starbucks;

import java.util.ArrayList;
import java.util.List;

public class OrderDetails {
	
	private static OrderDetails orderDetails = null;
	static List<OrderItem> itemsList ;
	static double bill=0.0;
	static String status = "";
	
	private OrderDetails(List<OrderItem> items) {
		itemsList = items;
		bill=0.0;
		status ="";
	}
	
	
	public static OrderDetails getInstance() {
		
		if (orderDetails == null) {
			resetOrNewOrder();
		}
        return orderDetails; 
	}
	
	public static void resetOrNewOrder() {
		List<OrderItem> items = new ArrayList<OrderItem>();
		orderDetails =  new OrderDetails(items); 
	}
	
}
