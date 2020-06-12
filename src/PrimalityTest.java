public class PrimalityTest {
    public static boolean simple(int x) {
        int k = 0;
        for (int i = 2; i < x - 1; i++) {
            if (x % i == 0)
                k++;
        }
        return k <= 0;
    }

    public static void main(String[] args) {
        System.out.println(simple(377));
    }
}

