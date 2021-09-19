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
                for (int k = 0; k < tmp.length; k++) {
                    if (nums.get(i).contains(tmp[k])) {
                        count++;
                    }
                }
                if (count != 0 && (count == tmp.length || count == nums.get(i).length())) {
                    if (rsl.putIfAbsent(nums.get(i), count) != null) {
                        String s = nums.get(i) + "#";
                        rsl.put(s, count);
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
                int index = s.indexOf("#");
                if (index != -1) {
                    s = s.substring(0, index);
                }
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        CarNumbers carNumbers = new CarNumbers();
        carNumbers.solution();
    }
}
