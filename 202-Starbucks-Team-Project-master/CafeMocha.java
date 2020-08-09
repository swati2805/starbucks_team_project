package Starbucks;

public class CafeMocha implements Drink{


	private final double costOfSmall = 3.0;
	private final double costOfMedium = 4.5;
	private final double costOfLarge = 5;

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
