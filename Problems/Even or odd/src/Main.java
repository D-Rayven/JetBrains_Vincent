import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        do {
            int value = scanner.nextInt();

            if (value == 0) {
                break;
            } else if (value % 2 == 0) {
                out.println("even");
            } else {
                out.println("odd");
            }
        } while (true);

        // put your code here
    }
}