package Practicals.Lab_16_9_23.First;

import java.util.Scanner;

public class Sphere implements Shape{
    @Override
    public double area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere : ");
        double radius = sc.nextDouble();
        double res = 4*3.14*radius*radius;
        return res;
    }
}
