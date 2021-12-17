
package pboutp;

import java.util.Scanner;

public class PersegiPanjang implements BangunDatar {
    int panjang, lebar;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan panjang : ");
    panjang = scan.nextInt();
    System.out.print("Masukkan lebar : ");
    lebar = scan.nextInt();
    // constructor, masukkan panjang dan tinggi
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    PersegiPanjang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Luas() {
        double luas = panjang * lebar;
        return luas;
    }
    
}