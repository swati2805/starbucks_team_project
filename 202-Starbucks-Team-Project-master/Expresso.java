package Starbucks;

public class Expresso implements Drink{


	private final double costOfSmall = 5.00;
	private final double costOfMedium = 6.50;
	private final double costOfLarge = 8;

	@Override
	public double drinkCost(String size) {

		double cost = 0.0;
		switch(size) {
		case "S":
			cost = costOfSmall;
			break;
		case "M":
			cost = costOfMedium;
			break;
		case "L":
			cost = costOfLarge;
			break;
		}
		return cost;
	}

}
