package patterns.Abstarct;

class AndroidDeveloper implements Employee{
    @Override
    public int salary(){
        System.out.println("Android Developer Salary");
        return 20000;
    }
    @Override
    public String name(){
        System.out.println("Android Developer Name");
        return "Android Developer";
    }

}