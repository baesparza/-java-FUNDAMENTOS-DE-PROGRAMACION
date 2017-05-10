/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhileciclo;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class DoWhileCiclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        int cont = 2, res = 0, i = 1, n, x = 0;
        
        //Entrada de datos
        System.out.print("Ingrese el limite de la serie: ");
        n = input.nextInt();
        
        //Procesos
        do{
            x = (int)(Math.random() * n);
            System.out.println("numero: " + x);
        } while (x % 2 != 0);
        System.out.println("Numero seleccionado es: " + x);
    }
    
}
