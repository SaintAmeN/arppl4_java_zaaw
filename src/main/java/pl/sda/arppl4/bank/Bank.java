package pl.sda.arppl4.bank;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    // Callbacks
    private final ExecutorService pulaWatkow = Executors.newFixedThreadPool(5);

    private Map<String, BankAccount> bankAccounts = new HashMap<>();
//    private List<BankTransfer> bankTransfers = new ArrayList<>();

    public void transferIn(final double amount, final String accountNumber) {
//        final BankTransfer transfer = new BankTransfer(amount, accountNumber, TransferDirection.INCOMING);
//        bankTransfers.add(transfer);

        pulaWatkow.submit(() -> {
            BankAccount account = bankAccounts.get(accountNumber);
            account.transferIn(amount);
        });
    }

    public void transferOut(double amount, String accountNumber) {
//        BankTransfer transfer = new BankTransfer(amount, accountNumber, TransferDirection.OUTGOING);
//        bankTransfers.add(transfer);

        pulaWatkow.submit(() -> {
            BankAccount account = bankAccounts.get(accountNumber);
            account.transferOut(amount);
        });
    }

    public void checkAccountState(String accountNumber) {
        BankAccount account = bankAccounts.get(accountNumber);
        System.out.println(account.getState());
    }

    public String createAccount() {
//        String generatedBankAccountNumber = UUID.randomUUID().toString();
//        BankAccount bankAccount = new BankAccount(generatedBankAccountNumber);

        BankAccount bankAccount = new BankAccount();
        bankAccounts.put(bankAccount.getAccountNumber(), bankAccount);
        return bankAccount.getAccountNumber();
    }
}
