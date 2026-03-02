// WAP to get sum of first n natural numbers.
// 02-03-26
public class SumOfNaturals{
	public static void main(String[] args){
		int sum = 0;
		for ( int i = 1; i <= 10; i++){
			sum = sum + i;
		}
		System.out.println("The sum of First 10 Naturals = " + sum);
	}
}