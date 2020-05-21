import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int i = 0; i < n; i++) {
            int note = scanner.nextInt();

            if (note == 5) {
                gradeA++;
            } else if (note == 4) {
                gradeB++;
            } else if (note == 3) {
                gradeC++;
            } else {
                gradeD++;
            }
        }

        out.print(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
        // put your code here
    }
}