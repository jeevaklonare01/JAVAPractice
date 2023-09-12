package Interface;

public class MainTest implements Area {
    @Override
    public void rectangleArea(int l, int b) {
        System.out.println("Area of Rectangle : "+l*b);
    }
    @Override
    public void message() {
        Area.super.message();
    }

    public static void main(String[] args) {
        MainTest test = new MainTest();
        test.rectangleArea(12,34);
        test.message();
    }
}
