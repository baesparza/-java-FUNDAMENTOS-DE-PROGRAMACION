/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkgfinal.pkg2;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerFinal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado un numero natural n, imprimir la lista de sus divisores en orden decreciente.
        Scanner input = new Scanner(System.in);
        
        // Variables
        int n;
        
        // Ingreso de datos
        System.out.print("Ingrese un numero n: ");
        n = input.nextInt();
        
        // Proceso
        for (int cont = 0; cont <n; cont++) {
            
            //Salida de datos
            System.out.print("Los numeros divisores de "+cont+" son: ");
            for (int i = 1; i <= cont; i++) {
                
                if (cont % i == 0) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
