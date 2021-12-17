
package utp_prak;


import java.util.*;

public class Tas implements interfaceTas {
    public int pilih;
    
    @Override
    public double HargaTas() {
        Scanner input = new Scanner (System.in);
        double harga;
        int jumlah;
        System.out.println("Menghitung total bayar Tas seharga 150.000");
        System.out.println("Masukkan jumlah beli :");
        jumlah = input.nextInt();
        harga= jumlah*150000;
        System.out.println("Total bayar harga tas adalah " +harga);
        System.out.println("========================================");
        return 0;
    }

    @Override
    public double DiskonTas() {
        Scanner input = new Scanner (System.in);
        double hargaTas,diskon,hargaDiskon,hargaAkhir;
        System.out.println("Menghitung harga tas setelah diskon");
        System.out.println("Masukkan harga tas :");
        hargaTas = input.nextInt();
        System.out.println("Harga barang adalah " +hargaTas);
        System.out.println("Masukkan diskon tas :");
        diskon = input.nextInt();
        System.out.println("Diskon barang adalah " +diskon+"%");
        hargaDiskon = (hargaTas * diskon/100);
        System.out.println("Jadi Harga diskon adalah " +hargaDiskon);
        hargaAkhir= hargaTas - hargaDiskon;
        System.out.println("Jadi Harga tas adalah " +hargaAkhir);
        System.out.println("========================================");
        return 0;
    }
    public void input(){
        Scanner input = new Scanner (System.in);
        System.out.println("Menghitung Harga Tas");
        System.out.println("1. Total bayar tas seharga 150000");
        System.out.println("2. Total bayar tas dengan diskon");
        System.out.println("========================================");
        System.out.println("Masukan Pilihan : ");
        pilih = input.nextInt();
    }
    
    public void display() {
        switch(pilih){
            case 1:
                HargaTas();
            break;
            case 2:
                DiskonTas();
            break;
            default:
            System.out.println("Pilihan Tidak Ada! :(");
            System.out.println("============================");
        }
    }
}