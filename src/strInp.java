//String input


import java.util.Scanner;

class strInp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();

		char inputData = name.charAt(0);

		System.out.println("Your name is: "+name);
		System.out.println("Your start word is: "+ inputData);
	}
}