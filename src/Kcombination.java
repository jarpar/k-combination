import java.util.Scanner;

public class Kcombination {

    public static int comb(int n, int k) {
        int comb;
        if (k == 0) {
            comb = 1;
        } else if (k > n) {
            comb = 0;
        } else {
            comb = comb((n - 1), k) + comb((n - 1), (k - 1));
        }
        return comb;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();
        System.out.println(comb(n, k));
    }
}