//17-02-26
import java.util.Scanner;
class inputSum
{
	public static void main(String args[])
	{
		int a,b,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number a :");
		a = sc.nextInt();
		System.out.println("Enter Number b :");
		b = sc.nextInt();
		sum = a + b;
		System.out.println("The Sum of a & b is :" + sum);
	}
}