package learnpolymorphism.Week4.day1;



public class MethodOverriding {
    public void takeSnap() {
        System.out.println("Snapshot taken");
    }

    public void reportStep() {
        System.out.println();
    }
}

class Overridingsubclass extends MethodOverriding {
    public void takeSnap() {
        System.out.println("Snapshot Inprogress");
    }

    public static void main(String[] args) {
        Overridingsubclass options = new Overridingsubclass();
        options.takeSnap();
    }
}
