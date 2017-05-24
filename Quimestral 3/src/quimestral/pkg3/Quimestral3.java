/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quimestral.pkg3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class Quimestral3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calcular el mayor menor y el intermedio
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        int n, j, temp, medio;
        int[] numeros;
        
        //Ingresos de datos
        System.out.print("Ingrese en numero de elementos a ingresar: ");
        n = input.nextInt();
        numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            System.out.print("Ingrese un numero: ");
            numeros[i] = input.nextInt();
            
        }
        
        // Procesos
        for (int i = 0; i < n; i++) {
            
           for (j = i; j < n; j++) {
               
            
               if (numeros[i] > numeros[j]) {
                   temp = numeros[j];
                   numeros[j] = numeros[i];
                   numeros[i] = temp;
               }
            
           } 
           
            
        }
        if (numeros.length % 2 != 0) {
            medio = numeros[(int)(n/2)];
        } else {
            medio = (int)(numeros[(int)(n/2 - 1)] + numeros[(int)(n/2)])/2;
        }
        
        
        // Salida de datos
        System.out.println(Arrays.toString(numeros));
        System.out.println("EL mayor es: "+ numeros[n-1]);
        System.out.println("EL menor es: "+ numeros[0]);
        System.out.println("EL medio es: "+ medio);
        System.out.print("Sucesion:");

        
        for (int min = numeros[0]; min <= numeros[n-1]; min = min + medio){
            System.out.print(" "+min);
        }
        
    }
    
}
