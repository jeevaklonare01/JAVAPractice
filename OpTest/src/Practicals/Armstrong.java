package Practicals;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter the no you want to test for armstrong : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int remainder , rev = 0 , temp ,temp2,count=0;
        temp=num;
        while(num!= 0){
            remainder = num % 10;
            count++;
            num = num/ 10;
        }
        temp2 = temp;
        while(temp!=0){
            remainder = temp%10;
            double power = Math.pow(remainder,count);
            rev=rev + (int)power;
            temp = temp/10;
        }
        if (temp2 == rev){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
