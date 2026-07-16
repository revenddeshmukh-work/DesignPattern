package patterns.singleton;

public class DatabaseConnection {
    public static volatile  DatabaseConnection instance;
    public DatabaseConnection() {
        System.out.println("Database connection established.");
    }
    public static DatabaseConnection  getInstance(){
        if(instance==null){
            synchronized(DatabaseConnection.class){
                if(instance==null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}
