/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package iva;
import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Iva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner producto1cant = new Scanner(System.in);
        Scanner producto2cant = new Scanner(System.in);
        Scanner producto3cant = new Scanner(System.in);
        
        //Variables
        
        double iva = 0.14;
        
        int producto1_val = 5;
        int producto2_val = 7;
        int producto3_val = 2;
        
        
        System.out.print("Ingrese la cantidad de producto que compro del producto 1: ");
        int producto1_cant = producto1cant.nextInt();
        System.out.print("Ingrese la cantidad de producto que compro del producto 2: ");
        int producto2_cant = producto2cant.nextInt();
        System.out.print("Ingrese la cantidad de producto que compro del producto 3: ");
        int producto3_cant = producto3cant.nextInt();
        
        
        int producto1_total = producto1_val * producto1_cant;
        int producto2_total = producto2_val * producto2_cant;
        int producto3_total = producto3_val * producto3_cant;
        
        int total = producto1_total + producto2_total + producto3_total;
        double precio_final = total + (total * iva);
        
        
        System.out.print("El precio final a pagar es: "+precio_final+" ");
    }
}
