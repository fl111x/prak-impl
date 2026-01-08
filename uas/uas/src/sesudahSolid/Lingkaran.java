package sesudahSolid;

public class Lingkaran implements BidangDatar{
    private double jari_jari;

    public Lingkaran(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }

    @Override
    public double getLuas(){
        return Math.PI * jari_jari * 2;
    }

    @Override
    public double getKeliling(){
        return Math.PI * jari_jari * jari_jari;
    }
}
