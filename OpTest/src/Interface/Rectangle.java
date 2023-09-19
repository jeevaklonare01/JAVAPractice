package Interface;

public class Rectangle implements Polygon {
    final double  pi =3.14d;
    public void getArea(int length, int breadth) {
        System.out.println("Area of Rectangle : "+ length * breadth);
    }
    public void getArea(int radius){
        System.out.println("Area Of Circle : "+pi*radius*radius);
    }

    @Override
    public int operation(int no1, int no2) {
        int res = no1 + no2;
        return res;
    }
}
