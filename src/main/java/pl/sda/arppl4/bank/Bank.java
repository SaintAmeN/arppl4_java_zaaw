package pl.sda.arppl4.bank;

import java.util.*;

public class Bank {
    private Map<String, BankAccount> bankAccounts = new HashMap<>();
    private List<BankTransfer> bankTransfers = new ArrayList<>();

    public void transferIn(double amount, String accountNumber) {
        BankTransfer transfer = new BankTransfer(amount, accountNumber, TransferDirection.INCOMING);
        bankTransfers.add(transfer);
    }

    public void transferOut(double amount, String accountNumber) {
        BankTransfer transfer = new BankTransfer(amount, accountNumber, TransferDirection.OUTGOING);
        bankTransfers.add(transfer);
    }

    public String createAccount(){
//        String generatedBankAccountNumber = UUID.randomUUID().toString();
//        BankAccount bankAccount = new BankAccount(generatedBankAccountNumber);

        BankAccount bankAccount = new BankAccount();
        bankAccounts.put(bankAccount.getAccountNumber(), bankAccount);
        return bankAccount.getAccountNumber();
    }
}
