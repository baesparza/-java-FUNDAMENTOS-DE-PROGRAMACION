/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        //Variables
        double dias, horas, minutos, segundos;
        
        // Ingreso de horas
        System.out.print("Ingrese la cantidad de horas: ");
        horas = input.nextDouble();
        
        //Operaciones
        dias = horas / 24;
        minutos = horas * 60;
        segundos = horas * 3600;
               
        //Salida
        System.out.println("La cantidad de "+horas+" horas equivalen a:\n- "+dias+" dias\n- "+minutos+" minutos\n- "+segundos+" segundos.");
    }
    
}
