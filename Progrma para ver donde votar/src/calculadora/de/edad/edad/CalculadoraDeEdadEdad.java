/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.de.edad.edad;

import java.util.Scanner;
import java.util.Date;


/**
 *
 * @baesparza
 */
public class CalculadoraDeEdadEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Variables
        int edad;
        int a_nacimiento;
        int a_actual;
        
        //Inicializacion de variables
        a_actual = 2017;
                
        //Ingreso de datos
        System.out.print("Ingre su año de nacimiiento: ");
        a_nacimiento = input.nextInt();
        
        //Proceso
        //Calculamos la edad restando AA - AN
        edad = a_actual - a_nacimiento;
        
        //Salida
        //Aplicamos condicionales
        if (edad >= 18){
            System.out.println("Puede ir a votar.");
        } else {
            System.out.println("No puede ir a votar.");
        }
        System.out.println(edad);
        
    }
    
}
