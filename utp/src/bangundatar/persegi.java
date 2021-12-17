
package bangundatar;

public class Segitiga extends BangunDatar {
    private Integer alas;
    
    @Override
    public void getKeliling(){
        System.out.println("Ini adalah keliling segitiga");
    }
    
    @Override
    public void getLuas(){System.out.println("ini adalah luas segitiga");}
    
    public static void main(String[]args){
        Segitiga s = new Segitiga();
        s.luas = 7;
        s.getLuas();
        s.getKeliling();
    }
}