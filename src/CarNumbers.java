import java.util.*;

public class CarNumbers {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        List<String[]> lists = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            String[] tmp = scanner.nextLine().split("");
            lists.add(tmp);
        }
        int n = Integer.parseInt(scanner.nextLine());
        List<String> nums = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String tmp = scanner.nextLine();
            nums.add(tmp);
        }
        Map<String, Integer> rsl = new LinkedHashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < lists.size(); j++) {
                int count = 0;
                String[] tmp = lists.get(j);
                String key = nums.get(i);
                for (int k = 0; k < tmp.length; k++) {
                    if (key.contains(tmp[k])) {
                        count++;
                    }
                }
                if (count >= tmp.length || count >= key.length()) {
                    if (rsl.putIfAbsent(key, count) != null) {
                        rsl.replace(key, count + count);
                    }
                }
            }
        }
        int max = 0;
        for (String s : rsl.keySet()) {
            if (rsl.get(s) > max) {
                max = rsl.get(s);
            }
        }
        for (String s : rsl.keySet()) {
            if (rsl.get(s) == max) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        CarNumbers carNumbers = new CarNumbers();
        carNumbers.solution();
    }
}
