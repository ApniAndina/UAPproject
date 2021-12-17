/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorhandling;

/**
 *
 * @author ASUS
 */
public class JavaExceptionExample{  
  public static void main(String args[]){  
   try{  
      //code that may raise exception  
      String s="abc"; 
   }catch(NumberFormatException e){System.out.println(e);}  
   //rest code of the program   
   int i=Integer.parseInt(s);
  }  
}