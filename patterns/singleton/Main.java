package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.deposit();
        accountService.withdraw();
        accountService.checkBalance();
    }   
}
