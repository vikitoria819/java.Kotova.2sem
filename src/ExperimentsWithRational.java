public class ExperimentsWithRational {
    public static void main(String[] args) {
        Rational r1 = new Rational(36, 18);
        System.out.println(r1.toString());
        System.out.println(r1.toDouble());
        Rational r2 = new Rational(42, 16);
        System.out.println(r1.div(r2));
        System.out.println(f(20));


    }

    public static double f(int n){
        double sum = 0;
        for (int i = 1; i < n + 1; i++) {
            Rational r3 = new Rational(1, i);
            sum = sum + r3.toDouble();
        }
        return sum;
    }

}
