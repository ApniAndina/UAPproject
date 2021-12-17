package loopingsegitiga;

import java.util.Scanner;

/**
 *
 * @author dhenandi
 */
public class Loopingsegitiga {
    public static void main(String[] args) {
        int i,j,k,l;
        int bintang;
        String cek;
        boolean ulang=true;
        
        while(ulang){
            Scanner baca = new Scanner(System.in);
            
            System.out.print("Bintangnya mau berapa boss? ");
            bintang = baca.nextInt();
            
            i=1;
            while (i<=bintang){
            j=bintang-1;
                while (j>=i){
                    System.out.print("  ");
                    j--;
                }
                
                k=1;
                while (k<=i){
                    System.out.print("* ");
                    k++;
                }
                
                l=1;
                while (l<=i-1){
                    System.out.print("* ");
                    l++;
                }
                
            i++;
            System.out.println();
            }
        System.out.print("");
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