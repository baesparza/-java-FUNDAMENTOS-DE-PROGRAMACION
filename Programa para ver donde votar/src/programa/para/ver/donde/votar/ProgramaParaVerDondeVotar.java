/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.para.ver.donde.votar
        
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @baesparza
 */
public class ProgramaParaVerDondeVotar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Variables
        int edad, a_nacimiento,a_actual;
        String ciudad_local, ciudad_votante; 
        
        //Inicializacion de variables
        a_actual = 2017;
        ciudad_local = "Loja";
                
        //Ingreso de datos
        System.out.print("Ingre su año de nacimiiento: ");
        a_nacimiento = input.nextInt();
        System.out.print("Ingre su ciudad actual: ");
        ciudad_votante = input.nextLine();
        
        //Proceso
        //Calculamos la edad restando AA - AN
        edad = a_actual - a_nacimiento;
        
        //Salida
        //Aplicamos condicionales
        if ((edad >= 18) == (ciudad_local.equals(ciudad_votante))){
            System.out.println("Puede ir a votar y esta en la ciudad actual.");
        } else {
            System.out.println("No puede ir a votar porque es menor de edad.");
        }
        System.out.println(edad);
        
    }
    
}
