
package bangundatar;

public class MainBangunDatar {
    public void cekBangunDatar (Bangundatar mDatar){
        mDatar.hitungluas();
        mDatar.hasil();
    }
    
    public static void main(String[] args) {
        MainBangunDatar tBangunDatar = new MainBangunDatar();        
        
        tBangunDatar.cekBangunDatar(new Persegi("hasil"));       
        
        System.out.println("-----------------------------------------");                              
        tBangunDatar.cekBangunDatar(new Segitiga ("hasil"));
        
        System.out.println("-----------------------------------------");        
        tBangunDatar.cekBangunDatar(new Persegipanjang ("hasil"));
        
    }
}