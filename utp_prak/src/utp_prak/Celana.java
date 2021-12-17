
package utp_prak;


import java.util.*;

public class Celana extends Induk {
    public int pilih;
    
    @Override
    public void Harga() {
        Scanner input = new Scanner (System.in);
        double harga;
        int jumlah;
        System.out.println("Menghitung total bayar Celana seharga 200.000");
        System.out.println("Masukkan jumlah beli :");
        jumlah = input.nextInt();
        harga= jumlah*200000;
        System.out.println("Total bayar harga celana adalah " +harga);
        System.out.println("========================================");
    }

    @Override
    public void Diskon() {
        Scanner input = new Scanner (System.in);
        double hargaCelana,diskon,hargaDiskon,hargaAkhir;
        System.out.println("Menghitung harga Celana setelah diskon");
        System.out.println("Masukkan harga celana :");
        hargaCelana = input.nextInt();
        System.out.println("Harga barang adalah " +hargaCelana);
        System.out.println("Masukkan diskon celana :");
        diskon = input.nextInt();
        System.out.println("Diskon barang adalah " +diskon+"%");
        hargaDiskon = (hargaCelana * diskon/100);
        System.out.println("Jadi Harga diskon adalah " +hargaDiskon);
        hargaAkhir= hargaCelana - hargaDiskon;
        System.out.println("Jadi Harga Celana adalah " +hargaAkhir);
        System.out.println("========================================");
    }
    
    public void input(){
        Scanner input = new Scanner (System.in);
        System.out.println("Menghitung Harga Celana");
        System.out.println("1. Total bayar Celana seharga 200000");
        System.out.println("2. Total bayar Celana dengan diskon");
        System.out.println("========================================");
        System.out.println("Masukan Pilihan : ");
        pilih = input.nextInt();
    }
    
    public void display() {
        switch(pilih){
            case 1:
                Harga();
            break;
            case 2:
                Diskon();
            break;
            default:
            System.out.println("Pilihan Tidak Ada! :(");
            System.out.println("============================");
        }
    }
}
