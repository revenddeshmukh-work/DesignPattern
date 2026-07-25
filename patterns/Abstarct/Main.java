package patterns.Abstarct;

public class Main {
    public static void main(String args[]){
        Employee emp1 = EmployeeFactory.getEmployee(new WebFactory());
        emp1.salary();
        emp1.name();
        Employee emp2 = EmployeeFactory.getEmployee(new AndroidFactory());
        emp2.salary();
        emp2.name();
        Employee emp3 = EmployeeFactory.getEmployee(new ManagerFactory());
        emp3.salary();
        emp3.name();
    }
}
