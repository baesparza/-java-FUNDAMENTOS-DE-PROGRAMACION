/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkgfinal.pkg4;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerFinal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dado 3 números, calcular el número mayor y el menor.
        Scanner input = new Scanner(System.in);

        //Variables
	int A, B, C;
	
	//Ingreso de datos por teclado 
	System.out.print("Ingrese el primer numero: ");
	A = input.nextInt();
	System.out.print("Ingrese el segundo numero: ");
	B = input.nextInt();
	System.out.print("Ingrese el tercer numero: ");
	C = input.nextInt();
	
	//Procesos
	//Para calcular el numero menor 
	if (( A < B ) && ( A < C )) {					
		System.out.println("El numero menor es "+A);			
	} else if (( B < A ) && ( B < C )) {			 
		System.out.println("El numero menor es "+B);			
	}else {										
		System.out.println("El numero menor es "+C);			
	}
        
        if (( A > B ) && ( A > C )) {				
		System.out.println("El numero mayor es "+A);
	} else if (( B > A ) && ( B > C )) {		 
		System.out.println("El numero mayor es "+B);
	}else {						
            System.out.println("El numero mayor es "+C);
	}
        
    }
    
}
