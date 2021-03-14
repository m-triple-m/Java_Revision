public class MultiThreading{

    public static void main(String[] args) {
        
    Thread thread1 = new MyClass();
    thread1.start();
    thread1.setName("my thread 1");
    System.out.println(thread1.getId());
    System.out.println(thread1.getName());
    


    Thread thread2 = new MyClass();
    thread2.start();
    System.out.println(thread2.getId());

    Thread thread3i = new Thread(new MyClass2());
    thread3i.start();
    System.out.println(thread3i.getId());
    


    }
}

class MyClass extends Thread{

    @Override
    public void run() {
        System.out.println("Thread created!");

        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

class MyClass2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread created with interface");
        
    }

}