package domain;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;

public class ShoppingCart extends DomainEntity{
	private Collection<String> comment;
	private Consumer consumer;
	private Collection<Content> content;
	
	@ElementCollection
	public Collection<String> getComment() {
		return comment;
	}
	public void setComment(Collection<String> comment) {
		this.comment = comment;
	}
	public boolean addComment(String e) {
		return comment.add(e);
	}
	public boolean removeComment(Object o) {
		return comment.remove(o);
	}
	
	@Valid
	@OneToOne(optional = false)
	public Consumer getConsumer() {
		return consumer;
	}
	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}
	
	@Valid
	@OneToMany
	public Collection<Content> getContent() {
		return content;
	}
	public void setContent(Collection<Content> content) {
		this.content = content;
	}
	
	
}
