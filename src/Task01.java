import java.util.Scanner;
import java.util.Random;

public class Task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int size = 5;
        double[] x = new double[size];
        double[] y = new double[x.length];

        if (x.length != y.length) {
            System.out.println("Расмер массивов не совпадает.");
            return;
        }

        for (int i = 0; i < x.length; i++) {
            x[i] = random.nextInt(40);
        }

        printArray(x);

        createY(x, y);

        printArray(y);
    }

    //////////////////////////////////////////////////////////////////////
    public static void createY(double[] x, double[] y) {
        for (int i = 0; i < y.length; i++) {
            y[i] = division(x[i], i);
        }
    }

    //////////////////////////////////////////////////////////////////////

    public static double division(double a, double b) {
        double division = a / b;
        return division;
    }

    /////////////////////////////////////////////////////////////////////
    public static void printArray(double[] mas) {
        for (double i: mas) {
            System.out.printf("[%.2f] ", i);
        }
        System.out.println();
    }
}
