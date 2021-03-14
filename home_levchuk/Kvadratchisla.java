package home_levchuk;

import java.util.Scanner;

public class Kvadratchisla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // Создание сканера для ввода данных с клавиатуры;
        System.out.println("Введите число и нажмите ВВОД");
        int i = sc.nextInt();   // Оъбъявление переменной с присвоением ей значения из Scanner;
        int l = i * i;          // Оъбъявление переменной с присвоением ей значения i унмножить на i;
        System.out.println(l);  // Вывод данных;

    }
}
