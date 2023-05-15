import java.util.*;

public class User
{
	private String userID;
	private String password;
	private String address;
	private String contactNumber;
	private String userName;

	private List<Item> userItems;
	private List<Transaction> userTransactions;
	private List<Item> userCart;

	public User(String userID, String password, String address, String contactNumber, String userName)
	{
		this.userID = userID;
		this.password = password;
		this.address = address;
		this.contactNumber = contactNumber;
		this.userName = userName;

		userItems = new ArrayList<>();
		userTransactions = new ArrayList<>();
		userCart = new LinkedList<>();
	}

	public void addItem(Item newItem)
	{
		for(Item item : userItems)
		{
			if (item.getProductID().equals(newItem.getProductID()))
			{
				return;
			}
		}

		userItems.add(newItem);
	}

	public String getUserID()
	{
		return userID;
	}

	public void setUserID(String userID)
	{
		this.userID = userID;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getContactNumber()
	{
		return contactNumber;
	}

	public void setContactNumber(String contactNumber)
	{
		this.contactNumber = contactNumber;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}
}
