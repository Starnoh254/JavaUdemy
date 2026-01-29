public class BankAccount {
    private double balance;

    public double deposit(double amount){
        return balance += amount;
    }

    public double withdraw(double amount) {
        if(amount > balance){
            return balance;
        }

        return balance -= amount;
    }
}



