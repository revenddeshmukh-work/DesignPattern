package patterns.factory;
class WebDeveloper implements Employee{
    public int salary(){
        System.out.println("Web Developer Salary");
        return 30000;
    }
}