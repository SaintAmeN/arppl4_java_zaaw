package pl.sda.arppl4.bank;

public class BankTransfer {
    private double amount;
    private String accountNumber;
    private TransferDirection direction;

    public BankTransfer(double amount, String accountNumber, TransferDirection direction) {
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.direction = direction;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public TransferDirection getDirection() {
        return direction;
    }

    public void setDirection(TransferDirection direction) {
        this.direction = direction;
    }
}
