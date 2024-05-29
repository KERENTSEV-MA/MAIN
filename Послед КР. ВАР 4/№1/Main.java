
public class Main
{
    public static void main(String[] args) {

        nod nodFunction = (a, b) -> {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        };
        int ex1 = 52;
        int ex2 = 40;
        int NOD = nodFunction.calculate(ex1, ex2);
        System.out.println("NOD of " + ex1 + "and" + ex2 + "=" + NOD);
    }
}
