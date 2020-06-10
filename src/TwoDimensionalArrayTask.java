import java.util.Arrays;

public class TwoDimensionalArrayTask {
    public static void main(String[] args) {
        char[][] c = createTable(20, '.');
        printTable(c);

        System.out.println("============ Заполним строки: ==========");
        fillFirstAndLastLines(c, '#');
        printTable(c);

        System.out.println("============ Заполним столбцы: =========");
        fillFirstAndLastColumns(c, '#');
        printTable(c);
    }

    private static char[][] createTable(int k, char c) {
        char[][] table = new char[k][k];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                table[i][j] = c;
            }
        }
        return table;
    }

    private static void printTable(char[][] c) {
        int k = c.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.print('\n');
        }
    }

    private static void fillFirstAndLastLines(char[][] c, char c1) {
        int k = c.length;
        Arrays.fill(c[0], c1);
        Arrays.fill(c[k-1], c1);
    }

    private static void fillFirstAndLastColumns(char[][] c, char c1) {
        int k = c.length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (j == 0 || j == k-1) {c[i][j] = c1;}
            }
        }
    }


}
