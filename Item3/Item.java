import java.util.Collection;

public class Item {

	public String sku;

	public String name;

	public String description;

	public Double price;

	public String[] tags;

	public String[] picture;

	public Boolean deleted;

	public Collection<Consumer> user;

	private Category category;

	private Tax tax;

	private Collection<CustomizationInfo> customizationInfo;

	private Collection<Comment> comment;

	private Collection<Storage> storage;

}
