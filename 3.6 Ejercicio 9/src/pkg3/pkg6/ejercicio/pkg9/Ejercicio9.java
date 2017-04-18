/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg9;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
                
        // Creación de variables
        double costo, venta;
        double utilidad, iva;
        
        //Ingreso de datos
        System.out.print("Ingrese el costo del producto: ");
        costo = input.nextDouble();
        
        //Operaciones
        utilidad = costo * 1.5;
        iva = costo * 0.15;
        venta = costo + utilidad + iva;
               
        // Se muestra el resultado
        System.out.println("Tiene un impuesto de: $" + iva +"\nEl precio de venta es: $" + venta);
    }
    
} 
