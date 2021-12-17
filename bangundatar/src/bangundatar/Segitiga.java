
package bangundatar;

import java.util.Scanner;

public class Segitiga extends Bangundatar {
    private int alas,tinggi, luas;
    public Segitiga(int alas, int tinggi, int luas){
        this.alas = alas;
        this.tinggi = tinggi;
        this.luas = luas;
    }

    Segitiga(String hasil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hitungluas (){
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan alas : ");
    alas = scan.nextInt();
    System.out.print("Masukkan tinggi : ");
    tinggi = scan.nextInt();
    luas = alas * tinggi/2;
    System.out.println("Luas Persegi Panjang adalah " + luas);
    }
}