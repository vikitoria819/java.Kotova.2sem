import java.util.Arrays;
public class SieveOfEratosthenes {
    public static boolean[] arr_era(int n) {
        boolean[] arr = new boolean[n+1];
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i < n+1; i++) {
            arr[i] = isSimple(i);
        }
        return arr;
    }

    public static boolean isSimple(int x) {
        int k = 0;
        for (int i = 2; i < x - 1; i++) {
            if (x % i == 0)
                k++;
        }
        return k <= 0;
    }

    public static void main(String[] args) {
        boolean[] arr = arr_era(7);
        for (boolean b : arr) {
            System.out.println(b);
        }
    }


}