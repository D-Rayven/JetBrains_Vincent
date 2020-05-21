import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        System.out.print(line1.replace(" ", "").equals(line2.replace(" ", "")));
        // put your code here
    }
}