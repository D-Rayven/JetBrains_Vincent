import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            out.print("YES");
        } else {
            out.print("NO");
        }
        // put your code here
    }
}