package groupII;

import java.util.*;
import java.text.DecimalFormat;
public class Accounting {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");

    public int setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public int setPinNumber(int PinNumber) {
        this.pinNumber = PinNumber;
        return PinNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }
    public double calcCheckingWithdraw(double amount) {
        checkingBalance = (checkingBalance - amount);
        return  checkingBalance;
    }
    public double calcSavingWithdraw(double amount) {
        savingBalance = (savingBalance - amount);
        return  savingBalance;
    }


    public double calcCheckingDeposit(double amount) {
        checkingBalance = (checkingBalance - amount);
        return  checkingBalance;
    }
    public double calcSavingDeposit(double amount) {
        savingBalance = (savingBalance - amount);
        return  savingBalance;
    }

    public void getCheckingWithdrawInput() {
        System.out.println("Checking Account balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking account");
//        double amount = sc.nextDouble();
        int amount = sc.nextInt();
        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New checking account balance " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void getSavingWithdrawInput() {
        System.out.println("Saving Account balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving account");
//        double amount = sc.nextDouble();
        int amount = sc.nextInt();
        if((savingBalance - amount) >= 0) {
            calcSavingWithdraw(amount);
            System.out.println("New checking account balance " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Insufficient");
        }
    }

    public void getCheckingDepositInput() {
        System.out.println("Checking Account balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from checking account");
        double amount = sc.nextDouble();
//        if((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New checking account balance " + moneyFormat.format(checkingBalance));
//        } else {
//            System.out.println("Balance can not be negative");
        //}
    }

    public void getSavingDepositInput() {
        System.out.println("Checking Account balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from saving account");
        double amount = sc.nextDouble();
//        if((savingBalance + amount) >= 0) {
            calcSavingDeposit(amount);
//            System.out.println("New checking account balance " + moneyFormat.format(savingBalance));
//        } else {
            System.out.println("Balance can not be negative");
        //}
    }
}
