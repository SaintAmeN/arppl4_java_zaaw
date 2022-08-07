package pl.sda.arppl4.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        String bankAccountNumber = bank.createAccount();
        System.out.println("Created bank with account number: " + bankAccountNumber);

        for (int i = 0; i < 100000; i++) {
            bank.transferIn(5, bankAccountNumber);
            bank.transferOut(5, bankAccountNumber);
        }

        Scanner scanner = new Scanner(System.in);
        while (true){
            String word = scanner.nextLine();
            // ignorujemy word, bo chcemy tylko mieć możliwość
            // sprawdzenia stanu konta po kliknięciu enter.
            bank.checkAccountState(bankAccountNumber);
        }
    }
}
