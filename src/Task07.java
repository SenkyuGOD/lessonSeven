import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Task07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfArray = createNum(sc);
        int[] x = new int[numberOfArray];

        initArrayWithRandom(x);

        int[] y = new int[x.length];
        y = copyArray(x);

        reverseSortArray(y);

        showArray("X", x);
        showArray("Y", y);

    }

    public static int createNum(Scanner sc) {
        System.out.print("Введите кол-во элементов в массиве: ");
        int num = sc.nextInt();
        return num;
    }

    public static void initArrayWithRandom(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(20);
        }
    }

    public static int[] copyArray(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                b[i] = a[i];
            }
        }
        return b;
    }

    public static int[] reverseSortArray(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    public static void showArray(String a, int[] b) {
        System.out.println();
        System.out.println("Массив " + a);
        for (int i: b){
            System.out.print(i + " ");
        }
    }
}
