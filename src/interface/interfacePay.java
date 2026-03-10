//Create interface payment with method pay. Impelement this interface in UPI Payment and cash Payment class.

interface payment
{
	void pay();
}

class upiPayment implements payment
{
	public void pay()
	{
		System.out.println("Online Payment");
	}
}

class cashPayment implements payment
{
	public void pay()
	{
		System.out.println("Cash Payment");
	}
}

public class interfacePay
{
	public static void main(String args[])
	{
		upiPayment upi = new upiPayment();
		cashPayment csh = new cashPayment();

		upi.pay();
		csh.pay();
	}
}