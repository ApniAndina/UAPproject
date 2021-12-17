/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampulalulintas;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LampuLalulintas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inputkan angka : ");
        lampu = scan.nextline();
        
        switch(lampu){
            case "1":
                System.out.println("  * ");
                break;
            case "2":
                System.out.println(" ***");
                break;
            case "3":
                System.out.println("*****");
                break;
            default:
                System.out.println("Warna lampu salah !");
        }
    }
    
}
