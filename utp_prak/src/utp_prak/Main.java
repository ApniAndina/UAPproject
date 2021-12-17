
package utp_prak;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("============================");
        System.out.println("Harga baju, celana, dan tas");
        System.out.println("============================");
        
        Baju an;
        an = new Baju();
        an.input();
        an.display();
        
        Celana n;
        n = new Celana();
        n.input();
        n.display();
        
        Tas a;
        a = new Tas();
        a.input();
        a.display();
        
    }
}