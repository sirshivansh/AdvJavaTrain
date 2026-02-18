import java.util.Scanner;
public class posNegZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num = sc.nextInt();
        if ( num > 0 ){
            System.out.println(num + " is a positive integer.");
        } else if ( num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero ");
        }
    }
}
