/* Implement multilevel inheritance, take three classes, 
class rectangle (to accept data)
class compute (to perform calculation), and
class result (to print output of the area of rectangle)
*/

import java.util.Scanner;

class rectangle
{
	float l,b,area;
	Scanner sc = new Scanner(System.in);

	public void accept()
	{
		System.out.println("Enter the length and breadth of Rectangle:");
		l = sc.nextFloat();
		b = sc.nextFloat();
	}
}


class compute extends rectangle
{
	public void calc()
	{
		area = l*b;
    }
}

class result extends compute
{
	public void display()
	{
		System.out.println("The area of rectangle is: "+area);		
	}
}


public class interfaceRect
{
	public static void main(String args[])
	{
		result rc = new result();
		rc.accept();
		rc.calc();
		rc.display();
	}
}