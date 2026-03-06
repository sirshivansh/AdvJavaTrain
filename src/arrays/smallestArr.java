// Find the smallest number in the input array

import java.util.Scanner;

class smallestArr
{
	public static void main(String args[])
	{
		int i;
		int a[] = new int[5];
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 numbers for array 1: ");
		for(i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Array Entered: ");
		for(i=0; i<5; i++)
		{
			System.out.print("\t"+a[i]+"\t");
		}

		int min = a[0];
		for(i=0; i<5; i++)
		{
			if( a[i] < min )
			{
				min = a[i];
			}
		}
		System.out.println("\nThe minimum number is: "+min);
	}
}