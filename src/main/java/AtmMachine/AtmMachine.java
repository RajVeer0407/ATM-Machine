package AtmMachine;
import java.util.*;

import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 1234;

    public void checkpin(){
        System.out.println("Enter Your PIN : ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();

        if (enteredpin == PIN){
            menu();
        }
        else {
            System.out.println("Enter a Valid Pin");
        }

    }

    public void menu(){
        System.out.println("Enter Your Choice : ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1){
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        }else {
            System.out.println("Enter a Valid Choice");
        }

    }
    public void checkBalance(){
        System.out.println("Available Balance:" + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to be Withdrawn :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            Balance = Balance-amount;
            System.out.println("Amount Withdrawn Succesfully !");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Amount Deposited Succesfully !");
        menu();
    }
}

public class AtmMachine {
    public static void main(String[] args){
        ATM obj = new ATM();
        obj.checkpin();

    }
}