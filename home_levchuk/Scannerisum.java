package home_levchuk;

import java.util.Scanner;

public class Scannerisum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Создание сканера для ввода данных с клавиатуры;
        System.out.println("Введите первое число и нажмите ВВОД");
        int i = sc.nextInt();       // Ввод с клавиатуры первого числа;
        System.out.println("Введите второе число и нажмите ВВОД");
        int j = sc.nextInt();       // Ввод с клавиатуры второго числа;
        int sum = i + j;        // Математическое выражение с переменными;
        System.out.println("Sum" + " " + "=" + " " + sum);      // Вывод суммы;

    }

}
