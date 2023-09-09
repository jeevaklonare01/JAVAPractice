package Practicals.MenuDriven;

import java.util.Scanner;

public class TestGpay {
    public static void main(String[] args) {
        GPay gPay = new GPay();
        Scanner sc = new Scanner(System.in);
        gPay.createEmployee();
        gPay.createEmployee();
        System.out.println("Enter Employee ID to check salary : ");
        int id = sc.nextInt();
        gPay.getSalary(id);
    }
}
