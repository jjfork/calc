package pl.julianoo;

public class Fraction {
    private int fractionInteger;
    private int numerator;
    private int denominator;

    public Fraction(int value) {
        fractionInteger = value;
        numerator = 0;
        denominator = 1;
    }
    public Fraction(int fractionInteger, int numerator, int denominator) {
        // make denominator =/= 0

        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;

        this.fractionInteger = fractionInteger;
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Fraction(int numerator, int denominator) {

        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;

        if (numerator == denominator) {
            this.fractionInteger = 1;
            this.numerator = 0;
            this.denominator = 1;
        } else if (numerator > denominator) {
            this.fractionInteger = numerator / denominator;
            this.numerator = numerator % denominator;
            this.denominator = denominator;
        } else {
            this.fractionInteger = 0;
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }
    public double getFractionAsDecimal() {
        return fractionInteger + (double) numerator / denominator;
    }

    public String getFractionAsString() {
        if (denominator == 1) {
            return String.valueOf(fractionInteger);
        } else if (fractionInteger == 0) {
            return  numerator + "/" + denominator;
        } else {
            return fractionInteger + " " + numerator + " " + denominator;
        }
    }
    public Fraction add(Fraction fraction) {
        int n1 = this.numerator + this.fractionInteger * this.denominator;
        int d1 = this.denominator;
        int n2 = fraction.numerator + fraction.fractionInteger * fraction.denominator;
        int d2 = fraction.denominator;
        return new Fraction(n1 * d2 + n2 * d1, d1 * d2);
    }
    public Fraction subtract(Fraction fraction) {
        int n1 = this.numerator + this.fractionInteger * this.denominator;
        int d1 = this.denominator;
        int n2 = fraction.numerator + fraction.fractionInteger * fraction.denominator;
        int d2 = fraction.denominator;
        return new Fraction(n1 * d2 - n2 * d1, d1 * d2);
    }
    public Fraction multiply(Fraction fraction) {
        int n1 = this.numerator + this.fractionInteger * this.denominator;
        int d1 = this.denominator;
        int n2 = fraction.numerator + fraction.fractionInteger * fraction.denominator;
        int d2 = fraction.denominator;
        return new Fraction(n1 * n2, d1 * d2);
    }
    public Fraction divide(Fraction fraction) {
        int n1 = this.numerator + this.fractionInteger * this.denominator;
        int d1 = this.denominator;
        int n2 = fraction.numerator + fraction.fractionInteger * fraction.denominator;
        int d2 = fraction.denominator;
        return new Fraction(n1 * d2, d1 * n2);
    }

    /**
     * to shorten fractions
     */
    public static int gcd(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;

        while (a != b)
            if (a > b) a -=b;
            else b -=a;

            return a;
    }

}
