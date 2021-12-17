public class LuasBangunDatar {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(12, 50);
        PersegiPanjang persegiPanjang = new PersegiPanjang(20, 30);
        System.out.println("luas segitiga dengan alas 12 dan tinggi 50 = "+segitiga.hitungLuas());
        System.out.println("luas persegi panjang dengan panjang 20 dan lebar 30 = "+persegiPanjang.hitungLuas());
    }
}