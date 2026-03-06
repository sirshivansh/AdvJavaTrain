// WAP to create a traffic light indicator which shows the speed of the vehicle based on user input.

import java.util.Scanner;

class trafficLight {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Traffic Light (R/G/Y): ");

        char x = Character.toUpperCase(sc.next().charAt(0));

        switch(x) {

            case 'R':
                System.out.println("RED Light => Vehicle Speed: 0 km/h (STOP)");
                break;

            case 'Y':
                System.out.println("YELLOW Light => Vehicle Speed: Slow (10 - 20 km/h)");
                break;

            case 'G':
                System.out.println("GREEN Light => Vehicle Speed: Normal (40 - 60 km/h)");
                break;

            default:
                System.out.println("Invalid Input. Enter R, G or Y.");
        }

        sc.close();
    }
}