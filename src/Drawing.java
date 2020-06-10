import java.util.Arrays;

public class Drawing {
    private char[][] draw;
    private int x;
    private int y;

    public Drawing(int x ,int y, char c) {
        this.x = x;
        this.y = y;
        draw = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                draw[i][j] = c;
            }
        }
    }

    public void print() {
        for (char[] i : this.draw) {
            for (char j : i) {
                System.out.print(j + "   ");
            }
            System.out.println('\n');
        }
    }

    public void setPoint(int x, int y, char c) {
        draw[x][y] = c;
    }

    public void drawVerticalLine(int column, int b, int e, char c) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if ( j == column && i >= b && i <= e) { draw[i][j] = c; };
            }
        }
    }

    public void drawHorizontalLine(int row, int b, int e, char c) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if ( i == row && j >= b && j <= e) { draw[i][j] = c; };
            }
        }
    }
}
