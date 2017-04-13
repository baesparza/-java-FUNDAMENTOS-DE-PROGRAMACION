/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terreno;
import java.util.Scanner;

/**
 * @baesparza
 */
public class Terreno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input= new Scanner(System.in);  
        
        //Variables 
        double largo, ancho, costo;
        
        double total;
        
        //Ingreso de datos 
        System.out.print("Ingrese el ancho del terreno: ");
        ancho = input.nextDouble();
        System.out.print("Ingrese el largo del terreno: ");
        largo = input.nextDouble();
        System.out.print("Ingrese el costo por metro cuadrado: ");
        costo = input.nextDouble();
        
        //Calcular Costo 
        total = (largo * ancho)* costo;
        
        //Salida 
        System.out.print("El costo del terreno es "+total);
        
    }
    
}