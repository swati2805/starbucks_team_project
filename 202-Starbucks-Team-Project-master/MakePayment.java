package starbucks;

//import starbucks.StarbucksCard;

public class MakePayment {
	
	public String makePayment() {
		
		if("payment_pending".equalsIgnoreCase(OrderDetails.status)) {
			if("".equalsIgnoreCase(StarbucksCard.getCurrentCard().getCardNum()) || "000000000".equalsIgnoreCase(StarbucksCard.getCurrentCard().getCardNum())) {
				return "No Starbucks Card Added. Please add a card and proceed with paymnet";
			}
			double cardBalance = StarbucksCard.getCurrentCard().getBalance();
			if(cardBalance < OrderDetails.getInstance().bill) {
				return "Not enough balance in Starbucks Card";
			}
			else {
				StarbucksCard.getCurrentCard().substractBalance(OrderDetails.bill);
				OrderDetails.status="payment_complete";
				return "Payment successful for your order. New balance: "+StarbucksCard.getCurrentCard().getBalance();
			}
		}else {
			return "No pending paymnets";
		}
		
	}

}
