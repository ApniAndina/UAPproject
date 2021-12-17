package utp_prak;

import java.util.*;

public class Baju extends Induk {
    public int pilih;
    
    @Override
    public void Harga() {
        Scanner input = new Scanner (System.in);
        double harga;
        int jumlah;
        System.out.println("Menghitung total bayar Baju seharga 100.000");
        System.out.println("Masukkan jumlah beli :");
        jumlah = input.nextInt();
        harga= jumlah*100000;
        System.out.println("Total bayar harga baju adalah " +harga);
        System.out.println("========================================");
    }

    @Override
    public void Diskon() {
        Scanner input = new Scanner (System.in);
        double hargaBaju,diskon,hargaDiskon,hargaAkhir;
        System.out.println("Menghitung harga baju setelah diskon");
        System.out.println("Masukkan harga baju :");
        hargaBaju = input.nextInt();
        System.out.println("Harga barang adalah " +hargaBaju);
        System.out.println("Masukkan diskon baju :");
        diskon = input.nextInt();
        System.out.println("Diskon barang adalah " +diskon+"%");
        hargaDiskon = (hargaBaju * diskon/100);
        System.out.println("Jadi Harga diskon adalah " +hargaDiskon);
        hargaAkhir= hargaBaju - hargaDiskon;
        System.out.println("Jadi Harga Baju adalah " +hargaAkhir);
        System.out.println("========================================");
    }
    
    public void input(){
        Scanner input = new Scanner (System.in);
        System.out.println("Menghitung Harga Baju");
        System.out.println("1. Total bayar Baju seharga 100000");
        System.out.println("2. Total bayar Baju dengan diskon");
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
