package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	AtmOperations op = new AtmOperationsImpl();
    int accountNr = 123456;
    int accountPin= 4295;
    Scanner in = new Scanner(System.in);
    System.out.println("************Welcome to Fictional Bank*****************");
    System.out.println("Enter Account Number : ");
    int accNr = in.nextInt();
    System.out.println("Enter Pin: ");
    int accPin = in.nextInt();
    if ((accNr == accountNr) && (accPin == accountPin )){
         while (true){
             System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
             System.out.println("Enter Choice: ");

             int ch = in.nextInt();
             if (ch == 1){
                 op.viewBalance();
             }
             else if (ch == 2){
                 System.out.println("Enter amount to withdraw");
                 double wdrAmt = in.nextDouble();
                  op.withdrawAmount(wdrAmt);
             }
             else if (ch==3){
                 System.out.println("Enter Amount to Deposit: ");
                 double dpAmt = in.nextDouble();
                 op.depositAmount(dpAmt);
             }

             else if(ch == 4){
                 op.viewMiniStatement();
             }
             else if (ch == 5){
                 System.out.println("Make sure you collect your ATM Card before leaving The Bank");
                 System.exit(0);
             }
             else{
                 System.out.println("Please enter correct choice");
             }
         }
    }
    else{
        System.out.println("Incorrect Account Number or Pin");
        System.exit(0);
    }


    }
}
