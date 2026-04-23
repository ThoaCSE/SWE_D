public class Task2 {
    public static void main(String[] args) {
        int maxN = 1000000;

        for (int i = 1; i < maxN; i++) {
            long n = i;

            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
            }
        }
        System.out.println("Done!");
    }
}