package starbucks.order;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import starbucks.AddCard;
import starbucks.ManageOrder;
import starbucks.OrderItem;
import starbucks.TempCard;

@RestController
public class OrderController {
	
//	@RequestMapping("/manageorder")
//	public String manageOrder() {
//		
//		//temp code - start
//		ManageOrder order = new ManageOrder();
//		OrderItem orderItem = new OrderItem();
//		List<OrderItem> finalOrder = new ArrayList<OrderItem>();
//		List<String> addOn = new ArrayList<String>();
//		
//		orderItem.setItemCode("CafeMocha");
//		orderItem.setPickUpLoc("Downtown");
//		orderItem.setSize("S");
//		addOn.add("Cream");
//		orderItem.setAddOns(addOn);
//		
//		finalOrder.add(orderItem);
//		
//		// temp code - end
//		
//		String resp = order.manageOrder(finalOrder);
//		
//		return resp;
//	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/manageorder")
//	public String addCard(@PathVariable String cardNum, @PathVariable String cardCode, @PathVariable double initialAmt) {
	public String manageOrder(@RequestBody OrderItem finalOrder) {
//		System.out.println("===== "+finalOrder.getItemCode());
		List<OrderItem> items = new ArrayList<OrderItem>();
		items.add(finalOrder);
		ManageOrder order = new ManageOrder();
		String resp = order.manageOrder(items);
		return resp;
	}
	
	


}
