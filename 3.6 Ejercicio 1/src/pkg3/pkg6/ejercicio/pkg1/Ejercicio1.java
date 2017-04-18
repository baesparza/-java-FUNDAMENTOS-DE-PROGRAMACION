/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @beesparza
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        //Variables
        int unidades;
        double costo_prod;
        double costo_mat = 3.5;
        
        // Ingreso de datos
        System.out.print("Ingrese el número de unidades: ");
        unidades = input.nextInt();

        
        // Operaciones
        costo_prod = unidades * costo_mat +10700;
        
        // Se muestra el resultado
        System.out.print("El costo de producción es de: $" +costo_prod);
                       
    }
    
}