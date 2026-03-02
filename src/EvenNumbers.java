// Generate Even Number

import java.util.Scanner;

public class EvenNumbers{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Final Limit for Numbers: ");
		int n = sc.nextInt();
		System.out.println();
		System.out.println("Even Numbers Before "+ n);
		for(int i = 1; i <= n; i++){
				if(i%2 == 0){
					System.out.print(i + "\t");
				}
		}
	}
}