/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

import java.util.Scanner;

class manager extends abstractClass {

    @Override
    double getInterest(double amount) {
        double managerInterest = (amount / 100) * 20;
        return managerInterest;
    }
}

class GeneralManger extends abstractClass {

    @Override
    double getInterest(double amount) {
        double generalMangerInterest = (amount / 100) * 22;
        return generalMangerInterest;
    }
}

class md extends abstractClass {

    @Override
    double getInterest(double amount) {
        double mdInterest = (amount / 100) * 30;
        return mdInterest;
    }

}

public class labour extends abstractClass {

    Scanner sc = new Scanner(System.in);

    @Override
    double getInterest(double amount) {
        double labourInterest = (amount / 100) * 10;
        return labourInterest;
    }

}
