import java.util.Date;
import java.util.Collection;

public class Message {

	public String subject;

	public String body;

	public Date moment;

	private Actor sender;

	private Collection<Actor> recipient;

}
