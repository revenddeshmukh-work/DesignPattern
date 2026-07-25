package patterns.Abstarct;

public class EmployeeFactory {
    public static Employee getEmployee(EmployeeAbstractFactory employee){
        return employee.createEmployee();
    }
}
