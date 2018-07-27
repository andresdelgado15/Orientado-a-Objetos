
package orientadoobjetos;

import java.util.Scanner;

/**
 *
 * @author Edgar Andres Delgado
 */
public class OrientadoObjetos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaramos una nueva variable, para la opcion del menu
        int opcion;
        Scanner entrada = new Scanner (System.in);
        Operaciones2 op = new Operaciones2();
        Operaciones2 pasar = new Operaciones2();
        
        System.out.println(" seleccione lo que desea realizar: \n"
        + "1. Sumar \n"
        +"2. Restar  \n"
        +"3. Multiplicar \n"
        +"4. Dividir \n"
        +"5. salir \n");
        
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                op.sumar(op);
                break;                
                        
                  case 2:
                       op.restar(op);
                break;
                  case 3:
                       op.multiplicar(op);
                break;
                  case 4:
                       op.dividir(op);
                break;
                  case 5:
                      System.out.println("Gracias, que este bien. adios");
                break;
                default:
                    System.out.println("Esta opcion no es valida, lo siento");
                
        }
    }
    
}
