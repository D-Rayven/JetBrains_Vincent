import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int cen = number / 100;
        int dec = (number / 10) % 10;
        int uni = number % 10;

        System.out.print(cen + dec + uni);
        // put your code here
    }
}