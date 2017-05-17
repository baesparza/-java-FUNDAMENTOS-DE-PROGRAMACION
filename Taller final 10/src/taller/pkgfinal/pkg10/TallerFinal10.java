/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkgfinal.pkg10;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerFinal10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarrollar un programa que permita ingresar el número de partidos ganados, 
        // empatados, perdidos, mostrar su puntaje sabiendo que una partido ganado
        // tiene 3 puntos, empatado 1 punto y perdido 0 puntos. 
        
        Scanner input = new Scanner(System.in);

        //Variables
	int ganados, empatados, perdidos, puntos;
	
	//Ingreso de datos por teclado 
	System.out.print("Ingrese los partidos ganados: ");
	ganados = input.nextInt();
	System.out.print("Ingrese los partidos empatados: ");
	empatados = input.nextInt();
	System.out.print("Ingrese los partidos perdidos: ");
	perdidos = input.nextInt();
        
        // Procesos
        puntos = (ganados * 3) + empatados;
        
        //Salida de datos
        System.out.println("La puntuacion final es "+puntos);
    }
    
    
}
