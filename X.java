/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericite;

/**
 *
 * @author octobre2014
 */ 
public class X {
   public <T>  void affiche(Paire<T> p){
      System.out.println(p);
   }
   
   public <T> T choix(T a, T b){
      return (int)(Math.random()*2)==1?a:b;
   }
   
   public static void main(String []a){ 
      Paire<String> ps = new  Paire<String>("un", "deux");   
      Paire<Integer> pi = new Paire<Integer>(1, 2);
      X x = new X(); 
      x.affiche(ps);
      x.affiche(pi);
      Number n = x.choix(new Integer(2), new Double(3.14159));
   }
}
