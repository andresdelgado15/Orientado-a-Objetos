package orientadoobjetos;

/**
 *
 * @author Edgar Andres Delgado
 */

 //clase
public class ClasePrincipal {   
 //atributos
    private final int numero1;
    private final int numero2;
    
// constructor de  ClasePrincipal de la clase
    public ClasePrincipal(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    // metodo de suma
public int suma (int numero1,int numero2)
{
    int resultado;
    resultado = numero1 + numero2;
  return resultado;// todos los metodos retornan un resultado
}






    public static void main(String[] args) {
        // creamos un nuevo objeto de la clase 
      ClasePrincipal nuevo = new ClasePrincipal(0,0);// declaracion de la instancia para usar sus ClasePrincipal o objetos
      /*
      Creamos un nuevo objeto de la clase
      inicializamos los parametros que le pasamos a la clase
      guardamos el objeto creado de la clase en una NUEVA VARIABLE
      COLOCAMOS PRIMERO EL OBJETO CREADO Y LUEGO. EL METODO AL QUE QUEREMOS LLEGAR
      COLOCAMOS LOS DATOS PARA QUE SE HAGA LA OPERACION.
      luego imprimimos le resultado  de la nueva varible
      
      */
      int solucion= nuevo.suma(5, 10);// guardamos el objeto en una nueva variable
      
        System.out.println("el resultado es " + solucion);
    }
    
}

   
