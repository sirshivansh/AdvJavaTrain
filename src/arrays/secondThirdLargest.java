// WAP to get 2nd and 3rd largest element from input array

import java.util.Scanner;

class secondThirdLargest
{
	public static void main(String args[])
	{
		int i,j;
		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter 5 Values: ");

		for(i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}

		int max = a[0];

		for(i=0; i<5; i++)
		{
			for(j=i+1; j<5; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.println("\n\tThe 2nd largest number: "+a[1]);
		System.out.println("\tThe 3rd largest number: "+a[2]+"\n");
	}
}