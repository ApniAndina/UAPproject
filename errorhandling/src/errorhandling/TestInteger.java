
package errorhandling;
import java.util.Scanner;
public class TestInteger {
 public static void main(String[] args) {
  
 Scanner input = new Scanner(System.in);
 boolean lanjutkanInput = true;
  do{
    try{
    
     System.out.print("Masukkan nilai integer pertama: ");
     int angkaPertama = input.nextInt();
     System.out.println("Nilai integer pertama adalah: " + angkaPertama);
     System.out.print("Masukkan nilai integer kedua: ");
     int angkaKedua = input.nextInt();
     lanjutkanInput = false;
    
     System.out.println("Nilai integer kedua adalah: " + angkaKedua);
     System.out.println("Jumlah nilai integer adalah: " + (angkaPertama + angkaKedua));
     
    }
    
    catch (Exception ex){
     
     System.out.println("Silakan coba lagi. (" + "Input yang dimasukkan tidak sesuai: "
       + "nilai harus berupa integer!)");
     input.nextLine(); //Akan membuang input saat ini sehingga user dapat memasukkan input yang baru 
    }
  }while(lanjutkanInput); 
  } 
}
