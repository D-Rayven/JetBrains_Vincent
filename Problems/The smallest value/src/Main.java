import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        long m = scanner.nextLong();
        int n = 1;
        long facN = 1;

        while (facN <= m) {
            facN *= n;
            n++;
        }

        out.print(n - 1);
        // put your code here
    }
}