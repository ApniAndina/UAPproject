package Hewan;


public class anak extends induk{ // inheritance -> pewarisan

    
    //polymorphisme
    @Override
    public void menyusui() {
        System.out.println("nama anak yang menyusui " + nama);
    }
    public void tampil(){
        menyusui();
        menggonggong();
    }

    @Override
    public void menggonggong() {
         System.out.println(nama + " menggonggong");
    }
}