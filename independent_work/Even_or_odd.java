package independent_work;

import java.util.Scanner;

public class Even_or_odd {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите ввод");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x % 2 == 0)
            System.out.println("Число " + x + " четное");
        else
            System.out.println("Число " + x + " не четное");

    }
}
