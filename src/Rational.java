public class Rational {
    private int n;
    private int d;

    public static final Rational ZERO = new Rational(0, 1);
    public static final Rational ONE = new Rational(1);

    public Rational(int n, int d) {
        this.n = n / gcd(n, d);
        this.d = d / gcd(n, d);
    }

    public Rational(int n) {
        this.n = n;
        this.d = 1;
    }

    public String toString() {
        if (d == 1) {
            return Integer.toString(n);
        }
        return n + "/" + d;
    }

    public double toDouble() {
        return (double) n / d;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int neutral = a % b;
            a = b;
            b = neutral;
        }
        return a;
    }

    public Rational add(Rational r2) {
        int numerator = this.n * r2.d + r2.n * this.d;
        int denominator = this.d * r2.d;
        return new Rational(numerator, denominator);
    }

    public Rational sub(Rational r2) {
        int numerator = this.n * r2.d - r2.n * this.d;
        int denominator = this.d * r2.d;
        return new Rational(numerator, denominator);
    }

    public Rational mul(Rational r2) {
        int numerator = this.n * r2.n;
        int denominator = this.d * r2.d;
        return new Rational(numerator, denominator);
    }

    public Rational div(Rational r2) {
        int numerator = this.n * r2.d;
        int denominator = this.d * r2.n;
        if (denominator != 0 && r2.n != 0) {
            denominator = this.d * r2.n;
        } else {
            System.out.println("На 0 делить нельзя!");
        }
        return new Rational(numerator, denominator);
    }

    static Rational add(Rational r1, Rational r2) {
        return r1.add(r2);
    }

    static Rational mul(Rational r1, Rational r2) {
        return r1.mul(r2);
    }

    static Rational sub(Rational r1, Rational r2) {
        return r1.sub(r2);
    }

    static Rational div(Rational r1, Rational r2) {
        return r1.div(r2);
    }

    public int getNumerator() {
        return n;
    }

    public int getDenominator() {
        return d;
    }
}
