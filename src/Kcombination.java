import java.util.Scanner;

public class Kcombination {

    public static int comb(int n, int k) {
        if (k == 0) {
            return 1;
        } else if (k > n) {
            return 0;
        } else {
            return comb((n - 1), k) + comb((n - 1), (k - 1));
        }
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();
        System.out.println(comb(n, k));
    }
}