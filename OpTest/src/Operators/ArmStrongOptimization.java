package Operators;

import java.util.Scanner;

public class ArmStrongOptimization {
    public static void main(String[] args) {
        System.out.println("Enter the Desired Number : ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long sumOfPower=0, rem, temp1;
        String longtostr = Long.toString(num);
        long count = longtostr.length();

        temp1 = num;
        while (num != 0){
            rem = num % 10;
            sumOfPower = sumOfPower+(long)Math.pow(rem,count);
            num = num / 10;
        }
        if(temp1 == sumOfPower){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
