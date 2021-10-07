import java.util.*;

/**
 * Класс SumsOfSegments
 *
 * Формат ввода:
 * В первой строке записано два целых числа n и q (1 ≤ n, q ≤ 3 ⋅ 10^5) -
 * размер массива и количество запросов.
 * Во второй строке записаны n целых чисел ai (1 ≤ ai ≤ 10^9) - сам массив.
 * Далее в q строках описаны запросы к массиву. Каждый запрос описывается двумя числами
 * l, r (1 ≤ l ≤ r ≤ n) - левой и правой границей отрезка, на котором нужно найти сумму.
 *
 * Формат вывода:
 * Для каждого запроса в отдельной строке выведите единственное число -
 * сумму на соответствующем отрезке.
 *
 * @author Evgeniy Zaytsev
 * @version 1.0
 */
public class SumsOfSegments {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        String[] sizeAndCount = scanner.nextLine().split(" ");
        int size = Integer.parseInt(sizeAndCount[0]);
        int count = Integer.parseInt(sizeAndCount[1]);
        List<Integer> list = new ArrayList<>(size);
        String[] array = scanner.nextLine().split(" ");
        for (String str : array) {
            list.add(Integer.parseInt(str));
        }
        for (int i = 0; i < count; i++) {
            String[] req = scanner.nextLine().split(" ");
            int left = Integer.parseInt(req[0]) - 1;
            int right = Integer.parseInt(req[1]) - 1;
            if (left == right) {
                System.out.println(list.get(left));
                continue;
            }
            long sum = 0;
            for (int j = left; j <= right; j++) {
                sum += list.get(j);
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        SumsOfSegments s = new SumsOfSegments();
        s.solution();
    }
}
