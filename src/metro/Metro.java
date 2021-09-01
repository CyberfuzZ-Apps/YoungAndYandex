package metro;

import java.util.Scanner;

public class Metro {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextByte();
        int start = scanner.nextByte();
        int finish = scanner.nextByte();
        int rsl = Math.abs(finish - start) - 1;
        int mid = amount / 2;
        if ((!(start <= mid && finish <= mid || start > mid && finish > mid))
                && rsl >= mid) {
            int max = Math.max(start, finish);
            int min = Math.min(start, finish);
            rsl = amount - max + min - 1;
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        Metro metro = new Metro();
        metro.solution();
    }
}
