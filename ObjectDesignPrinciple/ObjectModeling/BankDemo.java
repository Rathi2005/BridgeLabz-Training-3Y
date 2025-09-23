package Assignment.ObjectDesignPrinciple.ObjectModeling;

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c) {
        System.out.println("Account opened for " + c.name + " at " + bankName);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("XYZ Bank");
        Customer c1 = new Customer("Harshit", 5070);
        Customer c2 = new Customer("Utkarsh", 3600);

        bank.openAccount(c1);
        bank.openAccount(c2);

        c1.viewBalance();
        c2.viewBalance();
    }
}
