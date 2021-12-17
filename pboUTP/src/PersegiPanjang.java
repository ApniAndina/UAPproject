public class PersegiPanjang implements BangunDatar {
    int panjang, lebar;
    
    // constructor, masukkan panjang dan tinggi
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        double luas = panjang * lebar;
        return luas;
    }
    
}