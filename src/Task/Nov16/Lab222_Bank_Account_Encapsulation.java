package Task.Nov16;

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}

public class Lab222_Bank_Account_Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        acc.deposit(500);
        System.out.println("Balance after deposit: " + acc.balance);

        acc.withdraw(200);
        System.out.println("Balance after withdrawal: " + acc.balance);
    }
}
