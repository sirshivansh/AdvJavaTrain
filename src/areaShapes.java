import java.util.Scanner;

class areaShapes{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int ch = 0;

		do{
			System.out.println("---------------------------------------------------------------");
			System.out.println("\nSelect choice of Shape from below");
			System.out.println("1. Circle\t 2. Rectangle\t 3. Square\t 4. Exit\n");
			System.out.println("---------------------------------------------------------------");
			System.out.print("\nEnter your choice: ");			

			if (sc.hasNextInt()){
				ch = sc.nextInt();
			} else {
				System.out.println("Invalid Input. Please Enter a number.");
				sc.next();
				continue;
			}

			System.out.println();
			double r,area,l,b,x;

			switch(ch)
			{
				case 1:
					System.out.print("Enter radius of Circle: ");
					r = sc.nextDouble();
					area = 3.14*r*r;
					System.out.println("Area of Circle: "+area);
					break;

				case 2:
					System.out.print("Enter Length and Breadth of Rectangle: ");
					l = sc.nextDouble();
					b = sc.nextDouble();
					area = l*b;
					System.out.println("Area of Rectangle: "+area);
					break;

				case 3:
					System.out.print("Enter the side length of square: ");
					x = sc.nextDouble();
					area = x*x;
					System.out.println("Area of Square: "+area);
					break;

				case 4:
					System.out.println("Exiting...");
					break;

				default:
					System.out.println("Invalid option. Enter 1, 2, 3 or 4.");
			}

			System.out.println("\n---------------------------------------------------------------");

		} while (ch != 4);

		sc.close();
	}
}