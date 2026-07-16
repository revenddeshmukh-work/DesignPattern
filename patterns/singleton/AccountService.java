package patterns.singleton;

public class AccountService {
    public void deposit(){
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.executeQuery("deposit money");
    }
    public void withdraw(){
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.executeQuery("withdraw money");
    }
    public void checkBalance(){
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        dbConnection.executeQuery("check balance");
    }
}
