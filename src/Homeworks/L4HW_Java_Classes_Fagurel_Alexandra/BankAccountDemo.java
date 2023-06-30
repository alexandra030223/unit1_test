package Homeworks.L4HW_Java_Classes_Fagurel_Alexandra;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount accountHolder1 = new BankAccount("abc");
        accountHolder1.balance = 1999.50;

        BankAccount accountHolder2 = new BankAccount("def");
        accountHolder2.balance = 130.85;

        double a = 200.00;
        accountHolder1.replenishmentAccount(a);
        System.out.println("Bank account of accountHolder1 was replenished with " + a + "." + "\nBalance account of accountHolder1 is " + accountHolder1.balance);

        double c = 351.70;
        accountHolder1.cashWithdrawal(c);
        System.out.println("From the bank account of accountHolder1 were withdrawn money in the amount of " + c + "." + "\nBalance account of accountHolder1 is " + accountHolder1.balance);
        System.out.println();

        System.out.println("Balance account of accountHolder1 is: " + accountHolder1.balance);
        System.out.println();


        double d = 862.90;
        accountHolder1.replenishmentAccount(d);
        System.out.println("Bank account of accountHolder2 was replenished with " + a + "." + "\nBalance account of accountHolder1 is " + accountHolder2.balance);

        double e = 400.03;
        accountHolder1.cashWithdrawal(e);
        System.out.println("From the bank account of accountHolder2 were withdrawn money in the amount of " + c + "." + "\nBalance account of accountHolder1 is " + accountHolder2.balance);
        System.out.println();

        System.out.println("Balance account of accountHolder2 is: " + accountHolder2.balance);
    }
}
