package myclasses;

public class Account {

    private int balance = 5000;

    public String debit(int amt) {
        balance-=amt;
        return ("Amount " + amt + " Debited");
    }

    public String credit(int amt) {
        balance += amt;
        return ("Amount " + amt + " credited");
    }

    public int getBalance() {
        return balance;
    }

}
