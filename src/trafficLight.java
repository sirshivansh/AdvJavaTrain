// WAP to create a traffic light indicator which shows you the speed of the vehicle based on input given by user.

import java.util.Scanner;
class trafficLight{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Red/Green/Yellow: (1/2/3) ");
		String x = sc.nextString();
		String Red, Green, Yellow;

		switch(x)
		{
			case 'R':
				System.out.println("Vehicle Speed should be 0");
				break;
			case Green:
				System.out.println("Vehicle is free to move");
				break;
			case Yellow:
				System.out.println("Vehicle is free to move slowly and cautiosly");
				break;
			default:
				break;
		}
	}
}