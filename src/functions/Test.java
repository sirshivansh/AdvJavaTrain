class mobilePhone
{
	 String brand;
	 int battery;

	 void makeCall()
	 {
	 	System.out.println("Making a call");
	 }

	 void showDetails()
	 {
	 	System.out.println("Brand: "+brand);
	 	System.out.println("Battery: "+battery+"%");
	 }
}

class smartPhone extends mobilePhone
{
	void takePhoto()
	{
		System.out.println("Take photo using Camera!");
	}

	void useInternet()
	{
		System.out.println("Browsing Internet");
	}
}

public class Test
{
	public static void main(String args[])
	{
		smartPhone sp = new smartPhone();
		sp.brand = "Apple";
		sp.battery = 67;

		sp.makeCall();
		sp.showDetails();
		sp.takePhoto();
		sp.useInternet();
	}
}