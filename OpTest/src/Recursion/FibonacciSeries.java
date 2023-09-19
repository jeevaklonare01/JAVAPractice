package Recursion;

public class FibonacciSeries {
    public static int Fib(int num){
        if(num==0 || num==1)
            return num;
        return Fib(num-1)+Fib(num-2);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of "+3+" "+Fib(3));
        System.out.println("Factorial of "+4+" "+Fib(4));
        System.out.println("Factorial of "+5+" "+Fib(5));
    }
}
