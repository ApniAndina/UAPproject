
package prak3;

import java.util.Scanner;

public class main {

    public String nama;
    public Int nilai,bayar,diskon,belanjaan;
    
    public static void main(String[] args) {
        
        main m = new main ();
        m.inputan ();
        m.tampilan ();
    }
    
    public void inputan(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nama anda");
        nama = input.nextLine();
        System.out.println("nama anda " + nama);
        
        System.out.print(" masukan jumlah belanjaan ");
        belanjaan = input.nextInt();
       
        if (belanjaan >= 100000) {
            diskon = 25000;
        }
        else if (belanjaan >= 50000){
            diskon = 10000;
        }
        else {
            diskon = 0;
        }
        
    }
   
   public void tampilan(){
      bayar = belanjaan - diskon;
      System.out.println("Total yang harus anda baya adalah : " + bayar);
  }
}
