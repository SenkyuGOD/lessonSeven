import java.util.Random;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfArray = createNum(sc);

        int[] x = new int[numberOfArray];
        int[] y = new int[x.length];

        initArrayWithRandom(x);
        initArrayWithRandom(y);

        int sum = sumElementsOfArray(x, y);
        int num = numOfArrayElements(x, y);

        result(sum, num);
    }

    public static int createNum(Scanner sc) {
        System.out.print("Введите кол-во элементов в массиве: ");
        int num = sc.nextInt();
        return num;
    }

    public static void initArrayWithRandom(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(40);
        }
    }

    public static int sumElementsOfArray(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i] && a[i] > 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int numOfArrayElements(int[] a, int[] b) {
        int num = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i] && a[i] > 0) {
                num++;
            }
        }
        return num;
    }

    public static void result(int a, int b) {
        System.out.println("Сумма элементов массива = " + a);
        System.out.println("Количество элементов массива = " + b);
    }
}
