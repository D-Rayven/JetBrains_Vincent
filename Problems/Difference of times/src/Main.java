import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();

        int diff = 0;
        int diffS = 0;
        int diffM = 0;
        int diffH = 0;

        diffS = s1 - s2;
        diffM = (m1 - m2) * 60;
        diffH = (h1 - h2) * 3600;
        diff = diffS + diffM + diffH;

        System.out.print(Math.abs(diff));
        // put your code here
    }
}