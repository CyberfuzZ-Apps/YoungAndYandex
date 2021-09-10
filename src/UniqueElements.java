import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueElements {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (map.putIfAbsent(num, 1) != null) {
                map.put(num, map.get(num) + 1);
            }
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        UniqueElements uniqueElements = new UniqueElements();
        uniqueElements.solution();
    }
}
