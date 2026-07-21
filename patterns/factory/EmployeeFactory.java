package patterns.factory;
class EmployeeFactory{
    public static Employee getEmployee(String type){
        if(type.equalsIgnoreCase("web")){
            return new WebDeveloper();
        }
        else if(type.equalsIgnoreCase("android")){
            return new AndroidDeveloper();
        }
        return null;
    }
}