/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.usando.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class EjercicioUsandoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input =new Scanner(System.in);
        //Variables
        double n, m, total = 1, i = 1;

        //Ingreso de datos desde pantalla
        System.out.print("Ingrese un número: ");
        n = input.nextDouble();
        m = n;
        while(i <= n){
            total = total * ((m + i) / 2);
            m = m - 1;
            i++;
        }
        System.out.println("El total es: "+total);
    }
    
}
