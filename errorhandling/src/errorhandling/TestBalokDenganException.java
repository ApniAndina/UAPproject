
package errorhandling;

/**
 *
 * @author ASUS
 */
public class TestBalokDenganException {
     public static void main(String[] args) {
  
  try{
   
   BalokDenganException balok1 = new BalokDenganException(8.7, 2.8, 1.7);
   BalokDenganException balok2 = new BalokDenganException(5.2, 3.6, 1.5);
   BalokDenganException balok3 = new BalokDenganException(3.9, 2.7, 1.7);
   BalokDenganException balok4 = new BalokDenganException(9.8, 6.7, 3.4);
   BalokDenganException balok5 = new BalokDenganException(-5.6, 3.9, 1.6);
  }
  catch(IllegalArgumentException ex){
   System.out.println(ex);
  }
  
  System.out.println("Jumlah objek yang dibuat: " +
    BalokDenganException.getJumlahObjek());
 }
}
