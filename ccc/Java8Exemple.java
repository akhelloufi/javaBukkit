/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java8exemple;

import java.nio.file.FileSystems;

/**
 *
 * @author octobre2014
 */
public class Java8Exemple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       long d= System.currentTimeMillis();
       int i=0;String s="";
       for (i=0;i<=100000;i++){
         s=s+"123456789";
       }
             
        long f= System.currentTimeMillis();
               System.out.println(f-d);
    }
}
