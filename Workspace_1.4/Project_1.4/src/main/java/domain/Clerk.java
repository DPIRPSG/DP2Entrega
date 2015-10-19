package domain;

import java.util.Collection;

import javax.persistence.ManyToMany;

public class Clerk extends Actor {

	private Collection<Order> order;

	@ManyToMany
	public Collection<Order> getOrder() {
		return order;
	}
	public void setOrder(Collection<Order> order) {
		this.order = order;
	}


}
