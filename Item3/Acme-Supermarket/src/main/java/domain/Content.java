 package domain;

import javax.validation.Valid;
import javax.validation.constraints.Min;

public class Content extends DomainEntity{

	private int units;
	private Item item;
	private ShoppingCart shoppingCart;
	
	//NotNull
	@Min(1)
	@Valid
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	@Valid
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	@Valid
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	

}
