package pl.sda.arppl4.bank;

import java.util.UUID;

public class BankAccount {

    private String accountNumber;
    private double state;

    public BankAccount() {
        this.state = 0d;
        this.accountNumber = UUID.randomUUID().toString();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getState() {
        return state;
    }

    // lock, mutex, synchronizer, semaphore


    private final Object lock = new Object();

    public void transferIn(double amount) {
        System.out.println("Jestem przed lockiem");
        synchronized (lock) {
            System.out.println("Uzyskałem lock");
            this.state = this.state + amount;
            System.out.println("Opuszczam lock");
        }
        System.out.println("Zwolniłem lock");
    }

    public void transferOut(double amount) {
        System.out.println("Jestem przed lockiem");
        synchronized (lock) {
            System.out.println("Uzyskałem lock");
            this.state = this.state - amount;
            System.out.println("Opuszczam lock");
        }
        System.out.println("Zwolniłem lock");
    }

//    public synchronized void transferIn(double amount) {
//        this.state = this.state + amount;
//    }
//
//    public synchronized void transferOut(double amount) {
//        this.state = this.state - amount;
//    }
}
