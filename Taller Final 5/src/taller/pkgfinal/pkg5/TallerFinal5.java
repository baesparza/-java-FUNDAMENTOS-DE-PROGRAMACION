/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkgfinal.pkg5;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerFinal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer un número del 1 al 10 y traducirlos a números romanos equivalentes.
        Scanner input = new Scanner(System.in);
         
        // Variables
        int n;
        String romano = "";
         
        // Ingreso de datos
        do {
            System.out.print("Ingrese un numero del 1 al 10: ");
            n = input.nextInt();
        } while ( !((n >= 1) == (n <= 10)));
         
        // Proceso
        if (n == 10) {
            romano = romano + "X";
        }else if (n == 9) {
            romano = romano + "IX";
        } else if (n >= 5) {
            romano = romano + "V";
            for (int i = 5; i < n; i++) {
                romano = romano + "I";
            }
        } else if (n == 4) {
            romano = romano + "IV";
        } else {
            for (int i = 0; i < n; i++) {
                romano = romano + "I";
            }
        }
        
        // Salida de datos
        System.out.println("El numero "+n+" en romano es: "+romano);
    }
    
}
