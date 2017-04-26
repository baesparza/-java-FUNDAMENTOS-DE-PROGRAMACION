/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Variavles
        String dia;
        
        //Ingreso de datos
        System.out.print("Ingres el dia de la semana: ");
        dia = input.nextLine().toLowerCase();
        
        //switch
        switch(dia){
            case ("lunes"):
                System.out.println("Tienes Gestion Productiva todo el dia");
                break;
            case ("mArtes"):
                System.out.println("Tienes Contabilidad por la mañana.");
                break;
            case ("miercoles"):
                System.out.println("Tienes Programacion en la mañana.");
                break;
            case ("jueves"):
                System.out.println("Tienes Matematicas Discretas en la mañana.");
                break;
            case ("viernes"):
                System.out.println("Tienes Exprecion oral en la mañana.");
                break;
            default :
                System.out.println("Nada programado.");
                break;
        }
    }
    
}
