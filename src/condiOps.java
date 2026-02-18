import java.util.Scanner;
public class condiOps {
    public static void main(String [] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : " );
        a = sc.nextInt();
        b = sc.nextInt();
        if ( a>b ){
            System.out.println(a + " is Greater than " + b);
        } else {
            System.out.println(b + " is Greater than " + a);
        }
    }
}
