


public class Calculator {
    private int[] first;
    public int[] getFirst() {
        return first;
    }

    private int[] second;

    public Calculator(int[] first, int[] second) {
        this.first = first;
        this.second = second;
    }
    public Calculator(){
        this.first = new int[]{};
        this.second = new int[] {};

    }
    // add your code here
    public boolean inEither(int number){
        boolean isArrayFirst = false;
        boolean isArraySecond = false;
            for (int i : first) {
                if(i == number){
                    isArrayFirst =true;
                    break;
                }
        
            }

            for(int i : second){
                if(i == number){
                    isArraySecond = true;
                    break;
                }
                
            }
        return (isArrayFirst || isArraySecond);
    }

    public double average(){
        int sum = 0;
        int count = first.length+ second.length;
        for (int i = 0; i < first.length; i++) {
            sum = sum + first[i];
        }
        for (int i = 0; i < second.length; i++) {
            sum = sum +second[i];
        }
        return sum/count;
    }

    public void reverseFirst() {
        int len = first.length;

        for (int i = 0; i < len / 2; i++) {
            int temp = first[i];
            first[i] = first[len - 1 - i];
            first[len - 1 - i] = temp;
        }
    }

    public int largest(){
        int largest = first[0];
       
            for (int num : first) {
                if (num > largest) {
                    largest = num;
                }
            }
       
            for (int num : second) {
                if (num > largest) {
                    largest = num;
                }
            }
        return largest;

    }


    public int smallest(){
        int smallest = first[0];

      
            for (int num : first) {
                if (num < smallest) {
                    smallest = num;
                }
            }
       
       
            for (int num : second) {
                if (num < smallest) {
                    smallest = num;
                }
            }
       
        return smallest;

    }
    
}
