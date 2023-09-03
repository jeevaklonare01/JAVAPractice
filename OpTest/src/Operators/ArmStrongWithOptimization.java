package Operators;

import java.util.Scanner;

public class ArmStrongWithOptimization {
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem, rev = 0, temp, temp2 , count  = 0;
        temp=num;
        while(num!=0){
            rem = num % 10;
            count++;
            num = num/10;
        }
        temp2 = temp;
        while(temp!=0){
            rem = temp%10;
            double power = Math.pow(rem,count);
            rev = rev + (int)power;
            temp = temp/10;
        }
        if(temp2==rev){
            System.out.println("armstrong");
        }
        else {
            System.out.println("not armstrong");
        }
    }
}
