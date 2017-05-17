/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkgfinal.pkg17;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerFinal17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 17. N=4 : #, ##, ###, ####
        
        Scanner input = new Scanner(System.in);
        
        //Variables
        int n;
        String resultado = "";
        
        //Ingreso de datos
        System.out.print("Ingrese el numero de elementos: ");
        n = input.nextInt();
        
        //Proceso
        for (int i = 0; i < n; i++) {
            resultado = resultado + "#";
            System.out.print(resultado+", ");
        }
        
        System.out.println();
    }
    
}
