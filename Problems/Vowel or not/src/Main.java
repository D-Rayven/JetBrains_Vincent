import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        String vowel = "AEIOUaeiou";

        return vowel.indexOf(ch) != -1;

        // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}