public class MultiThreading{

    public static void main(String[] args) {
        
    Thread thread1 = new MyClass();
    thread1.start();

    Thread thread2 = new MyClass();
    thread2.start();

    Thread thread3i = new Thread(new MyClass2());
    thread3i.start();

    }
}

class MyClass extends Thread{

    @Override
    public void run() {
        System.out.println("Thread created!");
    }

}

class MyClass2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread created with interface");
        
    }



}