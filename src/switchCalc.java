// WAP to create a basic calculator
// switch case

import java.util.Scanner;

class switchCalc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSelect choice from below given Menu\n");
		System.out.println("1. Addition\t 2.Substraction\t 3. Multiplication\t 4. Division\n");
		System.out.println("----------------------------------------------------------------------");
		System.out.print("Enter your choice: ");

		int ch = sc.nextInt();
		double num1,num2,ans;
		switch(ch)
		{
			case 1:
				System.out.println("Enter two Numbers: ");
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				ans = num1+num2;
				System.out.println("The sum of "+num1+" and "+num2+" is: "+ans);
				break;

			case 2:
				System.out.println("Enter two Numbers: ");
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				ans = num1-num2;
				System.out.println("The difference of "+num1+" and "+num2+" is: "+ ans);
				break;

			case 3:
				System.out.println("Enter two Numbers: ");
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				ans = num1*num2;
				System.out.println("The multiplication of "+num1+" and "+num2+" is: "+ ans);
				break;

			case 4:
				System.out.println("Enter two Numbers: ");
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();
				ans = num1/num2;
				System.out.println("The division of "+num1+" and "+num2+" is: "+ ans);
				break;

			default:
				System.out.println("Enter choice between 1-4");
				break;

		}
		System.out.println("----------------------------------------------------------------------");

	}
}