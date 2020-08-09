package starbucks;

public class AddCard {
	

	public String addStrabucksCard(String cardNum, String cardCode, double initialBalance) {
		
		String response = "Card could not be added.";
		
		if(cardNum.length()!=9) {
			response = response+" "+ cardNum + " Card number is invalid";
			return response;
		}
		if(cardCode.length()!=3) {
			response = response+" "+  cardCode+ " Card code is invalid";
			return response;
		}
		
		boolean rep = StarbucksCard.createNewCard(cardNum, cardCode, initialBalance);
		if(rep) {
			return "Card: "+cardNum+" with code :"+cardCode+" with amount "+initialBalance +" has been successfully added";
		}
		
		return "Card could not be added. Please try after some time";
	}
}
