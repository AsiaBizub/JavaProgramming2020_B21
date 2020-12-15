package day41_Encapsulation;

public class BankAccount {

    public final static String bankName = "Bank of America";

    public String firstName, lastName;

    private String accountHolder;
    private int accountNumber;
    private double balance;



    public String getAccountHolder() {
        return accountHolder;
    }

    public String getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;

    }

    public void setAccountHolder (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        accountHolder = firstName.toUpperCase()+" "+lastName.toUpperCase();

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
