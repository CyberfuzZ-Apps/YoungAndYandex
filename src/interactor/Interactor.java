package interactor;

import java.util.Scanner;

public class Interactor {
    public void solution() {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextByte(); // код завершения задачи
        int i = scanner.nextByte(); // вердикт интерактора
        int c = scanner.nextByte(); // вердикт чекера
        int rsl = -1;
        if (i == 0) {
            if (r != 0) {
                rsl = 3;
            } else {
                rsl = c;
            }
        } else if (i == 1) {
            rsl = c;
        } else if (i == 4) {
            if (r != 0) {
                rsl = 3;
            } else {
                rsl = 4;
            }
        } else if (i == 6) {
            rsl = 0;
        } else if (i == 7) {
            rsl = 1;
        } else {
            rsl = i;
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        Interactor interactor = new Interactor();
        interactor.solution();
    }
}
