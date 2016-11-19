class Frac {
    int a, b;

    public String toString() {
        return (a + "/" + b);
    }

    Frac() {
        this.a = 0;
        this.b = 1;
    }

    Frac(int a) {
        this.a = a;
        this.b = 1;
    }

    Frac(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Frac sum(int a) {
        return (new Frac(this.a + this.b * a, this.b));
    }

    public Frac sum(Frac a) {
        return (new Frac((this.a * a.b + this.b * a.a), this.b * a.b));
    }

    public Frac mult(int a) {
        return (new Frac(this.a * a, this.b));
    }

    public Frac mult(Frac a) {
        return (new Frac(this.a * a.a, this.b * a.b));
    }

    public Frac div(int a) {
        return (new Frac(this.a, a * this.b));
    }

    public Frac div(Frac a) {
        return (new Frac(this.a * a.b, this.b * a.a));
    }

    public Frac inverse() {
        return (new Frac(this.b, this.a));
    }

    public boolean isDenumeratorZero() {
        return (this.b == 0);
    }

    boolean isShorten() {
        for (int i = a; i > 1; i--) {
            if (this.a % i == 0 & (this.b % i == 0)) {
                return true;
            }
        }
        return false;
    }

    public int digShorten() {
        for (int i = (this.a>this.b?this.a:this.b); i > 1; i--) {
            if (this.a % i == 0 & this.b % i == 0) {
                return i;
            }

        }
        return 1;
    }

    public Frac makeShort() {
        return (new Frac(this.a/digShorten(),this.b/digShorten()));
    }

    boolean isEqual(Frac a) {
        if(this.a * a.b - a.a * this.b == 0) return true;
        return false;
    }


}

/*
- метод, возвращающий равна ли дробь, переданной в параметрах isEqual(Frac a)
- метод int compareTo(Frac a), сравнивающий дробь с переданной в параметрах и возвращающий: -1 в случае. если меньше, 0 - если равна и 1 - если больше.
*/

