public class Item
{
	private String productID;
	private String itemName;
	private String password;
	private String description;
	private int quantity;
	private int priceInCents;

	public Item(String productID, String itemName, String password, String description,
	            int quantity, int priceInCents)
	{
		this.productID = productID;
		this.itemName = itemName;
		this.password = password;
		this.description = description;
		this.quantity = quantity;
		this.priceInCents = priceInCents;
	}

	public void sellItem(int quantitySold)
	{
		quantity -= quantitySold;
	}

	public void addItem(int quantityAdded)
	{
		quantity += quantityAdded;
	}

	public String getProductID()
	{
		return productID;
	}

	public void setProductID(String productID)
	{
		this.productID = productID;
	}

	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public int getPriceInCents()
	{
		return priceInCents;
	}

	public void setPriceInCents(int priceInCents)
	{
		this.priceInCents = priceInCents;
	}
}
