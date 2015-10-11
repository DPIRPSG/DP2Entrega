package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Category extends DomainEntity{

	public String name;

	public String description;

	public String picture;

	private Collection<Item> item;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Collection<Item> getItem() {
		return item;
	}

	public void setItem(Collection<Item> item) {
		this.item = item;
	}
	
	
}
