
package errorhandling;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      
       while(true) {
        try {
          int a,b,hasil;
          
        System.out.print("Masukkan Bilangan pertama : ");
        a = input.nextInt();
        System.out.print("Masukkan Bilangan kedua : ");
        b = input.nextInt();
        hasil = a/b;
            System.out.println("Hasil "  + a + " / " + b + " = " +  hasil);
        }
        
        catch (ArithmeticException e){
            System.out.println("Salah nih, gabisa dibagi nol!");
        }
        
        catch(InputMismatchException e) {
            System.err.println("salah inputt!");
            break;
        }
        
        catch(Throwable e){
            System.out.println("Error lah intinyaa..");
        }
        
        finally {
            System.out.println("Selesai!");
        }
        
    }
    }
    
}
