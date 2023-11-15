import java.util.Random;
import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = createNum(sc);
        double[] a = new double[num];
        double[] b = new double[a.length];

        initArrayWithRandom(a);
        initArrayWithRandom(b);

        double[] t = createDivisionOfArray(a, b);

        showArrayT(t);
    }

    public static int createNum(Scanner sc) {
        System.out.print("Введите кол-во элементов в массиве: ");
        int a = sc.nextInt();
        return a;
    }

    public static void initArrayWithRandom(double[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt();
        }
    }

    public static double[] createDivisionOfArray(double[] a, double[] b) {
        double[] t = new double[a.length];

        for (int i = 0; i < t.length; i++) {
            if (i < 2) {
                t[i] = a[i] / b[i];
            } else {
                t[i] = Math.pow(a[i] / b[i], 1.0 / i);
            }
        }
        return t;
    }

    public static void showArrayT(double[] arr) {
        for (double i: arr){
            System.out.printf("%2.2f ",i);
        }
    }
}
