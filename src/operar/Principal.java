/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operar;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Yo_xd
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    int num1 = 5;
    int num2 = 8;
             
        public Principal(){
            
        Scanner lectura = new Scanner (System.in);
       
        System.out.println("Cuantos numeros desea sumar?");
        int max = lectura.nextInt();
        
        int [] conjunto = new int[max];
        String texto = "";
        int i = 0;
        int suma = 0;
        
            while(i < conjunto.length){
                System.out.println("Ingrese el numero "+(i+1)+" para sumar");
                int numero_leer = lectura.nextInt();
                conjunto[i] = numero_leer;// el menos uno para que el arreglo comience desde cero y no de errores
                    if(i==0){
                        texto = numero_leer+"";  // Esta condicion es para que no quede asi el texto +1+1
                            }
                    else{
                        texto = texto+"+"+numero_leer;  // Esta condicion es para que no quede asi el texto +1+1
                        }
             suma = suma + numero_leer;
             i++;
        }
            
        System.out.println(texto+"="+suma); 
        System.out.println("Desea ver el contenido del arreglo? S/N");
        String Pregunta = lectura.next();
            if("S".equals(Pregunta)){
               
                System.out.println("Aqui esta el arreglo:");
                System.out.println(Arrays.toString(conjunto));
                                    }
            else{
            System.out.println("Entonces adios");
            System.out.println("*C Cierra*");
                }
            
         }

    public static void main(String[] args) {
        new Principal();
 
    }
    
}
