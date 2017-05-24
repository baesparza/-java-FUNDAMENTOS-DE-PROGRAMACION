/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quimestral.pkg4;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class Quimestral4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Devolver el menor cambio posible
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        double precio, comprador, cambio;
        int centavos = 0, cinco = 0, dies = 0, veinticinco = 0, cincuenta = 0, dolar = 0;
        
        //Ingresos de datos
        System.out.print("Ingrese en precio del producto: ");
        precio = input.nextDouble();
        System.out.print("Ingrese las monedad del cliente del cliente: ");
        comprador = input.nextDouble();
        
        cambio = comprador - precio;
        
        // Proceso y salidad de datos
        if (cambio >= 1) {
            dolar = (int)(cambio / 1);
            cambio = cambio - (dolar * 1);
            System.out.println("Se debe pagar "+dolar+" monedas de dolar.");
        }
        if (cambio >= 0.50) {
            cincuenta = (int)(cambio / 0.5);
            cambio = cambio - (cincuenta * 0.50);
            System.out.println(cincuenta+" monedas de cincuenta centavos.");
        }
        if (cambio >= 0.25) {
            veinticinco = (int)(cambio / 0.25);
            cambio = cambio - (veinticinco * 0.25);
            System.out.println(veinticinco+" monedas de veinticinco centavos.");
        }
        if (cambio >= 0.10) {
            dies = (int)(cambio / 0.10);
            cambio = cambio - (dies * 0.10);
            System.out.println(dies+" monedas de dies centavos.");
        }
        if (cambio >= 0.05) {
            cinco = (int)(cambio / 0.05);
            cambio = cambio - (cinco * 0.05);
            System.out.println(cinco+" monedas de cinco centavos.");
        }
         if (cambio >= 0.01) {
            centavos = (int)(cambio / 0.01);
            System.out.println(centavos+" monedas de un centavo.");
        }
    }
    
}
