import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if (k > n * m) {
            out.print("NO");
        } else {
            if (k % n == 0 || k % m == 0) {
                out.print("YES");
            } else {
                out.print("NO");
            }
        }
        // put your code here
    }
}