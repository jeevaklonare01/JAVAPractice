package Practicals.Lab_16_9_23.First;

import java.util.Scanner;

public class Cylinder implements Shape {

    @Override
    public double area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder : ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of cylinder : ");
        double height = sc.nextDouble();
        double res = 2*3.14*radius*height;
        return res;
    }
}
