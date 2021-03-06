package myclasses;

public class Account {

    private int balance;
    private String holder_name;
    private float interest;

    public Account(int balance, String name) {
        this.balance = balance;
        this.holder_name = name;
    }

    public Account(){

    }

    public float getTotalAmt(int time) {
        float amt = (balance * interest * time) / 100;
        return amt+balance;
    }

    public void setInterest(float intrst) {
        interest = intrst;
    }

    public void setInterest(int intrst) {
        interest = intrst;
    }

    public String debit(int amt) {
        balance -= amt;
        return ("Amount " + amt + " Debited");
    }

    public String credit(int amt) {
        balance += amt;
        return ("Amount " + amt + " credited");
    }

    public int getBalance() {
        return balance;
    }

    public String getDetails() {
        return (" Account Holder's name : " + holder_name + "\n Balance : " + balance);
    }

}
