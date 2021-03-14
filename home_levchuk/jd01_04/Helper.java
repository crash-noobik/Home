package home_levchuk.jd01_04;

public class Helper {
    static double[] getArray(String line) {
        String[] strArr = line.split(" ");
        double[] res = new double[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            res[i] = Double.parseDouble(strArr[i]);
        }
        return res;
    }

    static double findMin(double[ ] arr){

        double minArr = Double.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < minArr){
                minArr = arr[i];
            }
            System.out.println(arr[i]+" ");
        }

        return minArr;
    }
    static double findMax(double[ ] arr){
        double maxArr = Double.MIN_VALUE;
        for(int i=1;i < arr.length;i++){
            if(arr[i] > maxArr){
                maxArr = arr[i];
            }
        }
        return maxArr;

    }
    static void sort(double[] a) {
        for (int last = a.length - 1; last > 1; last--) {
            for (int i = 0; i < last; i++) {
                if (a[i] > a[i + 1]) {
                    double buf = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = buf;
                }

            }
        }


    }


}
