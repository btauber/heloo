package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank{

    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Account> account = new ArrayList<Account>();

    public static void addAccount() {
        System.out.println("For checking type c for Savings type s");
        String type = scanner.nextLine();
        System.out.println("Enter costumers name");
        String nameToAdd = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("Enter deposit amount");
        double depositAmount = scanner.nextDouble();
        if (type.equalsIgnoreCase("c")) {
            Checking checking = new Checking(nameToAdd, depositAmount);
            account.add(checking);
        } else {
            Savings savings = new Savings(nameToAdd, depositAmount);
            account.add(savings);
        }
    }

    public static Account searchAccount() {
        //scanner.nextLine();
        System.out.println("Enter account number(Name)");
        String custName = scanner.nextLine();
        for (Account costumer : account) {
            if (costumer.name.equalsIgnoreCase(custName)) {

            }
            return costumer;
        }
        System.out.println("customer name not matching database");
        return null;

    }

    public static void main(String[] args) {
        for (;;) {
         
            System.out.println("Welcome to PCS bank \n to add a customer type a \n to add or deduct from an account type b \n to add end of month charge type c \n to get the balance type d \n To print a recipt type e");
            String input = scanner.nextLine();
            switch (input) {
                case "a":
                    addAccount();
                    break;
                case "b":
                    Account a = searchAccount();
                    System.out.println("For deposit type 1 \n For Debit type 2");
                    String type = scanner.nextLine();
                    System.out.println("Enter amount");
                    double theAmount = scanner.nextDouble();
                    if (type.equalsIgnoreCase("1")) {
                        a.addTransaction(theAmount, "pos");
                    } else {
                        a.addTransaction(theAmount, "neg");
                    }
                    break;
                case "c":
                    Account b = searchAccount();
                    b.endOfMonth();
                    break;
                case "d":
                    Account c = searchAccount();
                    System.out.println(c.getBalance());
                    break;
                case "e":
                    Printable d = (Printable) searchAccount();
                    
                    d.print(d);

            }
        }
    }

}
