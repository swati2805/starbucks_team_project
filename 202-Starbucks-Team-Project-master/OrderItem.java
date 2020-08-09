package starbucks;
import java.util.List;

public class OrderItem {
	
	private String itemCode;
	private String pickUpLoc;
	private String size;
//	private List addOns;
	private String addOns;
	
	public String getAddOns() {
		return addOns;
	}
	public void setAddOns(String addOns) {
		this.addOns = addOns;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getPickUpLoc() {
		return pickUpLoc;
	}
	public void setPickUpLoc(String pickUpLoc) {
		this.pickUpLoc = pickUpLoc;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
//	public List getAddOns() {
//		return addOns;
//	}
//	public void setAddOns(List addOns) {
//		this.addOns = addOns;
//	}
	
	
	
}
