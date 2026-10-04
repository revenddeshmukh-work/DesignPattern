package patterns.Abstract;

 class WebFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee(){
        return new WebDeveloper();
    }
    
}
