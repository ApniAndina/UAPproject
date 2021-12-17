
package latihan;

public abstract class induk {
    public String nama;
    
    
     public abstract void belajar();
     public abstract void mengajar();
    
    public void guru(){
        System.out.println(" tugas guru " + nama);
    }
    
    public void display(){
        guru();
    }
}