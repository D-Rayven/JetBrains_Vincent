import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(in);

        int l = 0;
        int value = scanner.nextInt();

        while (value > 0) {
            l++;
            value = scanner.nextInt();
        }

        out.print(l);
        // put your code here
    }
}