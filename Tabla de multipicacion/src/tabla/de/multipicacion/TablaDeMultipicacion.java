/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla.de.multipicacion;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TablaDeMultipicacion {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Variables 
        int tabla, res, i;
        
        //Ingreso de datos 
        System.out.print("Ingrese la tabla que desee: ");
        tabla = input.nextInt();
        
        //Proceso e imprecion de datos
        i = 0;
        while (i <= 12) {
            res = tabla * i;
            System.out.println(tabla+" x "+i+" = "+res);
            i++;
        }

    }
    
}
