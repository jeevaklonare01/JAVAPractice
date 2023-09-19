package Practicals.Lab_16_9_23.Second;
import java.lang.Double;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Double> marks = new ArrayList<>();
     double highest =0.000000;
    public void createStudent(){
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter student details : ");
        System.out.println("Enter the name of Student : ");
        s.setName(sc.next());
        System.out.println("ENter the roll no of the Student :");
        s.setRollno(sc.nextInt());
        System.out.println("Enter the marks of the Student : ");
        s.setMarks(sc.nextDouble());
        students.add(s);
        marks.add(s.getMarks());
    }
    public void getdetails(double marks){
        for(Student s :students){
        if(highest < s.getMarks()){
            highest=s.getMarks();
            System.out.println("Your Marks Are Lower");
        }
        else{
            System.out.println("Name of the student"+s.getName());
            System.out.println("Roll no of the student"+s.getRollno());
            System.out.println("Highest mark is"+s.getMarks());
        }
        }

    }
}
