// class must start with Capital Letter
// methods and variables are accepting camelCase

// WAP to find largest among two numbers
// WAP to check whether a person is eligible for voting or not
// WAP to find largest among three numbers
// Check whether a number is even or odd.

// Q1. WAP to find largest among two numbers

import java.util.Scanner;

class TwoNum
{
	Scanner sc = new Scanner(System.in);
	int a, b;

	public void accept()
	{
		System.out.println("Enter Two numbers for comparison: ");
		a = sc.nextInt();
		b = sc.nextInt();
	}

	public void compare()
	{
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		} else if (a == b) {
			System.out.println(a+" is equal to "+b);
		} else {
			System.out.println(b+" is greater than "+a);
		}
	}
}

public class TwoNumLargest
{
	public static void main(String args[])
	{
		TwoNum tn = new TwoNum();
		tn.accept();
		tn.compare();
	}
}
