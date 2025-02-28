package Oops.assingment1;

class Accounts {
    private int accno;
    private String custname;
    private int bal;

    public void setAccountDetails(int accno,String custname,int bal) {
        this.accno=accno;
        this.custname=custname;
        this.bal=bal;
    }
    public void withdraw(int amount) {
        bal = bal - amount;
        System.out.println("after withdrawal bal = " + bal);
    }

    public void deposit(int amount) {
        bal = bal + amount;
        System.out.println("after deposit bal = " + bal);
    }

    public void dispAccountDetails() {
        System.out.println(accno + " ," + custname + " ," + bal);
    }
}
public class Oops3 {
    public static void main(String[] args) {
        Accounts a1 = new Accounts();
        a1.setAccountDetails(123456,"parth",12000);
        a1.withdraw(2000);
        a1.deposit(3000);
        a1.dispAccountDetails();;
    }
}
