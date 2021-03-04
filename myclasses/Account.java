package myclasses;

public class Account {

    private int balance;
    private String holder_name;

    

    public Account(int balance, String name){
        this.balance = balance;
        this.holder_name = name;
    }

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

    public String getDetails(){
        return (" Account Holder's name : "+holder_name+"\n Balance : "+balance);
    }

}
