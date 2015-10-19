package domain;

import java.util.Collection;

public class Clerk extends Actor {

	private Collection<Order> order;

	public Collection<Order> getOrder() {
		return order;
	}
	public void setOrder(Collection<Order> order) {
		this.order = order;
	}


}
