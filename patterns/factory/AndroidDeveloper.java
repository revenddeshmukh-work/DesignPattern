package patterns.factory;

class AndroidDeveloper implements Employee{
    public int salary(){
        System.out.println("Android Developer Salary");
        return 20000;
    }

}