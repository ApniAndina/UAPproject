package UTP;

import java.util.Scanner;

public abstract class Anak extends Induk implements Abstrak {
    
    int luas;
    int panjang;
    int lebar;
    int alas,tinggi;
    
    public Anak(String rms, String htg){
        super(rms, htg);
    }
    
    @Override
    public void HitungLuas() {
        System.out.println(Luas);
    }
    
    public void luas(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Masukkan Segitiga  : ");
        System.out.print("Alas        : ");
        alas=scan.nextInt();
        System.out.print("Tinggi        : ");
        tinggi=scan.nextInt();
        luas=(alas*tinggi)/2;
        System.out.println("Luas Segitiga adalah = "+luas);
        System.out.println("Masukkan Persegi Panjang  : ");
        System.out.print("Panjang        : ");
        panjang=scan.nextInt();
        System.out.print("Lebar         : ");
        lebar=scan.nextInt();
        luas=panjang*lebar;
        System.out.println("Luas persegi panjang adalah = "+luas);
    }

public void getdata() {
        HitungLuas();
        rumus();
        System.out.println("===============================");
        luas();
}
}
