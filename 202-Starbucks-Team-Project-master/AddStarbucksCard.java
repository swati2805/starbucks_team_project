package starbucks;

public class AddStarbucksCard {
	
	public boolean addStrabucksCard(String cardNum, String cardCode, double initialBal) {
		
		StarbucksCard.createNewCard(cardNum, cardCode);
		return true;
	}

}
