import java.util.Arrays;

public class ArraysTasks {
    public static int[] even(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = (i+1)*2;
        }
        return arr;
    }

    public static boolean hasSimilar(int[] a) {
        for (int i = 0; i < a.length ; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if (a[i]==a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int mean(int[] a) {
        int sum = 0;
        for (int value : a) {
            sum = sum + value;
        }
       return sum/a.length;
    }

    private static int[] sortReverse(int[] a) {
        int[] g = Arrays.copyOf(a, a.length);
        Arrays.sort(g);
        int[] f = Arrays.copyOf(a, g.length);
        int k = g.length;
        for (int i = 0; i < k ; i++) {
            f[i] = g[k-i-1];
        }
        return f;
    }

    public static void main(String[] args) {
//        int[] arr = even(8);
//        for (int s : arr)
//            System.out.println(s);
//        System.out.println(hasSimilar(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(mean(new int[]{1, 2, 3, 4, 5}));
        int[] arr_1 = sortReverse(new int[]{4, 6, 5, 64, 18});
        for (int k : arr_1)
            System.out.println(k);
    }
}
