import java.util.List;

public class Week11 {
    /**
     * is.
     *
     * @param arr is
     * @param <T> is
     * @return is
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int j = i - 1;
            T key = arr.get(i);
            while (j >= 0 && arr.get(j).compareTo(key) > 0) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
        }
        return arr;
    }
}