// Generate Fibonacci Series

import java.util.Scanner;
public class Fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to generate Fibonacci Series: ");
		int n = sc.nextInt();

		int a = 0, b = 1, sum;

		System.out.print(a + "\t");
		System.out.print(b + "\t");

		for (int i = 1; i <= n; i++){
			sum = a+b;
			System.out.print(sum + "\t");

			a = b;
			b = sum;
		}
	}
}