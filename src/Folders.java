import java.util.*;

public class Folders {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int foldersCount = scanner.nextInt();
        if (foldersCount == 1) {
            System.out.println(0);
            return;
        }
        List<Integer> diplomas = new ArrayList<>(foldersCount);
        while (scanner.hasNextInt()) {
            diplomas.add(scanner.nextInt());
        }
        int max = Collections.max(diplomas);
        int sum = 0;
        for (Integer i : diplomas) {
            sum += i;
        }
        System.out.println(sum - max);
    }

    public static void main(String[] args) {
        Folders folders = new Folders();
        folders.solution();
    }
}
