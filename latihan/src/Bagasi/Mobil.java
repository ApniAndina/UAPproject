
package Bagasi;

public class KelasMotor extends JenisMotor{
   
    String warna;
    int silinder;
   
    public void warna (String cat)
    {
        warna=cat;
        System.out.println("Kapatitas Mesin = "+warna);
    }
   public void silinder (int piston)
   {
       silinder=piston;
       System.out.println("Silinder Motor = "+silinder);
       }
 
}