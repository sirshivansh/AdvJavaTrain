//09-03-26
// Input rectangle co ordinates and find area, using a functions

import java.util.Scanner;

class Rectangle
{
	int len,width,area;

	Scanner sc = new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter length and breadth of rectangle: ");
		len = sc.nextInt();
		width = sc.nextInt();
	}

	public void calculate()
	{
		area =  len * width;
		System.out.println("The area of rectangle is: "+area);
	}
}

public class RectMain
{
	public static void main(String args[])
	{
		Rectangle obj = new Rectangle();
		obj.accept();
		obj.calculate();
	}
}