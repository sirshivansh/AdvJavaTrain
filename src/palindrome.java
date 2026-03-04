// WAP to check whether the number is plaindrome or not.

import java.util.Scanner;

class palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to check plaindrome: ");
		int a = sc.nextInt();
		int ogNum = a;
		// input mil gaya, ab reverse karna hai

		int rem, rev = 0;
		while( a > 0){
			rem = a % 10;
			rev = rev*10 + rem;
			a = a/10;
		}
		
		// reverse ho gaya, ab check karna hai original ke barabar hai kya?
		// or, plaindrome check krna hai

		if ( rev == ogNum ){
			System.out.println(ogNum + " is Palindrome!");
		} else {
			System.out.println(ogNum + " is not Palindrome!");
		}
	}
}