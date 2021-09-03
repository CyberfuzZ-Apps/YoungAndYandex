import java.util.Scanner;

public class Benches {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int benchLength = scanner.nextInt();
        int benchMid = benchLength / 2;
        boolean even = benchLength % 2 == 0;
        int quantity = scanner.nextInt();
        int[] numbers = new int[quantity];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        if (quantity == 1) {
            System.out.println(numbers[0]);
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == benchMid && !even) {
                System.out.println(numbers[i]);
                return;
            }
            if ((numbers[i] == benchMid && even)
                    || (numbers[i] > benchMid)) {
                System.out.println(numbers[i - 1] + " " + numbers[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Benches benches = new Benches();
        benches.solution();
    }
}
