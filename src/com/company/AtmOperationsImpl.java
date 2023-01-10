package com.company;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationsImpl implements AtmOperations{
    ATM atm = new ATM();
    Map<Double, String> ministmt= new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Availaible Balance is:" + atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
         if (withdrawAmount%10==0){
             if (withdrawAmount <= atm.getBalance()){
                 ministmt.put(withdrawAmount, "Amount Withdrawn");
                 System.out.println("************Machine is processing your demand*******");
                 System.out.println("Withdrawal was appproved and The amount of "+ withdrawAmount + "was withdrawed");
                 atm.setBalance(atm.getBalance() - withdrawAmount);
                 viewBalance();
             } else{
                 System.out.println("Insufficient Amount !!");
             }
         }else{
             System.out.println("Withdraw of this amount impossible");
         }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount, "Amount Deposited");
        System.out.println(depositAmount + "deposited successfully  !!");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();

    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
