// WAP to accept a number from user and display table of it.
//02-03-26

import java.util.Scanner;
class TableGenerator{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int a = sc.nextInt();
			System.out.println("Table is as follows:");
			for(int i = 1; i <= 10; i++){
				System.out.println(a +" x "+ i + " = " + a*i);
			}
	}
}
