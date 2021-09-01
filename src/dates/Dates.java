package dates;

import java.util.Scanner;

public class Dates {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int year = scanner.nextInt();
        int rsl = 0;
        if (first <= 12 && first == second) {
            rsl = 1;
        }
        if (first > 12 || second > 12) {
            rsl = 1;
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        Dates dates = new Dates();
        dates.solution();
    }
}
