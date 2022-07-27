package pl.sda.arppl4.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        String bankAccountNumber = bank.createAccount();
        System.out.println("Created bank with account number: " + bankAccountNumber);

        bank.transferIn(1000, bankAccountNumber);
        bank.transferOut(1200, bankAccountNumber);
    }
}
