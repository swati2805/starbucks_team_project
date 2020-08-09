package starbucks;

public class StarbucksCard {
	
	private final static double DEFAULT_BALANCE = 20.00;
	private final static int MAX_CARD_DIGITS = 9;
	private final static int MAX_CODE_DIGITS = 3;
	
	private static StarbucksCard starbucksCard = null; 
	private static String cardNum;
	private static String cardCode;
	private double balance;
	
	public String getCardNum() {
		return cardNum;
	}

	public String getCardCode() {
		return cardCode;
	}

	public double getBalance() {
		return balance;
	}

	private StarbucksCard(String cardNum, String cardCode, double balance) {
		this.cardNum = cardNum;
		this.cardCode = cardCode;
		this.balance = balance;
	}
	
	public static boolean createNewCard(String cardNum, String cardCode) {
		if(validateInput(cardNum, cardCode)) {
			starbucksCard = new StarbucksCard(cardNum, cardCode, DEFAULT_BALANCE);
			return true;
		}
		return false;
		
	}
	
	public static boolean createNewCard(String cardNum, String cardCode,double initialBalance) {
		if(validateInput(cardNum, cardCode)) {
			starbucksCard = new StarbucksCard(cardNum, cardCode, initialBalance);
			return true;
		}
		return false;
		
	}
	
	public static StarbucksCard getCurrentCard() {
		
		if (starbucksCard == null) {
			resetOrNewCard();
		}
        return starbucksCard; 
	}
	
	public void substractBalance(double amt) {
			balance = balance - amt;
	}
	
	private static boolean validateInput(String cardNum, String cardCode) {
		if(cardNum.length()== MAX_CARD_DIGITS && cardCode.length()== MAX_CODE_DIGITS) {
			return true;
		}
		return false;
	}
	
	public static void resetOrNewCard() {
		starbucksCard =  new StarbucksCard("000000000", "",0.00); 
		cardCode="";
	}
}
