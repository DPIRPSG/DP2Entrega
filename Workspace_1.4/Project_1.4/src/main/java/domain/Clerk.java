package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@Access(AccessType.PROPERTY)
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
