// WAP to get sum of digit of user accepted number

import java.util.Scanner;

class sumOfInput{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of which you want sum : ");
		int a = sc.nextInt();
		int ogNum = a;
		int rem, sum = 0;
		while(a > 0){
			rem = a % 10;
			a = a/10;
			sum = sum + rem;
		}
		System.out.println("Sum of Digits of "+ ogNum + " is : "+ sum);
	}
}