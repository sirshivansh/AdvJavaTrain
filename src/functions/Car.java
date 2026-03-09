// WAP to explain car object

class Car
{
	String brand;
	String model;
	int year;
	void displayDetails()
	{
		System.out.println("Brand:= "+brand);
		System.out.println("Model:= "+model);
		System.out.println("Year:= "+year);
	}

	public static void main(String args[])
	{
		Car car1 = new Car();
		car1.brand="Toyota";
		car1.model="Innova";
		car1.year = 2022;

		Car car2 = new Car();
		car2.brand="Honda";
		car2.model="Civic";
		car2.year = 2025;

		car1.displayDetails();
		System.out.println();

		car2.displayDetails();
	}
}