package Practicals.MenuDriven;

import java.util.ArrayList;
import java.util.Scanner;

public class GPay {
    ArrayList<Employee> employees = new ArrayList<>();
    public void createEmployee(){
        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee details : ");
        System.out.println("Enter name of Employee : ");
        employee.setName(sc.nextLine());
        System.out.println("Enter Employee ID : ");
        employee.setEmpid(sc.nextInt());
        System.out.println("Enter Employee Department no : ");
        employee.setDeptno(sc.nextInt());
        System.out.println("Enter Salary Of Customer : ");
        employee.setSalary(sc.nextInt());
        employees.add(employee);
        System.out.println("New Employee Created : ");
    }
    
}
