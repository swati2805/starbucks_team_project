package Starbucks;
import java.util.ArrayList;
import java.util.List;

public class TestMain {
	
	
	
	public static void main(String[] args) {
		
		ManageOrder order = new ManageOrder();
		OrderItem orderItem = new OrderItem();
		List<OrderItem> finalOrder = new ArrayList<OrderItem>();
		List<String> addOn = new ArrayList<String>();
		
		orderItem.setItemCode("CafeMocha");
		orderItem.setPickUpLoc("Downtown");
		orderItem.setSize("S");
		addOn.add("Cream");
		orderItem.setAddOns(addOn);
		
		finalOrder.add(orderItem);
		
		String resp = order.manageOrder(finalOrder);
		
		System.out.println("Order successfully placed "+ resp);
	}

}
