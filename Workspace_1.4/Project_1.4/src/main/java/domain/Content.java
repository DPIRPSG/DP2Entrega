package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Min;

@Entity
@Access(AccessType.PROPERTY)
public class Content extends DomainEntity{

	public int units;
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
