/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkgswitch;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class PracticaSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Variavles
        int departamento;
        
        //Ingreso de datos
        System.out.println("Ingres el departamento al que quiera ir:\n1)Desarrollo\n2)Recursos Humanos\n3)Finansas\n4)Mercadeo");
        departamento = input.nextInt();
        
        //switch
        switch(departamento){
            case (1):
                System.out.println("Redireccionando al departamento de Desarrollo...");
                break;
            case (2):
                System.out.println("Redireccionando al departamento de Recursos Humanos...");
                break;
            case (3):
                System.out.println("Redireccionando al departamento de Finansas...");
                break;
            case (4):
                System.out.println("Redireccionando al departamento de Mercadeo...");
                break;
            default :
                System.out.println("Departamento Invalido.");
                break;
        }
    }
    
}
