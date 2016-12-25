/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

/**
 *
 * @author asher.ansari
 */
abstract class abstractClass {

    public static String accountNumber = null;
    public static String accountName = null;
    public static int acountPosition = 0;
    public static String address = null;
    public static double balacnce = 0.0;

    public abstractClass() {
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBalacnce(double balacnce) {
        this.balacnce = balacnce;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAddress() {
        return address;
    }

    public double getBalacnce() {
        return balacnce;
    }

    abstract double getInterest(double amount);

    public void setAcountPosition(int acountPosition) {
        this.acountPosition = acountPosition;
    }

    public static int getAcountPosition() {
        return acountPosition;
    }

}


