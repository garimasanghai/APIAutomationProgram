package Abstraction;

public class lab_084Demo3 {
    public static void main(String[] args) {
        Child c  = new Child();
        c.loan50k();
        c.load25K();
    }
}

class Child extends Father{

    @Override
    public void loan50k() {
        System.out.println("Child is giving the 50K loan");
    }
}

abstract class Father{
    abstract void loan50k();
    void load25K(){
        System.out.println("Done by Father!!");
    }

}

