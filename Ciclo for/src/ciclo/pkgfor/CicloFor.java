/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo.pkgfor;

import java.util.Scanner;

/**
 *
 * @author baesparza
 *LECCION 1:
 *(2*1)+(1*2)+(2*3)+(1*4)
 */
public class CicloFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Variables
        int result = 0;
        int state = 1;
        String result_str = "";
        int N;
        
        //Ingreso de datos
        System.out.print("Ingrese el valor de N: ");
        N = input.nextInt();
        
        //Procesos
        for (int i = 0; N >= i; i++) {
            result += (state * i);
            result_str = result_str +"("+state+"x"+i+")";
            if (i < N){
                result_str = result_str + "+";
            }
            if (state == 2) {
                state = 1;
            } else {
                state = 2;
            }
        }
        //Salida
        System.out.println(result_str);
        System.out.println(result);
            
    }
}


