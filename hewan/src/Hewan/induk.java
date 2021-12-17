
package Hewan;

public abstract class induk {
    public String nama;
    
    
     public abstract void menyusui();
     public abstract void menggonggong();
    
    public void bergerak(){
        System.out.println(" nama hewan bergerak " + nama);
    }
    
    public void display(){
        bergerak();
    }
}