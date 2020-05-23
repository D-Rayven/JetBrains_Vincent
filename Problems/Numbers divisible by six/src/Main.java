import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 6 == 0) {
                sum = sum + num;
            }
        }

        out.println(sum);
        // put your code here
    }
}