import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        String city = scanner.nextLine();

        out.print(city.endsWith("burg"));
        // put your code here
    }
}