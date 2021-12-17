public class Segitiga implements BangunDatar {
    int alas, tinggi;
    
    // constructor, masukkan alas dan tinggi segitiga
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas() {
        double luas = (alas * tinggi) / 2;
        return luas;
    }
}
