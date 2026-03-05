/* WAP to display total salary of a person
Accept basic salary from user
12% of basic salary is pf (sub)
10% HRA of basic salary (add)
12% DA of basic salary (add)

calculate net salary
*/


import java.util.Scanner;

class netSalary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Basic Salary: \t");
		double basicSal = sc.nextDouble();

		System.out.println("\n-----------------Your Salary Slip-----------------\n\n");
		double hra = (0.10)*basicSal;
		System.out.println("The HRA calculated is: "+ hra);
		double da = (0.12)*basicSal;
		System.out.println("The DA calculated is: "+ da);
		double pf = (0.12)*basicSal;
		System.out.println("The pf calculated is: "+ pf);

		double netSal = (basicSal + hra + da) - pf;

		System.out.println("\nThe net salary is: "+ netSal);
		System.out.println("\n--------------------------------------------------\n");
	}
}