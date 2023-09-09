//package MenuDriven;
//import java.util.Scanner;
//public class TestArithmetic {
//    public static void main(String[] args) {
//        double no1, no2;
//        int choice;
//        char op;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Enter 1 for addition : ");
//            System.out.println("Enter 2 for subtraction : ");
//            System.out.println("Enter 3 for multiplication : ");
//            System.out.println("Enter 4 for division : ");
//            System.out.println("Enter 5 for exit : ");
//            choice = sc.nextInt();
//            System.out.println("Enter the 1st number : ");
//            no1 = sc.nextDouble();
//            System.out.println("Enter the 2nd number : ");
//            no2 = sc.nextDouble();
//            switch (choice) {
//                case 1 -> {
//                    System.out.println("Addition of" + no1 + "+" + no2 + "=" + Arithmetic.addition(no1, no2));
//                }
//                case 2 -> {
//                    System.out.println("Subtraction of" + no1 + "-" + no2 + "=" + Arithmetic.addition(no1, no2));
//                }
//                case 3 -> {
//                    System.out.println("Multiplication of" + no1 + "*" + no2 + "=" + Arithmetic.addition(no1, no2));
//                }
//                case 4 -> {
//                    System.out.println("Division of" + no1 + "/" + no2 + "=" + Arithmetic.addition(no1, no2));
//                }
//                default -> {
//                    System.out.println("Wrong Choice ! ! !");
//                }
//            }
//            System.out.println("Do you want to continue ? ? ? Y/N");
//            while (true) {
//                op = sc.next().charAt(0); //charAt(0) takes index 0 of character
//                if ((op == 'Y') || (op == 'y') || (op == 'N') || (op == 'n'))
//                    break;
//                else
//                    System.out.println("Enter Y for yes and N for no");
//            }while (op == 'y' || op == 'Y') ;
//        }
//}
//}