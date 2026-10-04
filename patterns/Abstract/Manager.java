package patterns.Abstract;

 class Manager implements Employee{
        @Override
    public int salary() {
        System.out.println("Manager Salary");
        return 50000;
    }
    @Override
    public String name() {
        System.out.println("Manager Name");
        return "Manager";
    }

}
