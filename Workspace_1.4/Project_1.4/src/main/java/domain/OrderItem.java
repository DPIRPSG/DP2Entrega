package domain;

import java.util.Collection;


import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class OrderItem extends DomainEntity{
	private String sku;
	private String name;
	private String description;
	private double price;
	private Collection<String> tags;
	private String picture;
	private boolean deleted;
	private double tax;
	private String nameCategory;
	private int units;
	private Order order;
	
	@NotBlank
	@Column(unique = true)
	@Pattern(regexp="^\\w{2}\\-\\w{4}$")
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	@NotBlank
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@NotBlank
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	//@NotNull
	@Min(0)
	@Digits(integer=9, fraction=2)
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@ElementCollection
	public Collection<String> getTags() {
		return tags;
	}
	public void setTags(Collection<String> tags) {
		this.tags = tags;
	}
	public boolean addTags(String e) {
		return tags.add(e);
	}
	public boolean removeTags(Object o) {
		return tags.remove(o);
	}
	
	@URL
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	//Al ser primitivo no permite null
	public boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	
	//NotNull
	@Min(0)
	@Digits(integer = 3, fraction = 2)
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@NotBlank
	public String getNameCategory() {
		return nameCategory;
	}
	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}
	
	//NotNull
	@Min(1)
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	
	@ManyToOne(optional = false)
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
}
