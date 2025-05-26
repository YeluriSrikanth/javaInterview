package coreJava;

import java.util.Scanner;

public class BankAcct {
    private double bal;

    BankAcct(double bal) {
        this.bal = bal;
    }

    void contact(double r) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter password   ");
        String pwd = sc.next();
        if (pwd.equals("sri")) {
            Interest in = new Interest(r);
            in.calculateInterest();

        } else {
            System.out.println("Password not match");
            return;
        }


    }


    private class Interest {
        private double rate;

        Interest(double r) {
            rate = r;
        }

        void calculateInterest() {
            System.out.println("Caluculated interest.");
        }


    }
}

class innerClass {
    public static void main(String[] args) {
        BankAcct acct = new BankAcct(1000);
        acct.contact(9.5);
    }
}

