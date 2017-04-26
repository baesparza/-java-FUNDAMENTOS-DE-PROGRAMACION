package aprobar.ciclo;

import java.util.Scanner;

/**
 *
 * @baesparza
 */
public class AprobarCiclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Variables
        double bimestre1, bimestre2, supletorio;
        
        //Ingreso de datos
        System.out.println("Ingrese");
        System.out.print("Nota del primeer bimestre: ");
        bimestre1 = input.nextDouble();
        System.out.print("Nota del segundo bimestre: ");
        bimestre2 = input.nextDouble();
        
        //Proceso-Salida
        if ((bimestre1 + bimestre2) >= 28) {
            System.out.println("Ha pasado El ciclo.");
        } else if (bimestre1 == bimestre2) {
            System.out.print("Ingrese el bimestre del Supletorio que va a dar: ");
            supletorio = input.nextDouble();
            if (supletorio == 1) {
                System.out.print("Ingrese el primer supletorio: ");
                bimestre1 = input.nextDouble();
            } else {
                System.out.print("Ingrese el segundo supletorio: ");
                bimestre2 = input.nextDouble();
            }
            if ((bimestre1 + bimestre2) >= 28) {
            System.out.println("Ha pasado El ciclo.");
            } else {
                System.out.println("No aprueba el ciclo.");
            }
            //En caso de no alcansar la nota pedimos la nota del supletorio
         } else {
            if (bimestre1 >= bimestre2) {
                System.out.print("Ingrese el primer supletorio: ");
                bimestre1 = input.nextDouble();
            }else if (bimestre1 <= bimestre2) {
                System.out.print("Ingrese el segundo supletorio: ");
                bimestre2 = input.nextDouble();
            }
            if ((bimestre1 + bimestre2) >= 28) {
            System.out.println("Ha pasado El ciclo.");
            } else {
                System.out.println("No aprueba el ciclo.");
            }
        }
    }
}
