import java.io.*;
package errorhandling;

public class Test3 {
 public void methodA(){
 System.out.println("Method A");
 }
 public void methodB() throws IOException
 {
 System.out.println(20/0);
 System.out.println("Method B");
 }
}

class Utama
{
 public static void main(String[] args) throws IOException
 {
 Test3 c=new Test3();
 c.methodA();
 c.methodB();
 }
}