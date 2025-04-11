public class Planet {
private String name;
private double relativeGravity;


public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getRelativeGravity() {
    return relativeGravity;
}
public void setRelativeGravity(double relativeGravity) {
    this.relativeGravity = relativeGravity;
}

public void printInfo(){
System.out.println("This planet's name is "+name);
System.out.println("it’s relative gravity is "+relativeGravity);
}


}
