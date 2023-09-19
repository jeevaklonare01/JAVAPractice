package Practicals.Lab_16_9_23.Second;

import java.util.Scanner;

public class StudentCreator {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Student you want to create? : ");
        int num = sc.nextInt();
        while (num!=0){
            studentController.createStudent();
            num--;
        }
        System.out.println("Enter the marks to find highest or not : ");
        studentController.getdetails(sc.nextDouble());

    }
}
