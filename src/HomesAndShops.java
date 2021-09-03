import java.util.Scanner;

public class HomesAndShops {
    private final static int HOME = 1;
    private final static int SHOP = 2;

    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int[] avenue = new int[10];
        int countForward = 0;
        int countBack = 0;
        int rsl = 0;
        int tmp = 0;
        for (int i = 0; i < avenue.length; i++) {
            avenue[i] = scanner.nextInt();
        }
        for (int i = 0; i < avenue.length; i++) {
            if (avenue[i] == HOME) {
                for (int j = i + 1; j < avenue.length; j++) {
                    if (avenue[j] == SHOP) {
                        countForward = j - i;
                        break;
                    }
                    countForward = 0;
                }
                for (int j = i - 1; j >= 0; j--) {
                    if (avenue[j] == SHOP) {
                        countBack = i - j;
                        break;
                    }
                    countBack = 0;
                }
            }
            if (countForward > 0 && countBack > 0) {
                tmp = Math.min(countForward, countBack);
            } else {
                tmp = Math.max(countForward, countBack);
            }
            rsl = Math.max(tmp, rsl);
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        HomesAndShops homesAndShops = new HomesAndShops();
        homesAndShops.solution();
    }
}
