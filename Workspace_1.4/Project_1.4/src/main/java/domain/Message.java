package domain;

import java.util.Date;
import java.util.Collection;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Message extends DomainEntity{
	public String subject;
	public String body;
	public Date moment;
	private Actor sender;
	private Collection<Actor> recipient;
	
	@NotBlank
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@NotBlank
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	@NotNull
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	@Valid
	@ManyToOne(optional = false)
	public Actor getSender() {
		return sender;
	}
	public void setSender(Actor sender) {
		this.sender = sender;
	}
	
	@Valid
	@ManyToMany(mappedBy = "received")
	@NotEmpty
	public Collection<Actor> getRecipient() {
		return recipient;
	}
	public void setRecipient(Collection<Actor> recipient) {
		this.recipient = recipient;
	}
	
}
