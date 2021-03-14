package home_levchuk.jd01_05;

import static java.lang.Math.*;


public class TaskD {
    public static void main(String[] args) {
        System.out.println("Массив A[]");
        double a=5.33;
        double b=9;
        int n=30;
        double ba=(b-a)/(n-1);
        for (int i = 0; i < n; i++) {
            double x=a+i*ba;
            double z=cbrt(pow(x,2)+4.5);
            System.out.printf("A[% -3d] = %-10.5f  ", i, z);
            if ((i + 1) % 5 == 0) {
                System.out.println();

            }
        }
    }

}