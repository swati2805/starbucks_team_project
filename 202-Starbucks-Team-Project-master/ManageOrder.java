package starbucks;
import java.util.Arrays;
import java.util.List;

public class ManageOrder {
	
	OrderItem orderItem = new OrderItem();
	Drink cafeMocha = new CafeMocha();
	Drink cafeLate = new CafeLate();
	Drink expresso = new Expresso();
	AddOns creamAddOn = new CreamAddOn();
	AddOns caramelAddOn = new CaramelAddOn();
	MakePayment payment = new MakePayment();
	
	
	//accepted inputs by the API
	String[] itemArray = new String[]{ "CafeMocha", "CafeLate", "Expresso" }; 
	String[] locArray = new String[]{ "Downtown", "RoseGarden", "Airport" }; 
	String[] sizeArray = new String[]{ "L", "M", "S" }; 
	String[] addOnArray = new String[]{ "Cream", "Caramel"}; 
	
	public String manageOrder(List<OrderItem> items) {
		
		for(int i=0;i<items.size();i++) {
			
			OrderItem item = items.get(0);
			String response = isOrderAccepted(item);
			if(!"success".equals(response)) {
				return response;
			}
		}
		
		
		String response = placeOrder(items);
		return response;
		
	}
	
	public String placeOrder(List<OrderItem> items) {
		
		System.out.println("Preparing order");
		OrderDetails.getInstance().itemsList = items;
		double totalBill = calculateCost();
		System.out.println("Total bill = "+totalBill);
		//OrderDetails.getInstance();
		
		OrderDetails.getInstance().bill = totalBill;
		OrderDetails.getInstance().status = "payment_pending";
		System.out.println("Checking Card for balance");
		String resp = payment.makePayment();
		if(!"success".equalsIgnoreCase(resp)) {
			return resp;
		}
		return "Order successful";
		
	}
	
	
	
	public double calculateCost() {
		double totalBill = 0.0;
		
		for(int i=0;i<OrderDetails.getInstance().itemsList.size();i++) {
			OrderItem item = OrderDetails.getInstance().itemsList.get(0);
			if("CafeMocha".equalsIgnoreCase(item.getItemCode())) {
				totalBill = totalBill + cafeMocha.drinkCost(item.getSize());
			}else if ("CafeLate".equalsIgnoreCase(item.getItemCode())) {
				totalBill = totalBill + cafeLate.drinkCost(item.getSize());
			}else if ("Expresso".equalsIgnoreCase(item.getItemCode())) {
				totalBill = totalBill + expresso.drinkCost(item.getSize());
			}
//			if (item.getAddOns().contains("Caramel")){
			if ("Caramel".equalsIgnoreCase(item.getAddOns())){
				totalBill = totalBill + caramelAddOn.addOnCost();
			}
//			if (item.getAddOns().contains("Cream")){
			if ("Cream".equalsIgnoreCase(item.getAddOns())){
				totalBill = totalBill + creamAddOn.addOnCost();
			}
		}
		return totalBill;
	}
	
	public String isOrderAccepted(OrderItem item) {
		if(Arrays.asList(itemArray).contains(item.getItemCode())) {
			if(Arrays.asList(locArray).contains(item.getPickUpLoc())) {
				if(Arrays.asList(sizeArray).contains(item.getSize())) {
//						if(Arrays.asList(addOnArray).containsAll(item.getAddOns())) {
					if(Arrays.asList(addOnArray).contains(item.getAddOns())) {
						return "success";
					}else {
						return "Add on not available";
					}
				}else {
					return "Invalid drink size";
				}
			}else {
				return "Invalid pickup location";
			}
		}else {
			return "Drink not available";
		}
		//return "success";
	}

}
