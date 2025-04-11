package assignments;

public class IHaveABug {

    public static int addSevenAndSix(){
        int seven = 4 + 3;
        int six = 6;

        return six + seven;

    }

    public static void main(String[] args) {
        System.out.println(addSevenAndSix());

    }
}
