import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Неверный ввод. Введите первое  значение: ");
        }
        x = sc.nextDouble();
        System.out.print("Введите второе значение: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Неверный ввод. Введите второе значение: ");
        }
        y = sc.nextDouble();
        addition(x, y);
    }

    public static void addition(double a, double b) {
        double sum;
        sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }
}