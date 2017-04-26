/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class Ejercicio7 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Variables
        float celcius;
        float fahrenheit;
        
        //Ingreso de datos
        System.out.print("Ingrese la temperatura en Celcius: ");
        celcius = input.nextFloat();
        
        //Proceso para tensformar a grados fahrenheit
        //Formula es F = (9 / 5) C + 32
        fahrenheit = (9 / 5) * celcius + 32;
        
        //Salida
        System.out.println("La equivalencia de "+ celcius +" grados Celcius equivalen a "+ fahrenheit +" grados Fahrenheit");
        
    }
    
}