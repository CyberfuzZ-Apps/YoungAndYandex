package pointandtriangle;

import java.util.Scanner;

public class PointAndTriangle {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int rsl;
        int mid = d / 2;
        if (x >= 0 && x <= d && y >= 0 && y <= d) {
            rsl = 0;
        } else {
            if (x > 0 && y < 0) {
                if (x > mid) {
                    rsl = 2;
                } else {
                    rsl = 1;
                }
            } else if (x < 0 && y < 0) {
                rsl = 1;
            } else if (x < 0 && y > 0) {
                if (y > mid) {
                    rsl = 3;
                } else {
                    rsl = 1;
                }
            } else {
                if (x >= y) {
                    rsl = 2;
                } else {
                    rsl = 3;
                }
            }
        }
        if (x == d && x == y) {
            rsl = 2;
        }

        System.out.println(rsl);
    }

    public static void main(String[] args) {
        PointAndTriangle pointAndTriangle = new PointAndTriangle();
        pointAndTriangle.solution();
    }
}
