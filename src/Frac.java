
class Frac {

    double a, b;
    int z;

    String toString(String z) {
        return (a + " / " +  b);
    }

    Frac() {
        a = 0;
        b = 1;
    }

    Frac(double a, double b) {
        this.a = a;
        this.b = b;
        this.z = (int) (a / b);
    }
}