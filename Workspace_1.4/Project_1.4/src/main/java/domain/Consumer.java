package domain;

import java.util.Collection;

import javax.validation.Valid;

public class Consumer extends Actor {

	private ShoppingCart shoppingCart;
	private Collection<Order> order;
	
	@Valid
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	@Valid
	public Collection<Order> getOrder() {
		return order;
	}
	public void setOrder(Collection<Order> order) {
		this.order = order;
	}
	

}
