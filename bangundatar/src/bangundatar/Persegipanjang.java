
package bangundatar;

import java.util.Scanner;

public class Persegipanjang extends Bangundatar {
    private int panjang,lebar, luas;
    public Persegipanjang(int panjang, int lebar, int luas){
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = luas;
    }

    Persegipanjang(String hasil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hitungluas (){
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan panjang : ");
    panjang = scan.nextInt();
    System.out.print("Masukkan lebar : ");
    lebar = scan.nextInt();
    luas = panjang * lebar;
    System.out.println("Luas Persegi Panjang adalah " + luas);
    }
}