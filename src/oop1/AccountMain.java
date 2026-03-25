package oop1;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.balance = 10000;

        account.withdraw(2000);
        account.withdraw(3000);
        account.deposit(20000);
    }
}
