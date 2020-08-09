package starbucks;

import java.util.Arrays;

public class Store {
	
	String[] currentLocDowntown = new String[]{ "Downtown", "RoseGarden", "Santa Clara"};  
	String[] currentLocAirport = new String[]{"Airport","Little Itlay" };  
	String[] currentLocRoseGarden = new String[]{ "Downtown", "RoseGarden"};  
	String[] currentLocSantaClara = new String[]{"Santa Clara","Downtown"}; 
	String[] currentLocLittleItlay = new String[]{"Airport","Little Itlay" ,"Downtown"}; 
	
	
	public String listAllStrores(String currentLoc) {
		
		if("Downtown".equalsIgnoreCase(currentLoc)) {
			return Arrays.toString(currentLocDowntown);
		}
		else if("Airport".equalsIgnoreCase(currentLoc)) {
			return Arrays.toString(currentLocAirport);
		}
		else if("RoseGarden".equalsIgnoreCase(currentLoc)) {
			return Arrays.toString(currentLocRoseGarden);
		}
		else if("SantaClara".equalsIgnoreCase(currentLoc)) {
			return Arrays.toString(currentLocSantaClara);
		}
		else if("LittleItlay".equalsIgnoreCase(currentLoc)) {
			return Arrays.toString(currentLocLittleItlay);
		}
		return "No stores found near you";
	}

}
