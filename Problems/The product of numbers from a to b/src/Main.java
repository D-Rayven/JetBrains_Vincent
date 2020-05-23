import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long product = 1;

        for (long i = a; i < b; i++) {
          product = product * i;
        }

        out.print(product);
        // put your code here
    }
}