import java.util.*;

public class Transaction
{
	private List<Item> items;
	private Date date;
	private int amountInCents;

	public Transaction(Date date, int amountInCents)
	{
		this.date = date;
		this.amountInCents = amountInCents;

		items = new LinkedList<>();
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public int getAmountInCents()
	{
		return amountInCents;
	}

	public void setAmountInCents(int amountInCents)
	{
		this.amountInCents = amountInCents;
	}
}
