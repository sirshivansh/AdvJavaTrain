// reverse the input array

import java.util.Scanner;

class revArray
{
	public static void main(String args[]){
		int a[] = new int[5];
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values: ");

		for(i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("The Entered Array is: ");
		for(i=0; i<5; i++)
		{
			System.out.print("\t"+a[i]+"\t");
		}

		System.out.println("\nThe Reversed Array is: ");
		for(i = a.length-1; i>=0; i--)
		{
			System.out.print("\t"+a[i]+"\t");
		}
	}
}