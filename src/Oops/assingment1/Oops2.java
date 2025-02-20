package Oops.assingment1;

public class Oops2 {
    public static void main(String[] args) {
        Account a1 = new Account(12123,"parth",10000,5);
        a1.calculateInterest();
        a1.displayAccountDetails();
    }
}
class Account {
    private int accno;
    private String custname;
    private int bal;
    private int intrestrate;

    public void calculateInterest() {
        int totalbal = bal + (bal * intrestrate) / 100;
        System.out.println(totalbal);
    }

    Account(int accno,String custname,int bal,int interestrate) {
        this.accno=accno;
        this.custname=custname;
        this.bal=bal;
        this.intrestrate=interestrate;
    }
    public void displayAccountDetails() {
        System.out.println(accno + " ," + custname + " ," + bal + " ," + intrestrate);
    }

}
