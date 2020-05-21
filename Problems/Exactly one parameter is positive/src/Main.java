import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean firstIsPositive = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean secondIsPositive = n1 <= 0 && n2 > 0 && n3 <= 0;
        boolean thirdIsPositive = n1 <= 0 && n2 <= 0 && n3 > 0;

        boolean onlyOneIsPositive = firstIsPositive || secondIsPositive || thirdIsPositive;

        System.out.print(onlyOneIsPositive);
        // put your code here
    }
}