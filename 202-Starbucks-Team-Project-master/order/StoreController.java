package starbucks.order;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import starbucks.Store;

@RestController
public class StoreController {
	
	@RequestMapping("/stores/{currectLoc}")
	public String getStores( @PathVariable String currectLoc) {
		Store store = new Store();
		return store.listAllStrores(currectLoc);
	}

}
