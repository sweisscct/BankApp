/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author Lecturer
 * repo at:
 * sweisscct/BankApp
 */
public class CurrentAccount extends BankAccount implements Overdraft{
    @Override
    public boolean chargeInterest() {
        return true;
    };
}
