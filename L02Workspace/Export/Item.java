import java.util.Collection;

public class Item {

	public String sku;

	public String name;

	public String description;

	public Money price;

	public String[] tags;

	public String picture;

	private Category category;

	private Tax tax;

	private Collection<Addition> addition;

}
