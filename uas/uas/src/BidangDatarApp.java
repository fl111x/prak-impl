import sesudahSolid.Lingkaran;
import sesudahSolid.Persegi;
import sesudahSolid.PersegiPanjang;
import sesudahSolid.Segitiga;

import java.util.Scanner;

public class BidangDatarApp {
    public static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Pilih bidang datar");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Segitiga");
        System.out.print("Opsi : ");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Masukan jari - jari lingkaran :");
            double jari_jari = scanner.nextDouble();
            Lingkaran lingkaran = new Lingkaran(jari_jari);

            option = opsiLuasKeliling();

            if (option == 1){
                System.out.println("Kelilling Lingkaran : " + lingkaran.getKeliling());
            }else if (option == 2){
                System.out.println("luas lingkaran : " + lingkaran.getLuas());
            }else {
                System.out.println("Opsi salah");
            }

        }else if (option == 2) {
            System.out.println("Masukan sisi persegi :");
            int sisi =  scanner.nextInt();
            Persegi persegi = new Persegi(sisi);

            option = opsiLuasKeliling();

            if (option == 1){
                System.out.println("Kelilling Persegi : " + persegi.getKeliling());
            }else if (option == 2){
                System.out.println("Luas Persegi : " + persegi.getLuas());
            }else {
                System.out.println("Opsi salah");
            }

        }else if (option == 3) {
            System.out.println("Masukan panjang :");
            int  panjang =  scanner.nextInt() ;
            System.out.println("Masukan lebar :");
            int  lebar =  scanner.nextInt();
            PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

            option = opsiLuasKeliling();

            if (option == 1){
                System.out.println("Kelilling Persegi Panjang : " + persegiPanjang.getKeliling());
            }else if (option == 2){
                System.out.println("Luas Persegi Panjang : " + persegiPanjang.getLuas());
            }else {
                System.out.println("Opsi salah");
            }

        }else if(option == 4) {
            System.out.println("Masukan alas :");
            int alas =  scanner.nextInt() ;
            System.out.println("Masukan tinggi :");
            int  tinggi =  scanner.nextInt();
            System.out.println("Masukan sisi miring :");
            int sisi =  scanner.nextInt();
            Segitiga segitiga = new Segitiga(alas, tinggi, sisi);

            option = opsiLuasKeliling();

            if (option == 1){
                System.out.println("Kelilling Persegi Panjang : " + segitiga.getKeliling());
            }else if (option == 2){
                System.out.println("Luas Persegi Panjang : " + segitiga.getLuas());
            }else {
                System.out.println("Opsi salah");
            }

        }else {
            System.out.println("Opsi salah");
        }
    }

    public static int opsiLuasKeliling(){
        System.out.println("Pilih hitung keliling atau luas");
        System.out.println("1. keliling");
        System.out.println("2. luas");
        System.out.print("Opsi : ");
        return scanner.nextInt();
    }

}