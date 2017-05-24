/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quimestral.pkg2;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class Quimestral2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // -++---++++-----
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        int n;
        Boolean plus = false;
        
        //Ingresos de datos
        System.out.print("Ingrese en numero de elementos 'n': ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 0; j < i; j++) {
                
                if (plus) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
                
            }
            
            plus = !plus;
        }
        System.out.println();
        
    }
    
}
