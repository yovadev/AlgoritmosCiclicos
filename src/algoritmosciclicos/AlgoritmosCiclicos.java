/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosciclicos;

/**
 *
 * @author Yova
 */
public class AlgoritmosCiclicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Impares
        for (int i = 0; i < 100; i++) {
            if (i%2 !=0) {
                System.out.println(i);
            }
        }*/
        
        /** Fibonacci **/
        
        int x=1;
        int anterior = 0;
        int temporal;
        while (true) { 
            System.out.println(x);
            temporal = x;
            x = x+ anterior;
            anterior = temporal;
            
            if (x >150)
                break;
        }
        
    }
    
}
