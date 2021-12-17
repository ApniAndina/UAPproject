package gudang;

import java.util.Scanner;

public abstract class Gudang implements pergudangan {
    @Override
    public abstract void setData();
    @Override
    public abstract void tampil();
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public static void main(String[] args) {
        int menu=0,z=0,a,cari;
        barang[] data=new barang[1024];
        data[z]=new barang();
        data[z].setId();
        while(menu!=6){
            System.out.print("menu...\n1.input\t\t2.view\n3.search\t4.update\n5.delete\t6.exit\n : ");
            menu=data[0].in.nextInt();
            switch (menu) {
                case 1:
                    z++;
                    data[z]=new barang();
                    data[z].setId(data[z-1].getId());
                    data[z].setData();
                    break;
                case 2:
                    if(z<1)
                        System.out.println("data kosong");
                    else{
                        a=0;
                        while(a<z){
                            a++;
                            System.out.println("---"+a+"---");
                            data[a].tampil();
                        }
                    }   break;
                case 3:
                case 4:
                case 5:
                    System.out.print("masukkan id barang : ");
                    cari=data[0].in.nextInt();
                    a=1;
                    while(a<=z){
                        if(data[a].getId()==cari)
                            break;
                        a++;
                    }   if(a<=z){
                        if(menu==3)
                            data[a].tampil();
                        else if(menu==4){
                            data[a].tampil();
                            data[a].setData();
                        }
                        else{
                            while(a<z){
                                data[a]=data[a+1];
                                a++;
                            }
                            z--;
                            System.out.println("data "+cari+" berhasil dihapus");
                        }
                    }
                    else
                        System.out.println("data tidak ditemukan");
                    break;
                case 6:
                    System.out.println("keluar...");
                    break;
                default:
                    System.out.println("menu ilegal");
                    break;
            }
        }
    }
   
}
 

