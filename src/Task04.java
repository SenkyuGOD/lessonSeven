public class Task04 {

    public static void main(String[] args) {

        int n = 10;
        int[] m = new int[n];

        createArrayFibonacci(m);

        System.out.println("Ряд Фибоначчи: ");
        showArrayFibonacci(m);

    }

    public static int[] createArrayFibonacci(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i < 3) {
                a[i] = 1;
            } else {
                a[i] = a[i - 1] + a[i - 2];
            }
        }
        return a;
    }

    public static void showArrayFibonacci(int[] a) {
        for (int i: a) {
            System.out.print(i + " ");
        }
    }
}
