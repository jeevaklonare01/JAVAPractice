package Encapsulation;

import java.util.Scanner;

public class TestPayTm {
    public static void main(String[] args) {
        Paytm paytm = new Paytm();
        Scanner sc = new Scanner(System.in);
        paytm.createCustomer();
        paytm.createCustomer();
        System.out.println("Enter UPI pin to check balance : ");
        int pin = sc.nextInt();
        paytm.getBalance(pin);
    }
}
