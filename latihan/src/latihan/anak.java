
package latihan;

public class anak extends induk{ // inheritance -> pewarisan

    
    //polymorphisme
    @Override
    public void belajar() {
        System.out.println("yang mengajar adalah " + nama);
    }
    public void tampil(){
        belajar();
        mengajar();
    }

    @Override
    public void mengajar() {
         System.out.println(nama + " mengajar");
    }
}
