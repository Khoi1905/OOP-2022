public class Solution {
    private int numerator;
    private int denominator = 1;

    /**
     * get method.
     *
     * @return tu so
     */
    public int getNumerator() {
        return this.numerator;
    }

    /**
     * get method.
     *
     * @return mau so
     */
    public int getDenominator() {
        return this.denominator;
    }

    /**
     * set metho.
     *
     * @param numerator bien tu so
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * get method.
     *
     * @param dominator bien mau so
     */
    public void setDenominator(int dominator) {
        if (dominator != 0) {
            this.denominator = dominator;
        }
    }

    /**
     * contrustion method.
     *
     * @param numerator is num
     * @param dominator is dom
     */
    public Solution(int numerator, int dominator) {
        this.numerator = numerator;
        if (dominator != 0) {
            this.denominator = dominator;
        }
    }

    /**
     * ucln method.
     *
     * @param numerator is num
     * @param dominator is dom
     * @return ucln cua tu va mau
     */
    public static int gcd(int numerator, int dominator) {
        if (numerator < 0) {
            numerator = -numerator;
        }
        if (dominator < 0) {
            dominator = -dominator;
        }
        if (dominator == 0) {
            return numerator;
        }
        return gcd(dominator, numerator % dominator);
    }

    /**
     * toigian method.
     *
     * @return phansotoigian
     */
    public Solution reduce() {
        int i = gcd(this.numerator, this.denominator);
        if (this.numerator * this.denominator < 0) {
            setNumerator(-Math.abs(this.numerator / i));
            setDenominator(Math.abs(this.denominator / i));
        } else {
            setNumerator(Math.abs(this.numerator / i));
            setDenominator(Math.abs(this.denominator / i));
        }
        return this;
    }

    /**
     * phepcong method.
     *
     * @param a is a
     * @return this
     */
    public Solution add(Solution a) {
        setNumerator((this.numerator * a.denominator) + (a.numerator * this.denominator));
        setDenominator(this.denominator * a.denominator);
        return this.reduce();
    }

    /**
     * pheptru method.
     *
     * @param a is a
     * @return this
     */
    public Solution subtract(Solution a) {
        setNumerator((this.numerator * a.denominator) - (a.numerator * this.denominator));
        setDenominator(this.denominator * a.denominator);
        return this.reduce();
    }

    /**
     * phepnhan method.
     *
     * @param a is a
     * @return this
     */
    public Solution multiply(Solution a) {
        setNumerator(this.numerator * a.numerator);
        setDenominator(this.denominator * a.denominator);
        return this.reduce();
    }

    /**
     * phepchia method.
     *
     * @param a is a
     * @return this
     */
    public Solution divide(Solution a) {
        if (a.numerator != 0) {
            setNumerator(this.numerator * a.denominator);
            setDenominator(this.denominator * a.numerator);
        }
        return this.reduce();
    }

    /**
     * sosanh method.
     *
     * @param obj is abj
     * @return this
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return (this.numerator * other.denominator) == (this.denominator * other.numerator);
        }
        return false;
    }
}
