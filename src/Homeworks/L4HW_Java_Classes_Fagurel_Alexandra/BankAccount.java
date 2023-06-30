package Homeworks.L4HW_Java_Classes_Fagurel_Alexandra;

public class BankAccount {
    private final int accountNumber;
    double balance;

    BankAccount(String accountNumber){
        if(isValidAccountNumber(accountNumber)) {
            this.accountNumber = Integer.parseInt(accountNumber);
        } else this.accountNumber = Integer.parseInt("000000000000");
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    private boolean isValidAccountNumber(String accountNumber){
        return false;
    }
    double replenishmentAccount(double a){
        return balance = balance + a;
    }
    double cashWithdrawal(double b){
        return balance = balance - b;
    }
}
