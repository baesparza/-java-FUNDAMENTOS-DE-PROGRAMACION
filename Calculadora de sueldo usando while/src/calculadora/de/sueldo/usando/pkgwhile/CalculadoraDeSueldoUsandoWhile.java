/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.de.sueldo.usando.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class CalculadoraDeSueldoUsandoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        //Variables
        int n_empleados, horas, i, sueldo;
        
        //Ingreso de datos
        System.out.print("Ingrese el numero de empleados: ");
        n_empleados = input.nextInt();
        
        //Proceso
        i = 0;
        while (i <= n_empleados) {
            System.out.print("Ingrese el numero de horas trabajadas: ");
            horas = input.nextInt();
            
            sueldo = horas * 15;
            
            System.out.println("El empleado numero "+(i + 1)+" ha trabajado "+horas+" horas, y gana "+sueldo+" dolares.");
            i++;
        }
        
    }
    
}
