package patterns.factory;

public class Main{
    public static void main(String[] args){
        Employee emp1 =  EmployeeFactory.getEmployee("web");
        int a = emp1.salary();
        System.out.println("Salary of Web Developer: " + a);
        Employee emp2 =  EmployeeFactory.getEmployee("android");
        int b = emp2.salary();
        System.out.println("Salary of Android Developer: " + b);
    }
}