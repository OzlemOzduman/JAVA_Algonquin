
import java.util.Scanner;

public class Package {
    private double length;
    private double width;
    private double height;
    private Scanner scanner;

    public Package() {
        this.length = 1.0;
        this.width = 1.0;
        this.height = 1.0;
        this.scanner = new Scanner(System.in);
    }

    public Package(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.scanner = new Scanner(System.in);
    }

    public void inputLength() {
        System.out.print("Enter length: ");
        this.length = scanner.nextDouble();
    }

    public void inputWidth() {
        System.out.print("Enter width: ");
        this.width = scanner.nextDouble();
    }

    public void inputHeight() {
        System.out.print("Enter height: ");
        this.height = scanner.nextDouble();
    }

    public String displayDimensions() {
        return length + " X " + width + " X " + height;
    }

    public double calcVolume() {
        return length * width * height;
    }

    public double calCost(double volume) {
        return 3 + Math.max(0, volume - 1);
    }

}
