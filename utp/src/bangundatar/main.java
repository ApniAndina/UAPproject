package pkginterface;


public class Segiempat implements BangunDatarInterface {
    
    @Override
    public void getKliling() {
        
        System.out.println("Ini Keliling segiempat : "+ DATA_LUAS);
    }
    
    public static void main(Sting[] args){
        System.out.println(BangunDatarInterface.DATA_LUAS);
    }
}