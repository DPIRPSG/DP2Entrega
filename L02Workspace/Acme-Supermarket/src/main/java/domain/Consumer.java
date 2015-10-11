package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
@Access(AccessType.PROPERTY)
public class Consumer extends Actor {

	private Collection<Item> item;
	private Collection<Order> order;

	@ManyToMany
	public Collection<Item> getItem() {
		return item;
	}

	public void setItem(Collection<Item> item) {
		this.item = item;
	}

	@OneToMany
	public Collection<Order> getOrder() {
		return order;
	}

	public void setOrder(Collection<Order> order) {
		this.order = order;
	}

	public boolean add(Order e) {
		return order.add(e);
	}

	public boolean remove(Object o) {
		return order.remove(o);
	}
	

}
