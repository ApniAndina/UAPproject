
package errorhandling;

/**
 *
 * @author ASUS
 */
public class BalokDenganException {
    private double panjang, lebar, tinggi;
    private static int jumlahObjek = ;
 
 public BalokDenganException(double panjang, double lebar, double tinggi){
  setPanjang(panjang);
  setLebar(lebar);
  setTinggi(tinggi);
  jumlahObjek++;
 }
 
 public static int getJumlahObjek() {
  return jumlahObjek;
 }
 
 //set dan get method untuk panjang balok
 public double getPanjang() {
  return panjang;
 }
 
 public void setPanjang(double panjang) 
   throws IllegalArgumentException {
     if (panjang >= )
      this.panjang = panjang;
     else
      throw new IllegalArgumentException ("Nilai panjang dari persegi panjang tidak boleh negatif");
 }
  
 //set dan get method untuk lebar balok
 public double getLebar() {
  return lebar;
 }
 
 public void setLebar(double lebar) 
   throws IllegalArgumentException  {
  if (lebar >= )
      this.lebar = lebar;
     else
      throw new IllegalArgumentException ("Nilai lebar dari persegi panjang tidak boleh negatif");   
 }
 
 //set dan get method untuk lebar balok
 public double getTinggi() {
  return tinggi;
 }
 
 public void setTinggi(double tinggi) {
  if (tinggi >= )
      this.tinggi = tinggi;
     else
      throw new IllegalArgumentException ("Nilai tinggi dari persegi panjang tidak boleh negatif");
    
 }
}
