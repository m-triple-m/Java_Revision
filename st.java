public class st {

    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("Boom");
        System.out.println(st);
        st.append("ds");
        System.out.println(st);

        System.out.println(st.toString().equals("Boomds"));

        MT nt = new MT();
        Thread t1 = new Thread(nt);
        t1.start();

        Thread t2 = new MT2();
        Thread t3 = new MT2();
        Thread t4 = new MT2();
        t2.start();
        t3.start();
        t4.start();
        System.out.println(t2);
    }
}


class MT implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread created!!");
    }

    
    
} 

class MT2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread created with class!");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}

// StringBuffer
// append()

// charAt()
// IndexOf()
// startsWith()
// contains()
// length()
// replaceAll()
// replaceFirst()
// toLowerCase()
// toUpperCase()
