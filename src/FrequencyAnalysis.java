import java.util.*;

public class FrequencyAnalysis {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        while (scanner.hasNext()) {
            String key = scanner.next();
            if (map.putIfAbsent(key, 1) != null) {
                map.replace(key, map.get(key) + 1);
            }
        }
        List<Pair> list = new ArrayList<>(map.size());
        for (String k : map.keySet()) {
            list.add(new Pair(k, map.get(k)));
        }
        List<Pair> rslList = new ArrayList<>(list.size());
        if (list.size() == 1) {
            rslList.add(list.get(0));
        }
        Collections.sort(list);
        Set<Pair> set = new HashSet<>(list);
        if (set.size() == list.size()) {
            for (Pair pair : list) {
                System.out.println(pair.key);
            }
            return;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).value != list.get(i + 1).value) {
                rslList.add(list.get(i));
                continue;
            }
            List<Pair> tmpList = new ArrayList<>(list.size());
            tmpList.add(list.get(i));
            while (i != list.size() - 1 && list.get(i).equals(list.get(i + 1))) {
                tmpList.add(list.get(++i));
            }
            Comparator<Pair> comparator = Comparator.comparing(o -> o.key);
            tmpList.sort(comparator);
            rslList.addAll(tmpList);
        }
        for (Pair pair : rslList) {
            System.out.println(pair.key);
        }
    }

    public static void main(String[] args) {
        FrequencyAnalysis f = new FrequencyAnalysis();
        f.solution();
    }


    private static class Pair implements Comparable<Pair> {
        String key;
        int value;

        public Pair(String key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(o.value, value);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair pair = (Pair) o;
            return value == pair.value;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }
    }
}
