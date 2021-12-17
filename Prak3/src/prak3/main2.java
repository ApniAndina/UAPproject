
package prak3;

import java.util.Scanner;

public class main2 {

    public String nama;
    public Int nilai;
    
    public static void main(String[] args) {
        
        main m = new main ();
        m.inputan ();
    }
    
    public void inputan(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan nama anda");
        nama = input.nextLine();
        System.out.print(" masukan jumlah perulangan ");
        nilai = input.nextInt();
       
        int i;
        for (i=1; i <=nilai; i++){
            System.out.println("nama anda adalah :" + nama);
        }
        
        int x = 0;
        do { 
            System.out.println("nilai x "+x);
            x++;
        }while (x<10);
    }
   
   //public void tampilan(){
      
  //}
}

