package independent_work;

import java.util.Scanner;

public class Totaltime {
    public static void main(String[] args) {
        Scanner scanT = new Scanner(System.in);
        int time = scanT.nextInt();
        int sec = time % 60;
        int m = (time - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int w = (d - day) / 7;
        System.out.println(w + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд ");


    }
}
