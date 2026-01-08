package sebelumSolid;

public class BidangDatar {
    private int panjang;
    private int lebar;
    private int sisi;
    private double jari_jari;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public double getJari_jari() {
        return jari_jari;
    }

    public void setJari_jari(int jari_jari) {
        this.jari_jari = jari_jari;
    }

    public int kelilingPersegi(){
        return 4 * this.sisi;
    }

    public int luasPersegi(){
        return  this.sisi * this.sisi;
    }

    public int kelilingPersegiPanjang(){
        return (2*this.panjang) + (2*this.lebar);
    }

    public int luasPersegiPanjang(){
        return this.lebar * this.panjang;
    }

    public double kelilingLingkaran(){
        return 2*3.14*this.jari_jari;
    }

    public double luasLingkaran(){
        return 3.14*this.jari_jari*this.jari_jari;
    }
}
