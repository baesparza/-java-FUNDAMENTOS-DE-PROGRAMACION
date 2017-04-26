/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg13;

import java.util.Scanner;
import static java.lang.Math.PI;
import java.lang.Math;


/**
 *
 * @baesparza
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Variables
        double volumen, area;
        float radio;
        
        //Ingreso de datos
        System.out.print("Ingrese el radio del circulo para calcular el area: ");
        radio = input.nextFloat();
        
        //Procesos
        //Para calcular el volumen usamos la formula, VOLUMEN = (4 * pi * (r^3))/3
        
        volumen = Math.rint((PI * 4 * Math.pow(radio, 3)) / 3 * 100 ) / 100;

        //Para calvular el area, AREA = pi * (r ^ 2)
        
        area = Math.rint(PI * Math.pow(radio, 2) * 100 ) / 100;
        
        //Salida
        System.out.println("El volumen del circulo es "+ volumen +" u, y el area del Circulo es "+ area +" u.");
    }
    
}
