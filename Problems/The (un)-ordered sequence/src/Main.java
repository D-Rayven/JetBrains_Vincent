import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int value = scanner.nextInt();
        int tmp = scanner.nextInt();
        boolean res = true;

        while (value == tmp) {
            value = tmp;
            tmp = scanner.nextInt();

            if (tmp == 0) {
                break;
            }
        }

        if (value >= tmp) {

            while (scanner.hasNextInt()) {

                value = tmp;
                tmp = scanner.nextInt();

                if (tmp == 0) {
                    break;
                } else if (value < tmp) {
                    res = false;
                    break;
                }
            }
        } else if (value <= tmp) {

            while (scanner.hasNextInt()) {

                value = tmp;
                tmp = scanner.nextInt();

                if (tmp == 0) {
                    break;
                } else if (value > tmp) {
                    res = false;
                    break;
                }
            }
        }

        out.print(res);
        // put your code here
    }
}