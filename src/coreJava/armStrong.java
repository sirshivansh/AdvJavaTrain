// WAP to check whether the number is Armstrong number or not.
// 370, 371, 153

import java.util.Scanner;

class armStrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numer to check whether it is Armstrong or not?");
		int a = sc.nextInt();
		int ogNum = a;

		int rem, sum = 0 ;
		while(a > 0){
			rem = a % 10;
			sum = sum + rem * rem * rem;
			a = a/10;
		}

		//checking

		if( ogNum == sum){
			System.out.println(ogNum + " is an Armstrong Number!");
		} else {
			System.out.println(ogNum + " is not an Armstrong Number!");
		}
	}
}