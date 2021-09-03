import java.util.Scanner;

public class Palindrome {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("");
        if (strings.length < 2) {
            System.out.println(0);
            return;
        }
        int rsl = 0;
        int mid = strings.length / 2;
        int odd = 0;
        if (strings.length % 2 != 0) {
            odd = 1;
        }
        for (int i = 0; i < mid; i++) {
            if (!strings[mid - i - 1].equals(strings[mid + i + odd])) {
                rsl++;
            }
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.solution();
    }
}
