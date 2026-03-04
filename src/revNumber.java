//WAP to reverse a number

import java.util.Scanner;

class revNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the number which you want to reverse: ");
		int a = sc.nextInt();
		int rem, rev = 0;
		while(a > 0){
			rem = a % 10;
			rev = rev * 10 + rem;
			a = a/10;
		}
		System.out.println("The Reversed Number is : "+ rev);
	}
}