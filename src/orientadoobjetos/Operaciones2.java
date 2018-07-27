
package orientadoobjetos;

import java.util.Scanner;

/**
 *
 * @author Edgar Andres Delgado
 */
public class Operaciones2 {

    public Operaciones2() {
    }
    
    // atributos
    float numero1 = 0;
    float numero2 = 0;
    float resultado = 0;
    Scanner entrada = new Scanner (System.in);
    

public void pedirValores (Operaciones2 o){
    System.out.println("Ingrese el Primer Numero ");
    o.numero1 = entrada.nextFloat();
    System.out.println("Ingrese el segundo numero ");
    o.numero2 = entrada.nextFloat();
    
    
}

void sumar(Operaciones2 o){
    o.pedirValores(this);
    this.resultado = this.numero1 + this.numero2;
    System.out.println("el resultado" + this.resultado );
    
}
void restar(Operaciones2 o){
    o.pedirValores(this);
    this.resultado = this.numero1 - this.numero2;
    System.out.println("el resultado" + this.resultado );
    
}
void multiplicar(Operaciones2 o){
    o.pedirValores(this);
    this.resultado = this.numero1 * this.numero2;
    System.out.println("el resultado"+ this.resultado );
    
}
void dividir(Operaciones2 o){
    o.pedirValores(this);
    float num3;
    this.resultado = this.numero1 / this.numero2;
   //num3 = this.resultado;
    System.out.printf("El resultado de la operacion es:");
    System.out.printf("%1.2f" , this.resultado );
   
    
   
    
}

    
}
