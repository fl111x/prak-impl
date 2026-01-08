package sesudahSolid;

public class Segitiga implements BidangDatar{
    private int a;
    private int b;
    private int c;

    public Segitiga(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double getKeliling(){
        return a + b + c;
    }

    @Override
    public double getLuas(){
        return 0.5 * a * b;
    }
}
