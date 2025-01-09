/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo09 {

    public static void main(String[] args) {
        // 
        String mensajeSuma;
        String mensajeSumaDos;
        mensajeSuma = obtenerSuma(10, 9);
        mensajeSumaDos = obtenerSuma(10);
        String mensajeSumaTres = obtenerSuma(10, 9, 8);
        
        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", mensajeSumaDos);
        System.out.printf("%s\n", mensajeSumaTres);
    }
        
    public static String obtenerSuma(int operandor1, int operandor2){
        int suma;
        String cadena = "";
        suma = operandor1 + operandor2;
        cadena = String.format("%s%d\n", cadena, suma);
        return cadena;        
    }
    
    public static String obtenerSuma(int operandor1){
        int suma;
        String cadena = "";
        suma = operandor1 + operandor1;
        cadena = String.format("%s%d\n", cadena, suma);
        return cadena;  
     
        
    }
    
    public static String obtenerSuma(int operandor1, int operando2, int operando3){
        int suma;
        String cadena = "";
        suma = operandor1 + operando2 + operando3;
        cadena = String.format("%s%d\n", cadena, suma);
        return cadena;  
        
    }
    
}
