public class WeightCalculator {

    private int earthWeight;

    public void setEarthWeight(int earthWeight) {
        this.earthWeight = earthWeight;
    }
    public int getEarthWeight() {
        return earthWeight;
    }


    private Planet planet;

    public Planet getPlanet() {
        return planet;
    }
    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public boolean isHeavier (double relativeGravity,int earthWeight){
        return (relativeGravity * earthWeight) > earthWeight ? true : false;
    }
    
    public void printInfo(Planet name){
        System.out.println("The weight on earth is "+earthWeight);
        System.out.println("Another planet: ");
        planet.printInfo();
        System.out.println(earthWeight +" would weigh "+ earthWeight *name.getRelativeGravity()  +" on "+ name.getName());
    }

    // your code goes here

    public static void main(String[] args) throws Exception {
        System.out.println("Lets look at weights on different planets!");

        WeightCalculator weightCalculator = new WeightCalculator();

        Planet mars = new Planet();
        Planet jupiter = new Planet();
        mars.setName("Mars");
        jupiter.setName("Jupiter");
        mars.setRelativeGravity(0.39);
        jupiter.setRelativeGravity(2.4);

        weightCalculator.setEarthWeight(100);

        weightCalculator.setPlanet(mars);
        weightCalculator.printInfo(mars);
        System.out.printf("On this planet weight is%sheavier\n", weightCalculator.isHeavier(mars.getRelativeGravity(),weightCalculator.getEarthWeight()) ? " " : " not ");

        weightCalculator.setPlanet(jupiter);
        weightCalculator.printInfo(jupiter);
        System.out.printf("On this planet weight is%sheavier\n", weightCalculator.isHeavier(jupiter.getRelativeGravity(), weightCalculator.getEarthWeight()) ? " " : " not ");
    }

    
}
