/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingsegitiga;

import java.util.Scanner;

public class Segitiga_Samasisi {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        int bintang,i,j,k;
        String cek;
        boolean ulang=true;
        
         System.out.println("\nCetak Segitiga Samakaki");
         System.out.println("==========================");
         
         while (ulang){
             Scanner baca = new Scanner(System.in);
             System.out.print("Masukkan jumlah bintang =");
             bintang = input.nextInt();
             
    if(bintang<=5&&bintang>0){
           for ( i=1;i<=bintang;i++){
             for( j=1;j<=i;j++){
                 System.out.print(" ");
             }
             for(int z=bintang;z>=i;z--){
              System.out.print("*");
              }
             for( k=bintang-1;k>=i;k--){
               System.out.print("*");
               }
             System.out.println("");
         } 
    }else if (bintang==0){
        System.out.println("Sytem Error");
    }else if (bintang>5){
        System.out.println("Input yang dilakukan berlebihan");
    }

    System.out.print("Mau diulang gak boss(Y/T)? ");
        cek = baca.next();

        if (cek.equalsIgnoreCase("Y")){
            ulang = true;
        } else if (cek.equalsIgnoreCase("T")){
            ulang = false;
        } else
            System.exit(0);
        }
    }
}
