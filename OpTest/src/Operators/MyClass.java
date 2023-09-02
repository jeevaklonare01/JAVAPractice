package Operators;

public class MyClass {

    int no1 = 10, no2 = 15;
   static int sum(int no1,int no2){
        return no1+no2;
    }
    public static void main(String[] args) {

        int no1  = 45, no2 = 65;
        System.out.println("No1:"+no1);
        System.out.println("No2:"+no2);
        System.out.println("Addition : "+sum(no1,no2));

    }
}
