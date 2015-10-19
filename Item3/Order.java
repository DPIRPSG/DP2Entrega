import java.util.Date;
import java.util.Collection;

public class Order {

	public String ticker;

	public Date placementMoment;

	public String address;

	public String deliveryMoment;

	public String cancellMoment;

	private CreditCard creditCard;

	private Clerk clerk;

	private Collection<OrderItem> orderItem;

	private Consumer consumer;

}
