    /**47 - Escreva um programa que calcule 
     * o resto da divisão de A por B (número inteiros e positivos), 
     * ou seja, A % B, através de subtrações sucessivas. 
     * Esses dois valores são passados pelo usuário através do teclado.
     */
package main;

import java.util.Scanner;


public class exercicio47 {
    

       Scanner armazena = new Scanner(System.in);
       
       int a = 0;
       int b = 0;
        
       
       System.out.println("Digite o valor de A: ");
       a = armazena.nextInt();

       System.out.println("Digite o valor de B: ");       
       b = armazena.nextInt();
       
       
        while(a >= b){
        a = a-b;
        

        
}       
     System.out.println("");    
     System.out.println(a);
     


       
       
} 