package independent_work;

import java.util.Scanner;

public class Two_or_three {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите ввод");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if (x % 2 == 0)
            System.out.println("Число " + x + " кратное 2");
        if (x % 3 == 0)
            System.out.println("Число " + x + " кратное 3");
        else
            System.out.println(x + " другое");
    }
}
