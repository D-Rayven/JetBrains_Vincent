import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int heightOfBus = scanner.nextInt();
        int numberBridges = scanner.nextInt();

        int i;

        for (i = 0; i < numberBridges; i++) {
            int heightOfBridge = scanner.nextInt();

            if (heightOfBus >= heightOfBridge) {
                i++;
                out.println("Will crash on bridge " + i);
                break;
            }
        }

        if (i == numberBridges) {
            out.print("Will not crash");
        }
        // write your code here
    }
}