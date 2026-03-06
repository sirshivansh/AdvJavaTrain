// WAP to accept a percentage and make a decision, wheather student is fail, second class, first class or distinction student.

import java.util.Scanner;
public class resultStudent {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Percenatge marks : ");
        float marks = sc.nextFloat();
        if (marks < 40){
            System.out.println("Student is fail.");
        } else if (marks >= 40 && marks < 60){
            System.out.println("Student is passed with Second class.");
        } else if (marks >= 60 &&  marks < 75){
            System.out.println("Student is passed with First class.");
        } else if (marks >= 75 && marks <= 100){
            System.out.println("Student is passed with first grade.");
        } else {
            System.out.println("Tera baap laaya tha 100 se jyaada?");
        }
    }
}
