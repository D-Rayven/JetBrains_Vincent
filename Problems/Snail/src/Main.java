import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int cpt = 1;

        while (h - a > 0) {
            h = h - a + b;
            cpt = cpt + 1;
        }

        System.out.print(cpt);
        // put your code here
    }
}