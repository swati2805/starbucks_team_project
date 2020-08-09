package starbucks.order;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import starbucks.AddCard;
import starbucks.MakePayment;
import starbucks.StarbucksCard;
import starbucks.TempCard;

@RestController
public class PaymentController {
	
	@RequestMapping("/payment")
	public String makePayment() {
		MakePayment payment = new MakePayment();
		String resp = payment.makePayment();
		return resp;
	}

}
