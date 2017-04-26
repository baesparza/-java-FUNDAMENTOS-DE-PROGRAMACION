/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package iva;
import java.util.Scanner;

/**a
 * @baesparza
 */
public class Iva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner producto_cant = new Scanner(System.in);

        
        //Variables
        
        double iva = 0.14;
        
        int producto1_val = 5;
        int producto2_val = 7;
        int producto3_val = 2;
        
        int producto1_cant, producto2_cant, producto3_cant;
        
        int producto1_total, producto2_total, producto3_total;
        
        int total;
        double precio_final;
        
        //Ingreso del valor de cada uno de los productos
        System.out.print("Ingrese la cantidad de producto que compro del producto 1: ");
        producto1_cant = producto_cant.nextInt();
        System.out.print("Ingrese la cantidad de producto que compro del producto 2: ");
        producto2_cant = producto_cant.nextInt();
        System.out.print("Ingrese la cantidad de producto que compro del producto 3: ");
        producto3_cant = producto_cant.nextInt();
        
        //Procesos para la obtencion del precio por cada producto
        producto1_total = producto1_val * producto1_cant;
        producto2_total = producto2_val * producto2_cant;
        producto3_total = producto3_val * producto3_cant;
        
        //total a pagar y el precio final
        total = producto1_total + producto2_total + producto3_total;
        precio_final = total + (total * iva);
        
        //Salida
        System.out.print("El precio final a pagar es: "+precio_final+" ");
    }
}
