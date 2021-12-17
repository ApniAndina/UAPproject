
package loopingsegitiga;

import java.util.Scanner;

public class piramidabintang {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bintang;
        System.out.print("Masukkan jumlah baris bintang =");
        bintang = input.nextInt();
        if(bintang<=5&&bintang>0){
           for (int a=1;a<=bintang;a++){
             for(int b=1;b<=a;b++){
                 System.out.print(" ");
             }
             for(int c=bintang;c>=a;c--){
              System.out.print("*");
              }
             for(int d=bintang-1;d>=a;d--){
               System.out.print("*");
               }
             System.out.println("");
         } 
    }else if (bintang==0){
        System.out.println("Sytem Error");
    }else if (bintang>5){
        System.out.println("Input yang dilakukan berlebihan");
    }
}
}