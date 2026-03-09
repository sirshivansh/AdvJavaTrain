//WAP to create class Person with members(name, age city) and check age of a person whether he is adult or not.

import java.util.Scanner;

class Person
{
	Scanner sc = new Scanner(System.in);
	String name, city;
	int age;

	public void accept()
	{
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter age");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter city:");
		city = sc.nextLine();
	}

	public void check()
	{
		if(age >= 18)
		{
			System.out.println(name+" is adult.");
		} else {
			System.out.println(name+" is not adult.");
		}
	}
}

class checkPerson
{
	public static void main(String args[])
	{
		Person p = new Person();
		p.accept();
		p.check();
	}
}