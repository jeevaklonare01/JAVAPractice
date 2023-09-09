package Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Paytm {

    ArrayList<Customer> customers = new ArrayList<>();
    public void createCustomer(){
        Customer customer = new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Details : ");
        System.out.println("Enter Name of Customer : ");
        customer.setName(sc.nextLine());
        System.out.println("Enter Account No of Customer : ");
        customer.setActno(sc.nextInt());
        System.out.println("Enter UPI Pin : ");
        customer.setPin(sc.nextInt());
        System.out.println("Enter Account Balance : ");
        customer.setBalance(sc.nextDouble());
        customers.add(customer);
        System.out.println("New customer created");
    }

    public void getBalance(int pin){
        for (Customer list: customers) {
            if (list.getPin() == pin){
                System.out.println("Customer Name : "+list.getName());
                System.out.println("Customer Account No : "+list.getActno());
                System.out.println("Customer Account Balance : "+list.getBalance());
                exit(0);

            }
        }
        System.out.println("Wrong Pin ! ! !");
    }
}
