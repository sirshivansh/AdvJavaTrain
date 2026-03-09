//09-03-26
//Average of three number using function

import java.util.Scanner;

class Avg
{
	Scanner sc = new Scanner(System.in);
	float n1,n2,n3;
	float avg;

	public void accept()
	{
		System.out.println("Enter Three Numbers: ");
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
	}

	public void calculate()
	{
		avg = (n1+n2+n3)/3;
		System.out.println("The average of three numbers: "+avg);
	}
}

class threeAvg
{
	public static void main(String args[])
	{
		Avg av = new Avg();
		av.accept();
		av.calculate();
	}
}