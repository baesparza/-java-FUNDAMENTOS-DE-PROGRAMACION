/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.pkg6.ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Variables
        double dolares, pesos;
        double valor = 18.5075511; //Esta variable refiere al valor de un dolar en pesos mx al 17/04/2017
        
        //Ingreso de datos
        System.out.print("Ingrese la cantidad de dolares que quiera transformar: ");
        dolares = input.nextDouble();
        
        //Proceso
        //Usamos una regla de 3
        //X mx = Numero usd * valor peso / 1 dolar
        pesos = dolares * valor / 1;

        //Salida
        System.out.println("El valor de "+ dolares +" dolares equivale a "+ pesos +" pesos.");
    }

}
