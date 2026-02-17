//17-02-26
import java.util.Scanner;
class areaCircle
{
	public static void main(String[] args)
	{
		float r,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of Circle : ");
		r = sc.nextFloat();
		area = 3.14f * r * r;
			//here f is used to avoid lossy conversion from double to float
		System.out.println("The Area of Circle is : " + area);
	}
} 
		