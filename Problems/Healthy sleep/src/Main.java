import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (h >= a && h <= b) {
            System.out.println("Normal");
        } else if (h < a) {
            System.out.println("Deficiency");
        } else {
            System.out.print("Excess");
        }
        // put your code here
    }
}