/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadordecreciente;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class ContadorDecreciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        int max, n, x = 0;
        double num;
        
        //Entrada de datos
        System.out.print("Ingrese un numero: ");
        n = input.nextInt();
        
        //Procesos
        max = (int) (((Math.floor(n / 10)) * 10) + 10);                      //Lo transformamos a decimal y lo redondeamos, Le sumamos 
        
        do{
            System.out.println(max);
            max -= 10;
        } while (max > 0);
        System.out.println(max);
    }
    
}
