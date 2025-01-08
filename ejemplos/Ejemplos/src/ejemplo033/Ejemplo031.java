/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo033;

import java.util.Scanner;
/*generar una solucion que permita sumar dos numeros atraves de un metodo, 
los numeros se ingresan por teclado en main, el metodo que genera la suma debe 
verificar que los dos numeros sean positivos para realizar la operacion, caso 
contrario debe devolver 0 como suma
/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        // 
        int valor1;
        int valor2;
        
        System.out.print("Ingrese un valor:");
        valor1 = entrada.nextInt();
        System.out.print("Ingrese un valor:");
        valor2 = entrada.nextInt();
        
        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
                                         // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);
        
        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }
    
    
    public static int obtenerSuma(int a, int b){
        int ab;
        if (a > 0 && b > 0) {
            ab = a + b;
        }else {
            ab = 0;
        }
        return ab;
        // return a + b;
    }
    
    
}
