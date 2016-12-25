/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package bank.management;

import java.util.Scanner;

/**
 *
 * @author asher.ansari
 */
public class BankManagement {

    /**
     * @param args the command line arguments
     */
    public static void newAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t\tPlease Enter The Following Details..");
        System.out.println("please Enter Your Name: ");
        abstractClass.accountName = sc.nextLine();
        System.out.println("Please Enter Your Parmenet Address:");
        abstractClass.address = sc.nextLine();
        System.out.println("Please Enter your Balance: ");
        abstractClass.balacnce = sc.nextInt();
        System.out.println("\nPlease Identify Your Office Position\npress 1 for Labour, Press 2 for Manager, Press 3 for General Manager and Press 4 for Managing Director..");
        abstractClass.acountPosition = sc.nextInt();
        System.out.println("Account Has Been Created...");

    }

    public static void widrawl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome To Widrawl Menu..");
        System.out.println("\nplease Enter How Many Rs. YOu Want to Widrawl..");
        double rs = sc.nextInt();
        if (rs > abstractClass.balacnce) {
            System.out.println("Sorry, Amount is not Avaiable...");
        } else {
            abstractClass.balacnce = abstractClass.balacnce - rs;
            System.out.println("Amount has been widrawl...");
        }

    }

    public static void transferMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Transfer Money Menu...");
        System.out.println("Please Enter The Account Number: ");
        String accountNum = sc.nextLine();
        System.out.println("Please Enter The Amount To Be Transfer...");
        int rs = sc.nextInt();
        if (rs > abstractClass.balacnce) {
            System.out.println("Amount is Not Available..");
        } else {
            abstractClass.balacnce = abstractClass.balacnce - rs;
            System.out.println("Amount Has Been Transfer Sucessfully on this Account: " + accountNum);
        }
    }

    public static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Deposit Menu..");
        System.out.println("Please Enter Your Deposit Amount..");
        int rs = sc.nextInt();
        abstractClass.balacnce = abstractClass.balacnce + rs;
        System.out.println("Amount Has been Deposited Sucessfully..");
    }

    public static void interset() {
        System.out.println("Welcome TO The Interest menu...");
//        System.out.println("Your Position is :"+abstractClass.acountPosition);
        String position = null;
        double inteset = 0.0;
        switch (abstractClass.acountPosition) {
            case 1:
                position = "labour";
                labour labour = new labour();
                inteset = labour.getInterest(abstractClass.balacnce);
                break;
            case 2:
                position = "Manager";
                manager manager = new manager();
                inteset = manager.getInterest(abstractClass.balacnce);
                break;
            case 3:
                position = "General Manager";
                GeneralManger gm = new GeneralManger();
                inteset = gm.getInterest(abstractClass.balacnce);
                break;
            default:
                position = "Managing Director";
                md md1 = new md();
                inteset = md1.getInterest(abstractClass.balacnce);
                break;
        }
        System.out.println("Your Position is :" + position + " and Interest Will be: " + inteset);

//          System.out.println("your Interest will be: ");
        abstractClass.balacnce = abstractClass.balacnce - inteset;
        System.out.println("Your Interest has Been Detected...");
    }

    public static void accountInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAccount Name = " + abstractClass.accountName);
        System.out.println("\nYour Total Amount = " + abstractClass.balacnce);
        System.out.println("\nSelect 1 to Widrawl, 2 for Transfer Money, press 3 for Deposit Money, Press 4 for Interest..");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                widrawl();
                break;
            case 2:
                transferMoney();
                break;
            case 3:
                deposit();
                break;
            default:
                interset();
                break;
        }
    }

    public static void signout() {
        abstractClass.accountName = null;
        abstractClass.accountNumber = null;
        abstractClass.acountPosition = 0;
        abstractClass.address = null;
        abstractClass.balacnce = 0.0;
        System.out.println("\nSignout Sucessfully...");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Bank Management System...!!");

        boolean check = true;
        while (check) {
            System.out.println("\nCreate Account Press 1\nAccount Data Solutions Press 2\nTo Sig Out Press 3\nTo Exit Press 4");
            int userChoice = sc.nextInt();
            switch (userChoice) {
                case 1:
                    if (abstractClass.accountName == null) {
                        newAccount();
                        check = true;
                    } else {
                        System.out.println("\nAccount Already Exists");
                    }
                    break;
                case 2:
                    if (abstractClass.accountName == null) {
                        System.out.println("n Not Exists Exists");
                    } else {
                        accountInfo();
                    }
                    break;
                case 3:
                    if (abstractClass.accountName == null) {
                        System.out.println("User Not Found...");
                    } else {
                        signout();
                    }
                    break;
                default:
                    System.out.println("Are you sure you want to Exit??  Press 1 to Exit..");
                    int user = sc.nextInt();
                    if (user == 1) {
                        check = false;
                    } else {
                        check = true;
                    }

                    break;

            }

        }

    }

}
