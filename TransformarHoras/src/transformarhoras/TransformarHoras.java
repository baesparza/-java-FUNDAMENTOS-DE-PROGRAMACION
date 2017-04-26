/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transformarhoras;
import java.util.Scanner;
/**
 * @baesparza
 */
public class TransformarHoras {

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
        
        // Operaciones
        dias = horas / 24;
        minutos = horas * 60;
        segundos = horas * 3600;
               
        // Se muestra el resultado
        System.out.print("La cantidad de "+horas+" horas equivalen a:\n- "+dias+" dias\n- "+minutos+" minutos\n- "+segundos+" segundos.");
    }
    
}