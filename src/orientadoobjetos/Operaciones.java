package orientadoobjetos;

import java.util.Scanner;

/**
 *
 * @author Edgar Andres
 */
public class Operaciones { // creamos una clase y creamos su constructor
    // declaramos las varibales

    float numero1;
    float numero2;
    float resultado;
    Scanner lector = new Scanner(System.in);

    public Operaciones() {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }
       
    

   

    void ingresarNumero(Operaciones o) {// creamos el metodo para ingresar los valores
        System.out.println("Ingrese el Primer numero: ");
        o.numero1 = lector.nextFloat();// colocar el objetos del parametro de la clase, para que se ejecute el programa
        
        System.out.println("Ingrese el Segundo numero");
        o.numero2 = lector.nextFloat();

    }

    // primero elegimos el objeto y luego el metodo a realizar
    void sumar(Operaciones o) {
        o.ingresarNumero(this);// ingresamos los numero especificos
        this.resultado = this.numero1 + this.numero2;// realizamos la operacion de la suma
        System.out.println("El resultado es: " + this.resultado);

    }

    void restar(Operaciones o) {
        o.ingresarNumero(this);// ingresamos los numero especificos
        this.resultado = this.numero1 - this.numero2;// realizamos la operacion de la suma
        System.out.println("El resultado es: " + this.resultado);

    }

    void multiplicar(Operaciones o) {
        o.ingresarNumero(this);// ingresamos los numero especificos
        this.resultado = this.numero1 * this.numero2;// realizamos la operacion de la suma
        System.out.println("El resultado es: " + this.resultado);

    }

    void dividir(Operaciones o) {
        o.ingresarNumero(this);// ingresamos los numero especificos
        this.resultado = this.numero1 / this.numero2;// realizamos la operacion de la suma
        System.out.println("El resultado es: " + this.resultado);

    }

}
