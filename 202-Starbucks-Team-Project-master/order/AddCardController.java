package starbucks.order;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import starbucks.AddCard;
import starbucks.StarbucksCard;
import starbucks.TempCard;

@RestController
public class AddCardController {
	
//	@RequestMapping("/addcard")
//	public String addCard() {
//		AddCard addCard = new AddCard();
//		String resp = addCard.addStrabucksCard("999999999", "333", 50.0);
//		return resp;
//	}
//	
//	
//	
//	@RequestMapping("/addcard/{cardNum}")
////	public String addCard(@PathVariable String cardNum, @PathVariable String cardCode, @PathVariable double initialAmt) {
//	public String addCard1(@PathVariable String cardNum) {
//		AddCard addCard = new AddCard();
//		String resp = addCard.addStrabucksCard(cardNum, "333", 50.0);
//		return resp;
//	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/addcard")
//	public String addCard(@PathVariable String cardNum, @PathVariable String cardCode, @PathVariable double initialAmt) {
	public String addCard(@RequestBody TempCard card) {
		AddCard addCard = new AddCard();
//		System.out.println("==========================================="+Double.parseDouble(card.getInitialBalance()));
		String resp = addCard.addStrabucksCard(card.getCardNum(), card.getCardCode(), card.getInitialBalance());
		return resp;
	}

}
