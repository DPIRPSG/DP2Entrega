package domain;

import java.util.Collection;

import javax.persistence.OneToMany;

public class ShoppingCart extends DomainEntity{

	public String[] comment;
	private Order order;
	private Collection<Addition> addition;
	
	
	public String[] getComment() {
		return comment;
	}
	public void setComment(String[] comment) {
		this.comment = comment;
	}
	
	
//Esto no está puesto en el gráfico aunque es lógico	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	@OneToMany
	public Collection<Addition> getAddition() {
		return addition;
	}
	public void setAddition(Collection<Addition> addition) {
		this.addition = addition;
	}

}
