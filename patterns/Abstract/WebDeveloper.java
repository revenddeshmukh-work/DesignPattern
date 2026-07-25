package patterns.Abstarct;
class WebDeveloper implements Employee{
    @Override
    public int salary(){
        System.out.println("Web Developer Salary");
        return 30000;
    }
    @Override
    public String name(){

        System.out.println("Web Developer Name");
        return "Web Developer";
    }
}