package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public abstract class Actor extends DomainEntity{

	private String name;
	private String surname;
	private String email;
	private String[] phone;
	private Collection<Folder> folder;
	private Collection<Message> sent;
	private Collection<Message> received;
	private UserAccount userAccount;
	
	@NotBlank
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@NotBlank
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Email
	@NotBlank
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Pattern(regexp = "^(\\+?\\d{1,3}?[- .]?)?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$")
	public String[] getPhone() {
		return phone;
	}
	public void setPhone(String[] phone) {
		this.phone = phone;
	}
	
	@Valid
	@OneToMany
	@Size(min = 3)
	public Collection<Folder> getFolder() {
		return folder;
	}
	public void setFolder(Collection<Folder> folder) {
		this.folder = folder;
	}
	
	@Valid
	@OneToMany(mappedBy = "sender")
	public Collection<Message> getSent() {
		return sent;
	}
	public void setSent(Collection<Message> sent) {
		this.sent = sent;
	}
	
	@Valid
	@OneToMany(mappedBy = "recipient")
	public Collection<Message> getReceived() {
		return received;
	}
	public void setReceived(Collection<Message> received) {
		this.received = received;
	}
	
	@NotNull
	@Valid
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	public UserAccount getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

}
