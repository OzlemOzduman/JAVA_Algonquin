public class Alpaca extends Camelid implements Shearable {

    @Override
    public boolean isShearable() {
        return true; // Alpacas are shearable
    }

    @Override
    public void move() {
        System.out.println("Alpaca class, Alpaca is gracefully moving.");
    }

    @Override
    public void sleep() {
        System.out.println("Alpaca class, Just one sleeping Alpaca.");
    }

    @Override
    public void grow() {
        System.out.println("Alpaca class, Alpaca is growing its soft fleece.");
    }

}
