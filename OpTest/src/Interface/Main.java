package Interface;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getArea(5,7);
        rectangle.getArea(10);
        System.out.println(rectangle.operation(10,5));
    }
}
