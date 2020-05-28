import java.util.Scanner;
import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        String form = scanner.nextLine();

        switch (form) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double p = (a + b + c) / 2;
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                out.println(area);
                break;
            case "rectangle":
                double aRec = scanner.nextInt();
                double bRec = scanner.nextInt();
                out.println(aRec * bRec);
                break;
            case "circle":
                double r = scanner.nextInt();
                out.println(3.14 * Math.pow(r, 2));
                break;
            default:
                out.println("wrong form");
                break;
        }
        // put your code here
    }
}