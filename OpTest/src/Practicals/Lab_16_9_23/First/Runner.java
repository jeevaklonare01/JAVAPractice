package Practicals.Lab_16_9_23.First;

public class Runner {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();
        Sphere sp = new Sphere();
        double areasp = sp.area();
        double areacy = cy.area();
        System.out.println("Area of Cylinder : "+areacy);
        System.out.println("Area of Sphere : "+areasp);
    }
}
