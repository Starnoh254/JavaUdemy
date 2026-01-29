package lessons;

public class LessonE {
    public static void main(String[] args){
        BankAccount account = new BankAccount();
        // account.balance = 35000.0; This is wrong , only be accessed by BankAccount class

        new User().username = "Nosta"; // username here can be accessed . 

    }
}

class BankAccount {
    private double balance; // private access , only this class can touch this variable.

    public void deposit(double amount){
        this.balance += amount;
    }
}


class Dog extends Animal{
    void bark(){
        makeSound(); // allowed
    }
}

