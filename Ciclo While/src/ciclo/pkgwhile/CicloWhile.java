/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo.pkgwhile;

/**
 *
 * @author baesparza
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 0;
        
        while (i <= 10) {
            if (i == 10) {
                break;
            }
            System.out.println("El valor es "+i);
            i++;
        }
    }
    
}
