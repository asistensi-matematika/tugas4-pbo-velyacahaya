package tugasketiga;

import java.util.Scanner;

public class BangunDatarMain {

    public static void main(String[] args) {
        Scanner velya = new Scanner(System.in);
        System.out.println("Pilih bangun datar yang diinginkan : ");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.print("Masukkan pilihan Anda : ");
        int x = velya.nextInt();
        
        switch(x){
            case 1:
                System.out.print("Masukkan panjang sisi : ");
                double s = velya.nextDouble();
                Persegi a = new Persegi(s);
                a.view();
                break;
            case 2:
                System.out.print("Masukkan jari-jari : ");
                double r = velya.nextDouble();
                Lingkaran b = new Lingkaran(r);
                b.view();
                break;
            case 3:
                System.out.println("Pilih segitiga yang diinginkan : ");
                System.out.println("1. Segitiga Siku-Siku");
                System.out.println("2. Segitiga Sama Sisi");
                System.out.print("Masukkan pilihan Anda : ");
                int y = velya.nextInt();
                
                switch(y){
                    case 1:
                        System.out.print("Masukkan alas : ");
                        double alas = velya.nextDouble();
                        System.out.print("Masukkan tinggi : ");
                        double tinggi = velya.nextDouble();
                        Segi3Siku2 c = new Segi3Siku2(alas,tinggi);
                        c.view();
                        break;
                    case 2:
                        System.out.print("Masukkan panjang sisi : ");
                        double sisi = velya.nextDouble();
                        Segi3SamaSisi d = new Segi3SamaSisi(sisi);
                        d.view();
                }
        }
    }
}
