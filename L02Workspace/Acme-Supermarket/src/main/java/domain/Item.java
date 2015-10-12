package domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Item extends DomainEntity{

	public String sku;
	public String name;
	public String description;
	public Money price;
	public String[] tags;
	public String picture;
	private Category category;
	private Tax tax;
	private Collection<Addition> addition;
	
	@NotBlank
	@Column(unique = true)
	@Pattern(regexp = "^\\w{2}\\-\\w{4}$")
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
	
	@NotNull
	public Money getPrice() {
		return price;
	}
	public void setPrice(Money price) {
		this.price = price;
	}
	
	
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	@URL
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	@NotNull
	@ManyToOne(optional = false)
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	@NotNull
	@ManyToOne(optional = false)
	public Tax getTax() {
		return tax;
	}
	public void setTax(Tax tax) {
		this.tax = tax;
	}
	
	@OneToMany
	public Collection<Addition> getAddition() {
		return addition;
	}
	public void setAddition(Collection<Addition> addition) {
		this.addition = addition;
	}

}
