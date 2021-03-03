public class Main {

    public static void main(String[] args) {

        System.out.println("Hello Java!!");
        
        AnotherClass obj = new AnotherClass();
        obj.randomMethod();

        Computer cp = new Computer();

        cp.setRam(16);

        int ram = cp.getRam();
        System.out.println(ram);

    }

}

class AnotherClass {

    public void randomMethod() {
        System.out.println("Random Method called!!");
    }

}