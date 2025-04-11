import java.util.Arrays;

public class Main {
    
    private Calculator calc;

     public Calculator getCalculator() {
     return calc;
    }

    public void setCalc(Calculator calc) {
     this.calc = calc;
    }



    public static void main(String[] args) throws Exception {
        System.out.println("Some basic Calculations");
        int[] first = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] second = { 100, -5000, 17, 4 };
        Main m = new Main();
        m.setCalc(new Calculator(first, second));
      
        System.out.printf("InEither 17: %b\n", m.getCalculator().inEither(17));
        System.out.printf("Average: %f\n", m.getCalculator().average());
        System.out.println("ReverseFirst: ");
        System.out.println("Before");
        System.out.println(Arrays.toString(m.getCalculator().getFirst()));
        m.getCalculator().reverseFirst();
        System.out.println("After");
        System.out.println(Arrays.toString(m.getCalculator().getFirst()));
        System.out.printf("Largest: %d\n", m.getCalculator().largest());
        System.out.printf("Smallest: %d\n", m.getCalculator().smallest());
    }

}
