public class Animal implements Organism {
    @Override
    public void grow() {
        System.out.println("Animal class, Animal is growing.");
    }

    @Override
    public void metabolize() {
        System.out.println("Animal class, Animal is metabolizing.");
    }

    protected void move() {
        System.out.println("Animal class, Animal is moving.");
    }

    protected void sleep() {
        System.out.println("Animal class, Animal is sleeping.");
    }
}
