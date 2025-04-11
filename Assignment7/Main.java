public class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        Alpaca al = new Alpaca();
        Camelid al2 = (Camelid) al;
        Camelid notAl = new Camelid();

        System.out.println("Calling grow() methods:");
        animal.grow();
        al.grow();
        al2.grow();
        notAl.grow();

        System.out.println("\nCalling metabolize() methods:");
        animal.metabolize();
        al.metabolize();
        al2.metabolize();
        notAl.metabolize();

        System.out.println("\nCalling move() methods:");
        animal.move();
        al.move();
        al2.move();
        notAl.move();

        System.out.println("\nCalling sleep() methods:");
        animal.sleep();
        al.sleep();
        al2.sleep();
        notAl.sleep();

       
        System.out.println("Calling isShearable() on 'al': " + al.isShearable());



    }
}
