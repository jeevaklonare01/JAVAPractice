package Practicals;

public class AritmeticOpearator {
    public static int AdditionOfAno(int a, int b){
        return a+b;
    }
    public static int reverse (int num){
        int rim,rev=0;
        while(num!=0){
            int remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num/10;
        }
        return rev;
    }
    public static int armstrongno(int num){
        String dig=Integer.toString(num);
        int count=dig.length();
        int temp=num,rem=0,sum=0;

    while(num!=0) {
        rem = num % 10;
        sum = sum + (int) Math.pow(rem, count);
        num = num / 10;
    }
    if(temp==num) {
        System.out.println("It is Armstrong no");
    }else{
            System.out.println("It isn't Armstrong no");
        }
    return 1;
    }

}
