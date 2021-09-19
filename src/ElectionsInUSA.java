import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ElectionsInUSA {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(" ");
            if (map.putIfAbsent(line[0], Integer.parseInt(line[1])) != null) {
                map.replace(line[0], map.get(line[0]) + Integer.parseInt(line[1]));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String i : map.keySet()) {
            sb.append(i)
                    .append(" ")
                    .append(map.get(i));
            System.out.println(sb);
            sb.setLength(0);
        }
    }

    public static void main(String[] args) {
        ElectionsInUSA e = new ElectionsInUSA();
        e.solution();
    }
}
