
package pboutp;

public class Segitiga implements BangunDatar {
    int alas, tinggi;
    // constructor, masukkan alas dan tinggi segitiga
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    Segitiga() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double Luas() {
    System.out.print("Masukkan alas : ");
    alas = scan.nextInt();
    System.out.print("Masukkan tinggi : ");
    tinggi = scan.nextInt();
        double luas = (alas * tinggi) / 2;
        return luas;
    }
}
