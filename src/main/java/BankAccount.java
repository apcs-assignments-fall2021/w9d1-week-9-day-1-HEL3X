import java.util.*;
public class BankAccount {
    // Instance variables
    private int balance = 1000;
    private int accountNumber = 1019401124;
    private String preferredName = " ";

    public void withdraw(int x){
        this.balance -= x;
    }
    public void deposit(int x){
        this.balance += x;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public void setPreferredName(String preferredNameChange){
        preferredName = preferredNameChange;
    }
    public String getPreferredName(){
        return preferredName;
    }
}