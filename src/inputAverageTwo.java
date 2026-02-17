//17-02-26
import java.util.Scanner;

class inputAverageTwo
{
	public static void main(String args[])
	{
		float a,b,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		a = sc.nextFloat();
		System.out.println("Enter second number : ");
		b = sc.nextFloat();
		avg = (a+b)/2;
		System.out.println("The average of both numbers is : " + avg);
	}
}