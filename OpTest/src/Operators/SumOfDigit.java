package Operators;
import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = sc.nextInt();
        while(number>0){
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum Of Digits:" + sum);
    }
}
