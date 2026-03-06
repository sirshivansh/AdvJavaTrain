// ascending array

import java.util.Scanner;

class ascArray
{
	public static void main(String args[])
	{
		int i,j;
		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Values: ");

		for(i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}

		for(i=0; i<5; i++)
		{
			for(j=i+1; j<5; j++)
				{
					if(a[i] > a[j])
					{
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		System.out.println("\nElemnts in Ascending order are: \n");
		for(i=0; i<5; i++)
		{
			System.out.print("\t"+a[i]+"\t");
		}
		System.out.println();
	}
}