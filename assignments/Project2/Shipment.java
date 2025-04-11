import java.util.Scanner;

public class Shipment {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Ozlem Ozduman’s shipping calculator");
        
        // Input first package
        System.out.println("Enter details for the first package:");
        Package package1 = new Package();
        package1.inputLength();
        package1.inputWidth();
        package1.inputHeight();
        
        // Input second package
        System.out.println("Enter details for the second package:");
        Package package2 = new Package();
        package2.inputLength();
        package2.inputWidth();
        package2.inputHeight();
        double volume1 = package1.calcVolume();
        double volume2 = package2.calcVolume();
        System.out.println("First package dimensions: "+package1.displayDimensions()+", Volume = "+volume1);
        System.out.println("Second package dimensions: "+package2.displayDimensions()+", Volume = "+volume2);

        double cost1 = package1.calCost(volume1);
        double cost2 = package2.calCost(volume2);
        System.out.println("Package 1 will cost $" + cost1+" to ship.");
        System.out.println("Package 2 will cost $" + cost2+" to ship.");
        
    
        double ratio = cost1 / cost2;
        if (cost1 == cost2) {
            System.out.println("The costs are the same");
        } else if (ratio < 2 && ratio > 0.5) {
            System.out.println((cost1 > cost2) ? "The first package is slightly more than the second package" : "The second package is slightly more than the first package");
        } else if (ratio < 3 && ratio > 0.33) {
            System.out.println((cost1 > cost2) ? "The first package is twice the cost of the second package" : "The second package is twice the cost of the first package");
        } else if (ratio < 4 && ratio > 0.25) {
            System.out.println((cost1 > cost2) ? "The first package is triple the cost of the second package" : "The second package is triple the cost of the first package");
        } else if (ratio < 5 && ratio > 0.2) {
            System.out.println((cost1 > cost2) ? "The first package is quadruple the cost of the second package" : "The second package is quadruple the cost of the first package");
        } else {
            int multiple = (int) Math.round(ratio);
            System.out.println((cost1 > cost2) ? "The first package is " + multiple + "x more expensive than the second package" : "The second package is " + multiple + "x more expensive than the first package");
        }


}
}
