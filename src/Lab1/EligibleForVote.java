// Q2. WAP to check whether a person is eligible for voting or not

import java.util.Scanner;

class AgeCheck
{
	Scanner sc = new Scanner(System.in);
	int a;

	public void accept()
	{
		System.out.println("Enter the Age of person: ");
		a = sc.nextInt();
	}

	public void compare()
	{
		if (a>=18)
		{
			System.out.println("Age: "+a);
			System.out.println("Person is eligible for voting.");
		} else {
			System.out.println("Age: "+a);
			System.out.println("Person is not eligible for voting");
		}
	}
}

public class EligibleForVote
{
	public static void main(String args[])
	{
		AgeCheck ac = new AgeCheck();
		ac.accept();
		ac.compare();
	}
}