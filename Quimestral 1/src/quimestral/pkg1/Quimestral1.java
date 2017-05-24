/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quimestral.pkg1;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class Quimestral1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // n = 5; (5!+1)/2 * 1/(4!+2) * (3!+3)/2 * 1/(2!+4) * (1!+5)/2
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        int swich = 2, cont, n;
        
        // Ingreso de datos
        System.out.print("Ingrese el valor de n: ");
        n = input.nextInt();
        
        
        // Procesos
        
        for (int i = 1; i <= n; i++) {
            
            if (swich == 2) {
                
                System.out.print("("+(n-i+1)+"!+"+i+")/"+swich);
                
                swich = 1;
                
            } else {
                
                System.out.print(swich+"/("+(n-i+1)+"!+"+i+")");
                
                swich = 2;
            }
            
            if (i < n) {
                
                System.out.print(" * ");
                
            }
            
        }
        
        System.out.println();
        
        
    }
        
    
}
