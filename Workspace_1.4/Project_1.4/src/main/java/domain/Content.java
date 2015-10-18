 package domain;

import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Min;

public class Content extends DomainEntity{

	private int units;
	private Item item;
	private ShoppingCart shoppingCart;
	
	//NotNull
	@Min(1)
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	@Valid
	@ManyToOne(optional = false)
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	@Valid
	@ManyToOne(optional = false)
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	

}
