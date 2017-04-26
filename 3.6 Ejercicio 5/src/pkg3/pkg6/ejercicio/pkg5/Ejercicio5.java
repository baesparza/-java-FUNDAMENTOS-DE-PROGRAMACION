/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Variables
        int tiempo;
        double distancia;
        
        //Ingreso de datos
        System.out.print("Ingrese el tiempo en segundos: "); 
        tiempo = input.nextInt();
        
        //Proceso que calcula la distancia
        // Formula: distancia = velocidad * tiempo;
        distancia = 300000 * tiempo; //LA velocidad esta en km/s y el tiempo en s, reultado en km
        
        //Salida
        System.out.println("La distancia recorrida en "+tiempo+" segundos es: "+distancia+" Km ");
    }
    
}
