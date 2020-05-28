import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        String house = scanner.next();

        switch (house) {
            case "gryffindor":
                out.println("bravery");
                break;
            case "hufflepuff":
                out.println("loyalty");
                break;
            case "slytherin":
                out.println("cunning");
                break;
            case "ravenclaw":
                out.println("intellect");
                break;
            default:
                out.println("not a valid house");
                break;
        }
        // put your code here
    }
}