package home_levchuk;

import java.util.Scanner;

public class ConvertDaysToSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и нажмите ВВОД");
        int day = scanner.nextInt();
        int hour = 24, min = 60, sec = 60, res;
        res = day * hour * min * sec;
        System.out.println(res);
    }
}
