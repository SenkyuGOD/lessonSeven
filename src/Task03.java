import java.util.Scanner;
import java.util.Random;

public class Task03 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int n = random.nextInt(10);

        int[] x = new int[n];
        int[] z = new int[n];

        initArrayWithRandom(x);
        initArrayWithRandom(z);

        int a = initNum(sc);
        int b = initNum(sc);
        int c = initNum(sc);
        int d = initNum(sc);

        System.out.println("Элементы которые хранятся в Y");

        resultY(x, z, a, b, c, d);

    }


    public static void initArrayWithRandom(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt();
        }
    }

    public static int initNum(Scanner sc) {
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        return a;
    }

    public static void resultY(int[] x, int[] z, int a, int b, int c, int d) {
        double[] y = new double[x.length];

        for (int i = 0; i < x.length; i++) {
            y[i] = (a * x[i] + b) / (c * z[i] + d);
        }

        conclusion(y);
    }

    public static void conclusion(double[] a) {
        for (double i : a) {
            System.out.print(i + " ");
        }
    }
}
