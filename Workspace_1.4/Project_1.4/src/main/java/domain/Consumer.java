package domain;

import java.util.Collection;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;

public class Consumer extends Actor {

	private ShoppingCart shoppingCart;
	private Collection<Order> order;
	
	@Valid
	@OneToOne(optional = true)
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	@Valid
	@OneToMany
	public Collection<Order> getOrder() {
		return order;
	}
	public void setOrder(Collection<Order> order) {
		this.order = order;
	}
	

}
