import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        String phrase = scanner.next();

        if (phrase.charAt(0) == 'J' || phrase.charAt(0) == 'j') {
            out.print("true");
        } else {
            out.print("false");
        }
        // put your code here
    }
}