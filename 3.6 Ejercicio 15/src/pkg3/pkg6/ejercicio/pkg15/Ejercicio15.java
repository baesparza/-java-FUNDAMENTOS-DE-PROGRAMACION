/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg15;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Variables
        double dolares;
        double yenes, pesetas, libras, marcos;
        //Esta variable refiere al valor de un dolar en **  al 17/04/2017
        double Vyenes = 108.953; 
        double Vpesetas = 156.66; 
        double Vlibras = 0.80; 
        double Vmarcos = 1.84;  
        
        //Ingreso de datos
        System.out.print("Ingrese la cantidad de dolares que quiera transformar: ");
        dolares = input.nextDouble();
        
        //Proceso
        //Usamos una regla de 3
        yenes = dolares * Vyenes;
        pesetas = dolares * Vpesetas;
        libras = dolares * Vlibras;
        marcos = dolares * Vmarcos;

        //Salida
        System.out.println(dolares +" USD equivale a "+ yenes +" JPY, "+ pesetas +" ESP, "+ libras +" GBP, "+ marcos +" DEM.");
    }
    
}
