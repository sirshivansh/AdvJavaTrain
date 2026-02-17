import java.util.Scanner;
public class inputAverageAny {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values you want to average: ");
        int n = sc.nextInt();
        float sum = 0;
        for (int i =0; i < n; i++){
            System.out.println("Enter number " + (i+1) + ": ");
            float num = sc.nextFloat();
            sum += num;
        }
        float avg = sum / n;
        System.out.println("The average of the numbers is: " + avg);
    }
}
