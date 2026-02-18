/*
Calculate the electricity bill according to the following tariff:

Units Consumed       	Rate per Unit 
First 100 units	            ₹1.50
Next 100 units (101–200)	₹2.50
Next 100 units (201–300)	₹4.00
Above 300 units	            ₹6.00
*/
import java.util.Scanner;
public class electricBill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of units consumed : ");
        int units = sc.nextInt();

        double billAmount = 0;
        if (units <= 100){
            billAmount = units * 1.50;
        } else if (units <= 200) {
            billAmount = 100 * 1.50 + (units - 100)* 2.50;
        } else if ( units <= 300){
            billAmount = 100* 1.50 + 100*2.50 + (units - 200)*4.00;
        } else {
            billAmount = 100*1.50 + 100*2.50 + 100*4.00 + (units - 300)*6.00;
        }
        System.out.println("Electricity Bill Amount : " + billAmount);
        sc.close();
    }
}
