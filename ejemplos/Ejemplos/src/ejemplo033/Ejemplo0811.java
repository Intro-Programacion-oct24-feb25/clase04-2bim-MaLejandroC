/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo033;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo0811 {

    public static void main(String[] args) {
        // 
        
        Scanner entrada = new Scanner(System.in);

        String mensaje = "";
        int valor1;
        int valor2;
        
        System.out.print("Ingrese un limite:");
        valor1 = entrada.nextInt();
        System.out.print("Ingrese un tabla:");
        valor2 = entrada.nextInt();
        System.out.print("Ingrese la tabla a realizar (1)SUMA, "
                + "(2)MULTIPLICACION:");
        int valor3 = entrada.nextInt();
        
        switch (valor3) {
            case 1:
                mensaje = obtenerTablaSumar(valor1, valor2);
                break;
            case 2:
                 mensaje = obtenerTablaMultiplicar(valor1, valor2);
        }
        
        System.out.printf("%s\n", mensaje);
                                                      // obtenerTablaSumar
                                                       // y el valor que 
                                                       // devuelve se lo 
                                                       // almacena  en mensajeSuma
        
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
