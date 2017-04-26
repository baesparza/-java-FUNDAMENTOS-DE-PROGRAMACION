/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg17;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
                
        //Variables
        double anguloRadianes;
        double sen, cos, tan;
        double cot, sec, csc;
        
        // Ingreso de datos
        System.out.print("Ingrese el tamaño del angulo en radianes: ");
        anguloRadianes= input.nextDouble();
      
        // Operaciones
        sen = Math.sin(anguloRadianes);
        cos = Math.cos(anguloRadianes);
        tan = sen / cos;
        cot = cos / sen;
        sec = 1 / cos;
        csc = 1 / sen; 
        
        // Se muestra el resultado
        System.out.println("La tangente del angulo es: "+tan+"\nLa cotangente del angulo es: "+cot+"\nLa secante del angulo es: "+sec+"\nLa cosecante del angulo es: "+csc);
            
    }
}
