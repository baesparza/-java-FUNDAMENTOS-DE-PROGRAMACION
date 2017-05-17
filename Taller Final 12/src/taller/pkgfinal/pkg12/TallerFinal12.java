/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkgfinal.pkg12;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerFinal12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un programa que pida la edad de 10 personas y muestre 
        // cuantos son menores de edad y la media
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        int personas = 10, edad, menores = 0, edad_total = 0;
                 
        // Ingreso de datos
        for (int i = 0; i < personas; i++) {
            System.out.print("Ingrese la edad de la persona "+(i + 1)+": ");
            edad = input.nextInt();
            if (edad < 18) {
                menores++;
            }
            edad_total = edad_total + edad;
        }
        
        //Salidad de datos
        if (menores > 0) {
            System.out.println("Existen "+menores+" menores de edad.");
        }
        System.out.println("La edad media es: "+ (edad_total/personas));
    }
    
}
