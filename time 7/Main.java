import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args) {
        try {
            Time time = new Time(5, 12, 15);
            System.out.println(time);
            time.setTime(7,14,10);
            time.addHours(2);
            System.out.println(time.toString());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
