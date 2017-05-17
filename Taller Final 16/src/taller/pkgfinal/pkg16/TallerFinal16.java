/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkgfinal.pkg16;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerFinal16 {

    /**
     * @param args the command line arguments
     */
    
    public static int f_Factorial(int a){
	if (a == 1) {
            return 1;
        } else {
            return a * f_Factorial(a-1);
        }    
        
    }
    
    public static void main(String[] args) {
        // N=3 : 2! + 4! +6!
        
        Scanner input = new Scanner(System.in);
        
        //Variables
        int n, resultado = 0;
        
        //Ingreso de datos
        System.out.print("Ingrese el numero de elementos: ");
        n = input.nextInt();
        
        //Proceso
        for (int i = 2; i <= (n*2); i = i + 2) {
            resultado = resultado + f_Factorial(i);
            System.out.print((i)+"! + ");
        }
        
        System.out.println();
        //Salidad de datos
	System.out.println("Resultado: "+resultado);
    }
    
    
}
