package groupII;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
public class Menu extends Accounting {
    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$' ###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {
                data.put(191103031, 214);
                data.put(191103025, 199);
                data.put(191103026, 201);
                data.put(191103048, 281);
                data.put(191103043, 257);
                data.put(191103052, 304);
                System.out.println("Welcome to Atm Project");
                System.out.println("Enter your customer account number");
                setCustomerNumber(sc.nextInt());
                System.out.println("Enter your pin number");
                setPinNumber(sc.nextInt());
            } catch (Exception e) {
                System.out.println("Invalid Entry. Please Enter Numbers only");
                x = 2;
            }
            for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
                    getAccountType();
                }
            }
            System.out.println("Wrong Account Number or wrong pin Number");
        } while (x == 1);
    }
    public void getAccountType() {
        System.out.println("Select the Account you want to access");
        System.out.println("Type 1 - Current Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");

        int selection = sc.nextInt();
        switch(selection) {
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("ThankYou for Using this Atm bye");
                break;
            default:
                System.out.println("Invalid choice.");
                getAccountType();
        }
    }

    public void getChecking() {
        System.out.println("Current Account");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw amount");
        System.out.println("Type 3 - Deposit Amount");
        System.out.println("Type 4 - Exit");

        int selection = sc.nextInt();

        switch(selection) {
            case  1:
                System.out.println("Checking account balance " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("ThankYou for using this atm");
            default:
                System.out.println("Invalid choice");
                getChecking();
        }

    }

    public void getSaving() {
        System.out.println("Checking Account");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw amount");
        System.out.println("Type 3 - Deposit Amount");
        System.out.println("Type 4 - Exit");

        int selection = sc.nextInt();

        switch(selection) {
            case  1:
                System.out.println("Saving account balance " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("ThankYou for using this atm");
            default:
                System.out.println("Invalid choice");
                getSaving();
        }

    }

}
