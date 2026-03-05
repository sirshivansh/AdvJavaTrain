// WAP that takes input from user and does all arithmetic operations possible.

import java.util.Scanner;

class inputArthOps{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the First number: ");
		double a = sc.nextDouble();
		System.out.println("Enter the Second number: ");
		double b = sc.nextDouble();

		//Operations
		double sum = a + b;
		System.out.println("\nThe Sum of "+ a +" and "+ b +": "+sum);

		double sub = a - b;
		System.out.println("\nThe Difference of "+ a +" and "+ b+": "+sub);

		double mul = a * b;
		System.out.println("\nThe Multiplication of "+ a +" and "+ b+": "+mul);

		double div = a / b;
		System.out.println("\nThe Divison of "+ a +" and "+ b+": "+div);

		double rem = a % b;
		System.out.println("\nThe Remainder of "+ a+ " and "+b+": "+rem);
	}
}