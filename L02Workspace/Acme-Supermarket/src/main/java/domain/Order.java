package domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Order extends DomainEntity{

	public String ticker;
	public Date placementMoment;
	public String adress;
	private ShoppingCart shoppingCart;
	private CreditCard creditCard;
	private Consumer consumer;
	
	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^\\d{6}\\-\\w{4}$")
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	@NotNull
	public Date getPlacementMoment() {
		return placementMoment;
	}
	public void setPlacementMoment(Date placementMoment) {
		this.placementMoment = placementMoment;
	}
	
	@NotBlank
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
//Esto no está puesto en el gráfico aunque es lógico	
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	
	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	@NotNull
	@Valid
	@ManyToOne(optional = false)	
	public Consumer getConsumer() {
		return consumer;
	}
	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}
	
	

}
