import java.io.Console;

import myclasses.Account;
import myclasses.Computer;
import myclasses.Player;

public class Main {

    public static void main(String[] args) {

        // System.out.println("Hello Java!!");

        // AnotherClass obj = new AnotherClass();
        // obj.randomMethod();

        // Computer cp = new Computer();

        // cp.setRam(16);

        // int ram = cp.getRam();
        // System.out.println(ram);

        // Account acc1 = new Account(6000, "MMM");

        // System.out.println(acc1.getBalance());
        // System.out.println(acc1.debit(2300));
        // System.out.println(acc1.getBalance());
        // acc1.setInterest(5.7f);
        // System.out.println("Total amt : "+acc1.getTotalAmt(10));

        // Account acc2 = new Account(1500, "Leon S Kennedy");
        // System.out.println(acc2.getBalance());
        // System.out.println(acc2.credit(500));
        // System.out.println(acc2.getBalance());
        // System.out.println(acc2.getDetails());
        // acc2.setInterest(2.7f);
        // System.out.println("Total amt : "+acc2.getTotalAmt(20));


        // Account acc3 = new Account();
        // System.out.println(acc3.getBalance());

        Player leon = new Player();
        
        leon.jump(10);
    }

}

class AnotherClass {

    public void randomMethod() {
        System.out.println("Random Method called!!");
    }

}