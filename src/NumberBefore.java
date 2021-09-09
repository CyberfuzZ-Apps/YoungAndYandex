import java.util.*;

public class NumberBefore {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>(100000);
        map.put(scanner.nextInt(), 0);
        System.out.println("NO");
        while (scanner.hasNextInt()) {
            if (map.putIfAbsent(scanner.nextInt(), 0) != null) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static void main(String[] args) {
        NumberBefore numberBefore = new NumberBefore();
        numberBefore.solution();
    }
}
