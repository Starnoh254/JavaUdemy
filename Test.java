public class Test {
    public static void main (String[] args){
        BankAccount account = new BankAccount();

        account.deposit(1000.0);
        double res = account.withdraw(2000.0);

        System.out.println(res);
    }
}
