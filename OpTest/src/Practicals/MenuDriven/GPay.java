package Practicals.MenuDriven;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

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

    public void getSalary(int id){
        for(Employee list : employees){
            if(list.getEmpid()==id){
                System.out.println("Employee Name : "+list.getName());
                System.out.println("Employee Department no : "+list.getDeptno());
                System.out.println("Employee Salary : "+list.getSalary());
                exit(0);
            }
        }
        System.out.println("Wrong ID ! ! !");
    }
}

