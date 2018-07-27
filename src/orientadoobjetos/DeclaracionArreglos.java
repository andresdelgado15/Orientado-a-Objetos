package orientadoobjetos;

import java.util.Arrays;

/**
 *
 * @author Declaracion de arrays
 */
public class DeclaracionArreglos {
    // int arreglo[] = new int[5];// cuando queremos declarar un tamaño

    int x;
    int y;
    int z;
    int w;

    public DeclaracionArreglos(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public int[] mostrar(int x, int y, int z, int w) {

        int[] arreglo = {x, y, z, w};
        return arreglo;
    }

    public int sumar(int x, int y, int z, int w) {
        int suma = 0;

        int[] arreglo = {x, y, z, w};
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

        }    
        return suma;    

    }
    
      public int tamañoArreglo(int x, int y, int z, int w) {

        int[] arreglo = {x, y, z, w};
        
           int vf = arreglo.length;
           
        return vf;
    }
      
     
    
    

    public static void main(String[] args) {
        int a=15;
        int b=82;
        int c = 21;
        int d =19;

        DeclaracionArreglos nuevo1 = new DeclaracionArreglos(0, 0, 0, 0);
        
        int[] respuesta = nuevo1.mostrar(a, b, c, d);
        System.out.println(" EL ARREGLO ES: " + Arrays.toString(respuesta));

        double resp = nuevo1.sumar(a, b, c, d);
        System.out.println(" El RESULTADO de la suma es: " + resp);
        
        double tamaño =nuevo1.tamañoArreglo(a, b, c, d);
        System.out.println("el tamaño del arreglo es: " + tamaño);
        
        double promedioF=resp/tamaño;
        System.out.println("El promedio del arreglo es :" + promedioF);
       

    }

}
