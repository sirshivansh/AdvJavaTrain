// accept number from user and write table using while loop

import java.util.Scanner;

class inputTable{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number for which you want table: ");
		int a = sc.nextInt();
		int i=1;
		System.out.println("Table is as follows : ");
		//we are making table, so 10 values chhiye
		while(i <=10){
			System.out.println(a*i);
			i++;
		}
	}
}