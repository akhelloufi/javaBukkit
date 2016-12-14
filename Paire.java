/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericite;

/**
 *
 * @author octobre2014
 */
public class Paire<T> {  
   T premier ;
   T second;
   public Paire (T a, T b){
      premier=a; second = b;  
   } 
   public T getPremier(){ 
      return  premier; 
   }
   
   public T getSecond(){ 
      return second;
   } 
}