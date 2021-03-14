package home_levchuk;

import java.util.Scanner;

public class Scannerisumiperevod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Создание сканера для ввода данных с клавиатуры;
        System.out.println("Введите первое число и нажмите ВВОД");
        int i = sc.nextInt();   // Ввод с клавиатуры первого числа;
        System.out.println("Введите второе число и нажмите ВВОД");
        int j = sc.nextInt();   // Ввод с клавиатуры второго числа;
        int sum = i + j;    // Математическое выражение с переменными;
        // Конвертация в BIN;
        String convert = Integer.toBinaryString(i);
        String convert1 = Integer.toBinaryString(j);
        String convert2 = Integer.toBinaryString(sum);
        // Конвертация в HEX;
        String convert3 = Integer.toHexString(i);
        String convert4 = Integer.toHexString(j);
        String convert5 = Integer.toHexString(sum);
        // Конвертация в OCT;
        String convert6 = Integer.toOctalString(i);
        String convert7 = Integer.toOctalString(j);
        String convert8 = Integer.toOctalString(sum);
        // Вывод данных;
        System.out.println("DEC" + ":" + i + "+" + j + "=" + sum);  // Вывод данных;
        System.out.println("BIN" + ":" + convert + "+" + convert1 + "=" + convert2);    // Вывод данных BIN;
        System.out.println("HEX" + ":" + convert3 + "+" + convert4 + "=" + convert5);   // Вывод данных HEX;
        System.out.println("OCT" + ":" + convert6 + "+" + convert7 + "=" + convert8);   // Вывод данных OCN;


    }

}
