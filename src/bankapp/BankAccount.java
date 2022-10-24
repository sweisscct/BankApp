/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author Lecturer
 */
public class BankAccount {
    int accountNumber;
    String accountName;
    int customerID;
    double balance;
    String accountType;
    boolean canOverdraw;

    public BankAccount(int accountNumber, String accountName, int customerID, double balance, String accountType, boolean canOverdraw) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.customerID = customerID;
        this.balance = balance;
        this.accountType = accountType;
        this.canOverdraw = canOverdraw;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", accountName=" + accountName + ", customerID=" + customerID + ", balance=" + balance + ", accountType=" + accountType + ", canOverdraw=" + canOverdraw + '}';
    }
    
    
    
}
