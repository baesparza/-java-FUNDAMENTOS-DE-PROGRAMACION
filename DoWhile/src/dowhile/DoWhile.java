/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;

import java.util.Scanner;

/**
 *
 * @author baesparza
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        // Variables
        int i;
        
        //Procesos
        do{
            System.out.print("Desea Continuar? \n <Si = 1> <No = 0> :");
            i = input.nextInt();
        } while (i == 1);
        
        
    }
    
}
