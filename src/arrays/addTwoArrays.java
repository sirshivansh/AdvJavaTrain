// addition of two arrays

import java.util.Scanner;

class addTwoArrays
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		int b[] = new int[5];
		int sum[] = new int[5];
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array 1");
		System.out.println("Enter 5 Values: ");

		for(i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter Array 2");
		System.out.println("Enter 5 Values: ");

		for(i=0; i<5; i++)
		{
			b[i] = sc.nextInt();
		}


		System.out.println("Array 1: ");
		for(i=0; i<5; i++)
		{
			System.out.print("\t"+a[i]+"\t");
		}

		System.out.println("\nArray 2: ");
		for(i=0; i<5; i++)
		{
			System.out.print("\t"+b[i]+"\t");
		}

		System.out.println("\nSum of Array 1 and Array 2: ");
		for(i=0; i<5; i++)
		{
			sum[i] = a[i]+b[i];
			System.out.print("\t"+b[i]+"\t");
		}
	}
}