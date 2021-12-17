
package errorhandling;


public class DemoThrow {

public static void main(String[] args) {
Barang obj = new Barang();
obj.setKode(null);
obj.setNama(“buku tulis”);
System.out.println(“\nKode : ” + obj.getKode());
System.out.println(“Nama : ” + obj.getNama());
}
}
