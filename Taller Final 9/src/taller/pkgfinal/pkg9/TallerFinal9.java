/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkgfinal.pkg9;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class TallerFinal9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se desea calcular la distancia recorrida (m) por un auto que tiene velocidad constante (m/s) durante un tiempo, considerando que es movimiento rectilíneo uniforme.
        Scanner input = new Scanner(System.in);
        
        //Variables
        int velocidad, tiempo;
        double distancia;
        
        //Ingrso de datos
        System.out.print("Ingrese su velocidad: ");
        velocidad = input.nextInt();
        System.out.print("Ingrese su tiempo: ");
        tiempo = input.nextInt();
        
        //Procesos
        distancia = velocidad * tiempo;
        
        //Salidad de datos 
        System.out.println("La distancia recorrida es "+distancia+"m");
    }
    
}
