package home_levchuk;

import java.util.Scanner;

public class Weight1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int we = scanner.nextInt();
        double wm = getWeight(we);
        System.out.println(wm);
    }

    private static double getWeight(int we) {
        final double mars = 3.86;
        final double earth = 9.81;
        double wm = (we / earth) * mars;
        int we100 = (int) (wm * 100);
        if (wm * 100 - we100 < 0.5) {
            return we100 / 100.0;
        }

        return (we100 + 1) / 100.0;

    }
}
