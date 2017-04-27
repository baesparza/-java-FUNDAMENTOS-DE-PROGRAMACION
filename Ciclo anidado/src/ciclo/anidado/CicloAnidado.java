/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo.anidado;

/**
 *
 * @author baesparza
 */
public class CicloAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        int i, j, resultado = 1, total = 1, k;
        
        //Proceso
        i = 1; 
        while (i <= 6) {
            
            if (i % 2 != 0 ) {
                k = 1;
                while(k <= i){
                    total = total * k ;
                    k++;
                }
                j = total;
                
            } else {
                j = (7 - i);
            }
            
            
            resultado = resultado * (i + j);
            i++;
            
        }
        
        //Salida de datos 
        System.out.println("El resultado es "+ resultado);
    }
    
}
