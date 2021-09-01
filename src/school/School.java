package school;

import java.util.Scanner;

public class School {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int pupil = scanner.nextInt();
        int[] array = new int[pupil];
        for (int i = 0; i < pupil; i++) {
            array[i] = scanner.nextInt();
        }
        int rslIndex = array.length / 2;
        int rsl = array[rslIndex];
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        School school = new School();
        school.solution();
    }
}
