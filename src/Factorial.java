// WAP to get factorial of a number.

import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for factorial: ");
		long n = sc.nextLong(); //used for large datasets
		System.out.println("The Factorial of "+ n+ "is");
		long fact = 1;
		for(long i = 1; i <= n; i++){
			fact = fact * i;
		}
		System.out.println(fact);
	}
}