import java.text.DecimalFormat;

public class Week4 {

    /**
     * timmax method.
     *
     * @param x1 is x1
     * @param x2 is x2
     * @return max
     */
    public static int max2Int(int x1, int x2) {
        return Math.max(x1, x2);
    }

    /**
     * timmin method.
     *
     * @param a is a
     * @return min
     */
    public static int minArray(int[] a) {
        int min = 10000;
        for (int j : a) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    /**
     * bmi method.
     *
     * @param m is cannang
     * @param h is chieucao
     * @return tinhtrang
     */
    public static String calculateBMI(double m, double h) {
        double BMI = m/(h*h);
        DecimalFormat df = new DecimalFormat("##.0");
        BMI = Double.parseDouble(df.format(BMI));
        if (BMI < 18.5) {
            return "Thiếu cân";
        } else {
            if (BMI >= 18.5 && BMI <= 22.9) {
                return "Bình thường";
            } else {
                if (BMI >= 23 && BMI <= 24.9) {
                    return "Thừa cân";
                }
            }
        }
        return "Béo phì";
    }
}