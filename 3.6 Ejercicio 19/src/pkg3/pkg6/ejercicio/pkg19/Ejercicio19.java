/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg19;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
                
        //Variables
        double angulo, anguloRadianes;
        double sen, cos;
        
        //Ingreso de datos por el usuario
        System.out.print("Ingrese el tamaño del angulo en grados: ");
        angulo= input.nextDouble();
      
        //Operaciones
        //Convercion con formula
        anguloRadianes = angulo / 180 * Math.PI;
        sen = Math.sin(anguloRadianes);
        cos = Math.cos(anguloRadianes);
        
        //Salida
        System.out.println("El seno del angulo es: "+sen+"\nEl coseno del angulo es: "+cos);
            
    }
}