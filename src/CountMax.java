import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountMax {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int count = 0;
        while (scanner.hasNextLine()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            max = Math.max(num, max);
            list.add(num);
        }
        for (Integer i : list) {
            if (i == max) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        CountMax countMax = new CountMax();
        countMax.solution();
    }
}
