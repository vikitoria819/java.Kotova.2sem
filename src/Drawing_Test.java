public class Drawing_Test {
    public static void main(String[] args) {
        Drawing image = new Drawing(15, 15, '-');
//        image.print();
//        image.setPoint(2,4,'f');
        image.drawVerticalLine(3, 5, 9, '!');
        image.drawHorizontalLine(3, 5, 9, '!');
        image.print();

    }
}
