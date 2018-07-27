package orientadoobjetos;

import java.util.Scanner;

/**
 *
 * @author Edgar Andres Delgado
 */
public class OperacionesPrincipales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner lector = new Scanner(System.in);
        Operaciones oper = new Operaciones();
        Operaciones pasar = new Operaciones();

        System.out.println("ingrese la opcion que desea hacer: \n"
                + "1. Sumar \n"
                + "2. Restar \n"
                + "3. Multiplicar \n"
                + "4. Dividir \n"
                + "5. Salir \n");
        opcion = lector.nextInt();
        
        switch (opcion) {
            case 1:
                oper.sumar(pasar);// le pasamos el objeto de oper "hacer la operacion del metodo que llamamos
                break;
            case 2:
                   oper.restar(pasar);
                break;
            case 3:
                   oper.multiplicar(pasar);
                break;
            case 4:
                   oper.dividir(pasar);
                break;
            case 5:
                System.out.println("Adios");
                break;
                default:
                System.out.println("La opcion que coloco no es correcta");
        }

    }

}
