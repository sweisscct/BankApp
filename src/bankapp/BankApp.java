/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankapp;

/**
 *
 * @author Sam Weiss
 * @email sweiss@cct.ie
 */
public class BankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(10001, "Current Account", 1, 0, "Current Account", false);
        System.out.println(acc1);
        System.out.println(Withdraw(10, acc1));
        System.out.println(acc1);
        
        BankAccount acc2 = new BankAccount(10002, "Current Account", 2, 100, "Current Account", false);
        System.out.println(acc2);
        System.out.println(Withdraw(10, acc2));
        System.out.println(acc2);        
    }
    
    public static boolean Withdraw(double amount, BankAccount account) {
        
        if (account.balance >= amount) {
            account.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
}
