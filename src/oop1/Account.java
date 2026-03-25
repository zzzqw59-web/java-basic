package oop1;

public class Account {
    int balance;

    void deposit (int account) {
        balance = balance + account;
        System.out.println("현재 계좌는: " + balance + "입니다.");
    }

    void withdraw (int account) {
        if (balance >= account) {
            balance = balance - account;
            System.out.println("현재 계좌는: " + balance + "입니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
            System.out.println("현재 계좌는: " + balance + "입니다.");
        }
    }
}
