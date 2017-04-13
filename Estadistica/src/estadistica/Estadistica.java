/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadistica;
import java.util.Scanner;

/**
 * @baesparza
 */
public class Estadistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner estatura_input= new Scanner(System.in);   
        
        //Variables
        double persona1, persona2, persona3, persona4, persona5; 
        
        double estatura, e_media;
        
        //Ingreso de datos
        System.out.print("Ingrese la estatura de la persona 1: ");
        persona1 = estatura_input.nextDouble();
        System.out.print("Ingrese la estatura de la persona 2: ");
        persona2 = estatura_input.nextDouble();
        System.out.print("Ingrese la estatura de la persona 3: ");
        persona3 = estatura_input.nextDouble();
        System.out.print("Ingrese la estatura de la persona 4: ");
        persona4 = estatura_input.nextDouble();
        System.out.print("Ingrese la estatura de la persona 5: ");
        persona5 = estatura_input.nextDouble();
        
        //Calcular media a partir de la duma de todas las estaturas
        estatura = persona1 + persona2 + persona3 + persona4 + persona5;
        e_media = estatura / 5;
        
        //Salida 
        System.out.println("la estatura total de todas las persona es de: "+estatura);
        System.out.println("la estatura media es de: "+e_media);
        
        
    }
    
}