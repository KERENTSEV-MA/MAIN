import java.util.*;

public class Main {               //Задание №3
    public static void main(String[] args) {
        try {
            ArithmProgression arithmProgression = new ArithmProgression(1,2);
            System.out.println(arithmProgression.calculateSum(5));
            GeometrProgression geometrProgression = new GeometrProgression(1,2);
            System.out.println(geometrProgression.calculateSum(3));
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}


