/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkgfinal.pkg14;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerFinal14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 14. Crear un programa que permita ingresar 10 letras y luego me muestre cuantas vocales y cuantas consonantes.
        Scanner input = new Scanner(System.in);
        
        // Variables
        int letras = 10, vocales = 0, consonantes = 0;
        String letra = "";
                 
        // Ingreso de datos
        for (int i = 0; i < letras; i++) {
            System.out.print("Ingrese la letra "+(i + 1)+": ");
            letra = input.next();
            if ((("u".equals(letra)) || ("a".equals(letra)) || ("e".equals(letra)) || ("i".equals(letra)) || ("o".equals(letra)))) {
                vocales++;
            } else {
                consonantes++;
            }
        }
        
        //Salidad de datos
        if (vocales > 0) {
            System.out.println("Existen "+vocales+" vocales.");
        } 
        if (consonantes > 0) {
            System.out.println("Existen "+consonantes+" consonantes.");
        }
    }
    
}
