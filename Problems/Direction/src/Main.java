import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int direction = scanner.nextInt();

        switch (direction) {
            case 0:
                out.println("do not move");
                break;
            case 1:
                out.println("move up");
                break;
            case 2:
                out.println("move down");
                break;
            case 3:
                out.println("move left");
                break;
            case 4:
                out.println("move right");
                break;
            default:
                out.println("error!");
                break;
        }
        // put your code here
    }
}