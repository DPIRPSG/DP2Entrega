package domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Item extends DomainEntity{
	private String sku;
	private String name;
	private String description;
	private double price;
	private Collection<String> tags;
	private String picture;
	private boolean deleted;
	private Category category;
	private Collection<Comment> comment;
	private Collection<Storage> storage;
	
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
	
	@Valid
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	@Valid
	public Collection<Comment> getComment() {
		return comment;
	}
	public void setComment(Collection<Comment> comment) {
		this.comment = comment;
	}
	
	@NotNull
	@Valid
	public Collection<Storage> getStorage() {
		return storage;
	}
	public void setStorage(Collection<Storage> storage) {
		this.storage = storage;
	}
	
	
}
