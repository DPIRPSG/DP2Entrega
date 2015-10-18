import java.util.Collection;

public abstract class Actor {

	public String name;

	public String surname;

	public String email;

	public String[] phone;

	private Collection<Folder> folder;

	private Collection<Message> sent;

	private Collection<Message> received;

	private UserAccount userAccount;

}
