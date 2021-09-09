import java.util.*;

public class NumberOfMatches {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        String[] s1 = scanner.nextLine().split(" ");
        String[] s2 = scanner.nextLine().split(" ");
        Map<String, Integer> map = new HashMap<>(s2.length);
        int count = 0;
        for (String s : s2) {
            if (map.putIfAbsent(s, 1) != null) {
                map.put(s, map.get(s) + 1);
            }
        }
        for (String s : s1) {
            if (map.containsKey(s)) {
                int value = map.get(s) - 1;
                if (value < 1) {
                    map.remove(s);
                }
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        NumberOfMatches numberOfMatches = new NumberOfMatches();
        numberOfMatches.solution();
    }
}
