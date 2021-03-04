import myclasses.Account;
import myclasses.Computer;

public class Main {

    public static void main(String[] args) {

        // System.out.println("Hello Java!!");
        
        // AnotherClass obj = new AnotherClass();
        // obj.randomMethod();

        // Computer cp = new Computer();

        // cp.setRam(16);

        // int ram = cp.getRam();
        // System.out.println(ram);

        Account acc1 = new Account();

        System.out.println(acc1.getBalance());
        acc1.debit(2300);
        System.out.println(acc1.getBalance());


        Account acc2 = new Account();
        System.out.println(acc2.getBalance());
    }

}

class AnotherClass {

    public void randomMethod() {
        System.out.println("Random Method called!!");
    }

}