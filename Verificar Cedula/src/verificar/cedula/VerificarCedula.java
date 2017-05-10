/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificar.cedula;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class VerificarCedula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Variables
        String cedula;
        int sumatoria = 0, num = 2, diferencia, numero;
        
        //Ingreso de datos
        do {
            System.out.print("Ingrese un numero de cedula valido: ");
            cedula = input.next();
        } while (cedula.length() != 10);

        //Proceso para comprobar cedula
        for (int i = 0; i < cedula.length() - 1; i ++) {
            numero = ((cedula.charAt(i)) - 48) * num;
            if (numero >= 10)  {
                sumatoria += (Integer.toString(numero).charAt(0) - 48 + Integer.toString(numero).charAt(1) - 48);
            } else {
               sumatoria += numero; 
            }
            
            if (num == 2) {
                num = 1;
            } else {
                num = 2;
            }
            
        }
        
        //Pasamos al maximo superior y restamos
        diferencia = (int)(sumatoria - (sumatoria % 10) + 10);
        
        //Salida de datos
        if ((diferencia - sumatoria) == (cedula.charAt(9)) - 48){
            System.out.println("Es un numero de cedula valido");
        } else {
            System.out.println("No es un numero de cedula valido");
        }
        
    }
    
}
