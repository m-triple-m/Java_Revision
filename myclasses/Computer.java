package myclasses;


public class Computer {

    private int ram;
    private int hdd;
    private int ssd;
    private String processor;

    public Computer(int ram , int hdd, int ssd, String processor){
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
        this.processor = processor;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public int getRam() {
        return this.ram;
    }


    public static void main(String[] args) {
        Laptop lap = new Laptop(16, 2, 500, "3.5 Ghz");
        

        System.out.println(lap.getRam()+" GB");
    }

}


class Laptop extends Computer {

    public Laptop(int ram, int hdd, int ssd, String processor){
        super(ram, hdd, ssd, processor);
    }

}